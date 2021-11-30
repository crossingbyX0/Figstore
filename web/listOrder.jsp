<%-- 
    Document   : listOrder
    Created on : Jul 15, 2021, 12:42:58 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check ORDER</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            #adminOrder{
                margin: auto;
                width: 80%;
            }
              body{
                background-image: url('images/bgTopSell.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: cover;
                min-height: 500px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="adminOrder">


            <div class="table-responsive mx-auto col-10" >
                <h3 style="color: red; margin-bottom: 20px; text-align: center;">${requestScope.title}</h3>
                <table class="table table-striped table-bordered">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">Order ID</th>
                            <th scope="col">Order Date</th>

                            <th scope="col">Payment</th>

                            <th scope="col">Total</th>
                            <th scope="col">Status</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="o" items="${requestScope.olist}">
                            <tr>
                                <td>${o.id}</td>
                                <td>${o.date}</td>

                                <td>
                                    <fmt:formatNumber pattern="###,###.###" value="${o.totalMoney}"/>đ
                                </td>

                                <td>
                                    <fmt:formatNumber pattern="###,###.###" value="${(o.totalMoney *102)/100}"/>đ
                                </td> 
                                <td><span style="font-weight: bold; text-transform: uppercase; color: darkgreen">Delivered</span></td>
                                <td style="text-align: center"><a href="odetail?oid=${o.id}"><button class="btn btn-primary">Detail</button></a></td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
                <div style="margin: 50px 0 50px;">
                    
                </div>
        <%@include file="footer.jsp" %>  
    </body>
</html>
