<%--
  Created by IntelliJ IDEA.
  User: kamil
  Date: 30.03.2017
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administration page</h1>

            <p class="lead">Welcome in administration page! </p>
        </div>
        <h3>
            <a href="<c:url value="/admin/productInventory" />"> Product inventory</a>
        </h3>

        <p>Here you can view, check and modify the product inventory</p>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
