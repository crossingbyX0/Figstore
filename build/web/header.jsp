<%-- 
    Document   : header
    Created on : Jun 8, 2021, 10:52:22 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


        <style>
            #header{
                background-color: wheat;
            }
            .header-area {
                background: none repeat scroll 0 0 #f4f4f4;
            }
            .header-area a {
                color: #888;
            }
            .user-menu ul {
                list-style: outside none none;
                margin: 0;
                padding: 0;
            }
            .user-menu li {
                display: inline-block;
            }
            .user-menu li a {
                display: block;
                font-size: 13px;
                margin-right: 5px;
                padding: 10px;
            }
            .user-menu li a i.fa {
                margin-right: 5px;
            }


        </style>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="home"><img src="images/yukinagato.png" style="width: 50px; " >

            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
<!--                    <li class="nav-item active">
                        <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
                    </li>-->





                    <li class="nav-item">
                        <a class="nav-link" href="Introduce.jsp">Giới thiệu</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="list">SẢN PHẨM</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a  class="nav-link dropdown-toggle" href="Product.jsp" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            PHÂN LOẠI
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                            <a class="dropdown-item" href="brand?id=1">Figma</a>
                            <a class="dropdown-item" href="brand?id=5">S.H.F</a>
                            <a class="dropdown-item" href="brand?id=2">Nendoroid</a>
                            <a class="dropdown-item" href="brand?id=3">DX</a>
                            <a class="dropdown-item" href="brand?id=4">PrePainted</a>
                            <a class="dropdown-item" href="brand?id=9">Other</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#"><img src="images/UniconicIcon.jpg" style="width: 40px; height: 30px"></a>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link disabled" href="tutorial.jsp">Hướng dẫn</a>
                    </li>

                    <c:if test="${sessionScope.account.role == 'admin'}">


                        <li class="nav-item">
                            <a class="nav-link" href="crud">+</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="morder">
                                <img src="images/managerIcon.jpg" style="width: 18px; height: 18px;"/>
                            </a>
                        </li>
                    </c:if>

                    <c:if test="${sessionScope.account==null}">
                        <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                    </c:if>

                    <c:if test="${sessionScope.account!=null}">

                        <li class="nav-item">
                            <a class="nav-link" href="account">
                                <span class="glyphicon glyiconuser"></span>
                                ${sessionScope.account.userName}

                            </a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="logout">
                                đăng xuất
                            </a>
                        </li>
                    </c:if>

                </ul>

                <form class="form-inline my-2 my-lg-0" action="search" method="get">

                    <input class="form-control mr-sm-2" type="search" aria-label="Search" name="key">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="this.form.sunbmit">
                        Search
                    </button>
                    <c:if test="${sessionScope.account.role=='user'}">


                        <a href="cart" class="nav-item nav-link">
                            <i class="fa fa-fw fa-shopping-cart">

                            </i></a>
                        </c:if>
                        <c:if test="${sessionScope.account==null || sessionScope.account.role == 'admin'}">

                        <a href="cart.jsp" class="nav-item nav-link">
                            <i class="fa fa-fw fa-shopping-cart">

                            </i></a>

                    </c:if>


                </form>
            </div>
        </nav>


    </body>
</html>
