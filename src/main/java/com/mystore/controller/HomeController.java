package com.mystore.controller;

import com.mystore.dao.ProductDao;
import com.mystore.model.Product;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by surinKim
 * 2019.07.27 -> admin/productInventory error!
 * I changed prouctPrice -> productPrice so error occurred -> error solved with table drop and recreate.
 * and path package import error is solved by update pom.xml (maven-compiler-plugin)
 */

@Controller
public class HomeController {

    @Autowired
    private ProductDao productDao;
    private Path path;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){
        List<Product> products=productDao.getAllProducts();
        model.addAttribute("products",products);
        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId,Model model) throws IOException {
        Product product=productDao.getProductById(productId);
        model.addAttribute(product);

        return "viewProduct";
    }

    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/admin/productInventory")
    public String productInventory(Model model){
        List<Product> products=productDao.getAllProducts();
        model.addAttribute("products",products);

        return "productInventory";
    }

    //  When didn't specify method, default method is "GET"
    @RequestMapping("/admin/productInventory/addProduct")
    public String addProduct(Model model){
        Product product=new Product();
        product.setProductCategory("instrument");
        product.setProductCondition("new");
        product.setProductStatus("active");

        model.addAttribute("product",product);
        return "addProduct";
    }

    //to get model post attribute, we need to use @ModelAttribute tag
    @RequestMapping(value="/admin/productInventory/addProduct", method= RequestMethod.POST)
    public String addProductPost(@ModelAttribute("product")Product product, HttpServletRequest request){
        productDao.addProduct(product);
        MultipartFile productImage=product.getProductImage();
        String rootDirectory=request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDirectory+"/WEB-INF/resources/image/"+product.getProductId()+".png");

        if(productImage!=null &&!productImage.isEmpty()){
            try {
                System.out.println("파일 변환");
                productImage.transferTo(new File(path.toString()));
            }catch (Exception e){
                e.printStackTrace();
                throw new RuntimeException("Product image save failed!",e);
            }
        }
        //what is difference with redirect and return just address?
        //redirct to admin/productInventory means call upper RequestMapping
        return "redirect:/admin/productInventory";
    }

    //  When didn't specify method, default is GET
    @RequestMapping("/admin/productInventory/deleteProduct/{id}")
    public String deleteProduct(@PathVariable String productId, Model model){
        productDao.deleteProduct(productId);
        return "redirect:/admin/productInventory";
    }
}
