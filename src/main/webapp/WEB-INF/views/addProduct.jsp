<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product!</p>
        </div>


        <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" commandName="product"
        enctype="multipart/form-data">
            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="productName" id="name" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="category">Category</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="instrument"></form:radiobutton>Instrument</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="record"></form:radiobutton>Record</label>
                <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="accessory"></form:radiobutton>Accessory</label>
            </div>

            <div class="form-group">
                <label for="description">description</label>
                <form:textarea path="productDescription" id="description" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="price">Price</label>
                <form:input path="productPrice" id="price" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="condition">Condition</label>
                <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new"></form:radiobutton>New</label>
                <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used"></form:radiobutton>Used</label>
            </div>

            <div class="form-group">
                <label for="status">Status</label>
                <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active"></form:radiobutton>Active</label>
                <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive"></form:radiobutton>Inactive</label>
            </div>

            <div class="form-group">
                <label for="unitInStock">Unit In Stock</label>
                <form:input path="unitInStock" id="unitInStock" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="manufacturer">Manufacturer</label>
                <form:input path="productManufacturer" id="manufacturer" class="form-Control"/>
            </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Image</label>
            <form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
        </div>

        <br><br>

        <input type="submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory/addProduct" />" class="btn btn-default">Cancel</a>

    </form:form>
<%@include file="/WEB-INF/views/template/footer.jsp"%>