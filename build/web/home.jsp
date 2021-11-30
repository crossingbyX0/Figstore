<%-- 
    Document   : home
    Created on : Jun 2, 2021, 11:18:54 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tung Figure Store </title>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">



        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="js/mycode.js" type="text/javascript"></script>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

        <style>
            *{
                box-sizing: border-box;
            }
            body{
                margin: 0;
                background-image: url('images/YukiBackground2.jpg') ;
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
                /*                width: 80%;*/
            }

            #container {
                margin: auto;
                width: 80%;

            }
            #newest{
                margin: 0 auto;
                text-align: center;
                display: block;
            }
            .brands-area {
                border-top:1px solid #e5e5e5;
                border-bottom:1px solid #e5e5e5;
                color: #fff;
                padding: 20px 0 20px;

            }


            #category img {
                /*                -webkit-filter: grayscale(100%);*/
                /*                filter: grayscale(100%);*/
                -webkit-transition: .8s ease-in-out;
                transition: .8s ease-in-out;
                width: 10em;
                height: 10em;
            }
            #category:hover img {
                -webkit-filter: grayscale(0);
                filter: grayscale(0);
            }


        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="container">

            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="images/Slider1.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/Slider2.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/Slider3.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>


            <div id="newest">
                <div class="row m-5">
                    <div class=" col-md-12 text-center">
                        <h2><mark>Sản phẩm mới nhất</mark></h2>
                    </div>
                </div>
                <div class="row d-flex justify-content-center">

                    <!----start-model-box---->


                    <a data-toggle="modal" data-target=".bs-example-modal-md" href="#"> </a>

                    <c:forEach items="${requestScope.top}" var="top">
                        <!----start-model-box---->

                        <div id="topsale" class="col-sm-5 col-md-4 col-lg-3">
                            <div class="grid">
                                <div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
                                    <div class="portfolio-wrapper">
                                        <c:if test="${top.quantity != 0 }">
                                            <a  href="detail?id=${top.id}" class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="images/${top.image}" style="width: 250px; height: 310px"/>
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </c:if>
                                        <c:if test="${top.quantity == 0 }">
                                            <a class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="images/${top.image}" style="width: 250px; height: 310px"/>
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </c:if>

                                    </div>
                                </div>
                                <div style="background-color: rgb(217,191,194); height: 191px; ">
                                    <div style="text-overflow: ellipsis;
                                         overflow: hidden; white-space: nowrap">
                                        <p class="text-center" >
                                            ${top.name}</p> 
                                    </div>

                                    <h2 class="text-center"> 
                                        <fmt:formatNumber pattern="###,###.###" value="${top.price}"/>đ
                                    </h2>
                                    <c:if test="${sessionScope.account.role == 'user' ||sessionScope.account.role == null }">
                                        <c:if test="${top.quantity != 0 }">
                                            <a class="btn btn-outline-success mt-auto" href="detail?id=${top.id}" style="margin: 0 auto;">Details</a>
                                        </c:if>


                                        <c:if test="${top.quantity == 0 }">
                                            <a class="btn btn-outline-warning" style="margin: 0 auto;">Hết Hàng</a>

                                        </c:if>    
                                    </c:if>
                                    <c:if test="${sessionScope.account.role == 'admin'}">
                                        <c:if test="${top.quantity != 0 }">
                                            <a class="btn btn-outline-success mt-auto"  style="margin: 0 auto;">Còn Hàng</a>
                                        </c:if>


                                        <c:if test="${top.quantity == 0 }">
                                            <a class="btn btn-outline-warning" href="updateP?id=${top.id}"  style="margin: 0 auto; color: black;">Hết Hàng</a>



                                        </c:if>    
                                    </c:if>
                                </div>

                            </div>
                        </div>
                    </c:forEach>

                    <div class="clearfix"></div>


                </div>
            </div>

            <div id="newest">
                <div class="row m-5">
                    <div class=" col-md-12 text-center">
                        <h2><mark>SẢN PHẨM RẺ </mark></h2>
                    </div>
                </div>
                <div class="row d-flex justify-content-center">

                    <!----start-model-box---->


                    <a data-toggle="modal" data-target=".bs-example-modal-md" href="#"> </a>

                    <c:forEach items="${requestScope.cheap}" var="cheap">
                        <!----start-model-box---->

                        <div id="topsale" class="col-sm-5 col-md-4 col-lg-3">
                            <div class="grid">
                                <div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
                                    <div class="portfolio-wrapper">
                                        <c:if test="${cheap.quantity != 0 }">
                                            <a href="detail?id=${cheap.id}" class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="images/${cheap.image}" style="width: 250px; height: 310px"/>
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </c:if>
                                        <c:if test="${cheap.quantity == 0 }">
                                            <a class="b-link-stripe b-animate-go  thickbox">
                                                <img class="img-responsive" src="images/${cheap.image}" style="width: 250px; height: 310px"/>
                                                <div class="b-wrapper">
                                                    <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                                </div>
                                            </a>
                                        </c:if>

                                    </div>
                                </div>
                                <div style="background-color: rgb(217,191,194); height: 191px; ">
                                    <div style="text-overflow: ellipsis;
                                         overflow: hidden; white-space: nowrap">
                                        <p class="text-center" >
                                            ${cheap.name}</p> 
                                    </div>

                                    <h2 class="text-center"> 
                                        <fmt:formatNumber pattern="###,###.###" value="${cheap.price}"/>đ
                                    </h2>
                                    <c:if test="${sessionScope.account.role == 'user'||sessionScope.account.role == null}">
                                        <c:if test="${cheap.quantity != 0 }">
                                            <a class="btn btn-outline-success mt-auto" href="detail?id=${cheap.id}" style="margin: 0 auto;">Details</a>
                                        </c:if>


                                        <c:if test="${cheap.quantity == 0 }">
                                            <a class="btn btn-outline-warning" style="margin: 0 auto;">Hết Hàng</a>

                                        </c:if>    
                                    </c:if>
                                    <c:if test="${sessionScope.account.role == 'admin'}">
                                        <c:if test="${cheap.quantity != 0 }">
                                            <a class="btn btn-outline-success mt-auto"  style="margin: 0 auto;">Còn Hàng</a>
                                        </c:if>


                                        <c:if test="${cheap.quantity == 0 }">
                                            <a class="btn btn-outline-warning" href="updateP?id=${cheap.id}"  style="margin: 0 auto;">Hết Hàng</a>



                                        </c:if>    
                                    </c:if>
                                </div>

                            </div>
                        </div>
                    </c:forEach>

                    <div class="clearfix"></div>


                </div>
            </div>

            <div id="nothing" style="margin-top: 50px; margin-bottom: 50px;">

            </div>
            <div class="row m-3 d-flex justify-content-center d-none .d-lg-flex d-xl-flex">


                <div class="col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2" id="category">
                    <a href="brand?id=5" >
                        <img src="images/brand1.jpg">
                    </a>
                </div>

                <div class="col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2" id="category">
                    <a href="brand?id=1" >
                        <img src="images/brand2.jpg">
                    </a>
                </div>

                <div class="col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2" id="category">
                    <a href="brand?id=2" >
                        <img src="images/brand4.jpg">
                    </a>
                </div>

                <div class="col-sm-4 col-md-3  col-xs-2 col-lg-2 justify-content-center m-2" id="category">
                    <a href="brand?id=3" >
                        <img src="images/brand5.png">
                    </a>
                </div>

                <div class="col-sm-4 col-md-3  col-xs-2  col-lg-2 justify-content-center m-2" id="category">
                    <a href="brand?id=4">
                        <img src="images/brand7.jpg">
                    </a>
                </div>

            </div>

            <!--            End brands area -->



            <div id="allproduct">
                <div class="row m-5">
                    <div class=" col-md-12 text-center">
                        <a href="list">
                            <h2><mark>PRODUCT</mark></h2>
                        </a>
                    </div>
                </div>
            </div>

        </div> 
        <%@include file="footer.jsp" %>
    </body>
</html>
