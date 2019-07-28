<%@include file="/WEB-INF/views/template/header.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Le
  Date: 1/2/2016
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator page</h1>

            <p class="lead">This is the administrator page!</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/productInventory" />" > Product Inventory</a>
        </h3>

        <p>Here you can view, check and modify the product inventory!</p>
<%@include file="/WEB-INF/views/template/footer.jsp"%>