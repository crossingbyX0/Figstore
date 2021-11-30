<%-- 
    Document   : orderDetail
    Created on : Jul 14, 2021, 11:49:23 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Order Detail </title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            .img-responsive{
                width: 100px;
                height: 150px;
            }
            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;

            }
            #detail{
                margin: 0 auto;
                width: 80%;
                color: white;
                min-height: 650px;

            }
            @media (max-width: 1200px) { 
                #detail{
                    width: 60%; 
                    margin: auto;
                    min-height: 500px;
                }
                .table{
                    font-size: 20px;
                }

            }

        </style>

    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="detail">
            <div class="container mb-4">
                <div class="row">
                    <div class="col-12">
                        <div class="row mt-2 mb-2">
                            <div class="col-5">
                                <p style="font-size: 20px;">Order Date: ${requestScope.order.date}</p>

                                <p>Status: <span style="font-weight: bold; text-transform: uppercase; color: darkgreen">Delivered</span></p>

                            </div>
                            <c:if test="${sessionScope.account.role == 'admin'}">
                                <div class="col-6">
                                    <p>Username: ${requestScope.customer.userName}</p>
                                    <p>Address: ${requestScope.customer.address}</p>
                                    <p>Phone: ${requestScope.customer.phone}</p>
                                </div>
                            </c:if>
                        </div>
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                        <th scope="col"> </th>
                                        <th scope="col" class="text-center">Tên sản phẩm</th>

                                        <th scope="col" class="text-center">Số lượng</th>
                                        <th scope="col" class="text-right">Đơn giá</th>
                                        <th scope="col" class="text-right">Thành tiền</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${requestScope.list}" var="item">
                                        <tr>
                                            <td class="text-center"><img class="img-responsive" src="images/${item.product.image}" /> </td>
                                            <td>${item.product.name}</td>

                                            <td style="text-align: center">${item.quantity}</td>
                                            <td class="text-right">$<fmt:formatNumber type="number" maxFractionDigits="2" value="${item.price}"/></td>
                                            <td class="text-right">$<fmt:formatNumber type="number" maxFractionDigits="2" value="${item.price*item.quantity}"/></td>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>

                                        <td>Sub-Total</td>
                                        <td class="text-right">$<fmt:formatNumber type="number" maxFractionDigits="2" value="${requestScope.order.totalMoney}"/></td>
                                    </tr>

                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>

                                        <td><strong>Total</strong></td>
                                        <td class="text-right">$<fmt:formatNumber type="number" maxFractionDigits="2" value="${(requestScope.order.totalMoney)*102/100}"/></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <%@include file="footer.jsp" %>  
    </body>
</html>
