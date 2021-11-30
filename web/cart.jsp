<%-- 
    Document   : cart
    Created on : Jul 6, 2021, 9:03:30 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>YOUR CART</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


        <style>
            #Ycart{
                width: 60%;
                margin: auto;
                color: white;
                min-height: 600px;
            }
            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
                margin: auto;


            }
            @media (max-width: 1200px) { 
                #Ycart{
                    width: 100%; 
                    margin: auto;

                    min-height: 500px;
                }
                .table th{
                    background-color: black;
                }


            }


        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="Ycart">
            <div class="container_C mb-4">
                <div class="row">
                    <div class="col-12">
                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col"> </th>
                                        <th scope="col">Product Name</th>
                                        <th scope="col" class="text-center">Quantity</th>
                                        <th scope="col" class="text-right">Price</th>
                                        <th scope="col" class="text-right">Total</th>
                                        <th> </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${sessionScope.cartlist}" var="item">
                                        <tr>
                                            <td><img class="img-responsive" src="images/${item.product.image}" width="100px" height="150px"/> </td>
                                            <td><a href="detail?kit=${item.product.id}" style="text-decoration: none;">${item.product.name}</a></td>
                                            <td>
                                                <form action="change">
                                                    <input size="1" class="form-control" type="number" id="quantity" 
                                                           name="quantity" min="1" max="${item.product.quantity}" value="${item.quantity}" 
                                                           onchange="this.form.submit()"/>
                                                    <input type="text" name="id" value="${item.product.id}" style="display: none">
                                                </form>
                                            </td>
                                            <td class="text-right"><fmt:formatNumber type="number" maxFractionDigits="2" value="${item.price}"/></td>
                                            <td class="text-right"><fmt:formatNumber type="number" maxFractionDigits="2" value="${item.price*item.quantity}"/></td>
                                            <td class="text-right"><a href="remove?id=${item.product.id}"><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button> </a></td>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td>Tạm tính</td>
                                        <td class="text-right"><fmt:formatNumber type="number" maxFractionDigits="2" value="${sessionScope.total}"/></td>
                                    </tr>

                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td><strong>Tổng cộng</strong></td>
                                        <td class="text-right"><strong><fmt:formatNumber type="number" maxFractionDigits="2" value="${(sessionScope.total*102)/100}"/></strong></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col mb-2">
                        <div class="row">
                            <div class="col-sm-12  col-md-6">
                                <button class="btn btn-block btn-light" onclick="location.href = 'list';">Tiếp tục mua hàng</button>
                            </div>
                            <div class="col-sm-12 col-md-6 text-right">
                                <button class="btn btn-lg btn-block btn-success text-uppercase" onclick="location.href = 'checkout?cart=${sessionScope.cart}';">Thanh toán</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>              
    </body>
</html>
