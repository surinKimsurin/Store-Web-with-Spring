<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>



<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product detail</h1>
            <p class="lead">here is the detail information of the product</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="img" style="width:100%; height:300px" />
                </div>
                <div class="col-mid-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>

                    <p>
                        <strong>Manufacturer</strong> : ${product.productManufacturer}
                    </p>
                    <p>
                        <strong>Category</strong> : ${product.productCategory}
                    </p>

                    <p>
                        <strong>Condition</strong> : ${product.productCondition}
                    </p>

                    <p>
                        <strong>Price</strong> : ${product.productPrice}
                    </p>
                </div>
            </div>
        </div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>