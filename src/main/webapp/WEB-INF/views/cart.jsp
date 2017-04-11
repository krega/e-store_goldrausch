<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kamil
  Date: 11.04.2017
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>



                    <p>All the selected products ub your shopping cart</p>
                </div>
            </div>
        </section>
        <section class="container" ng-apps = "cartApp">
            <div ng-controller = "cartCtrl" ng-init="initCartId('${cartId}')">
                <a class="btn btn-danger pull-left"><span class="glyphicon glyphicon-remove-sign"></span> Clear Cart</a>
            <div>
            <table class="table table-hover">
                <tr>
                    <th>Product</th>
                    <th>Unit Product</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
                <tr ng-repeat = "item in cart.cartItems">
                    <td>{{item.product.productName}}</td>
                    <td>{{item.product.productPrice}}</td>
                    <td>{{item.quantity}}</td>
                    <td>{{item.totalPrice}}</td>
                    <td><a href="#" class="label label-danger" ng-click="removeFromCart(item.product.productId)">
                        <span class = "glyphicon glyphicon-remove"></span>remove</a> </td>
                </tr>
                <tr>
                    <th></th>
                    <th></th>
                    <th>Grand Total</th>
                    <th>grandTotal</th>
                    <th></th>
                </tr>
            </table>
                <a href="<spring:url value="/productList"/> ">Continue Shopping </a>
            </div>
        </section>
    </div>
</div>





<%@include file="/WEB-INF/views/template/footer.jsp" %>