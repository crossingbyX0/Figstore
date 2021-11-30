<%-- 
    Document   : ProductByCate
    Created on : Jun 28, 2021, 2:10:23 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUCT B</title>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

        <style>
            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
                margin: auto;
                /*                min-height: 100vh;*/

            }
            #searchByBrand{
                color: white;
                margin: auto;
                min-height: 1500px;
                margin-bottom: 50px;
                width: 80%;
            }

            .table{
                font-size: 30px;
                width: fit-content;
            }

            .tab{
                /*                margin-top: 100px;*/
                /*                width: 15%;*/
                /*                float: left;*/
                height: auto;
                background-color: white;


            }
            .tab a{
                text-decoration: none;
                font-size: 20px;

            }
            .tab a.active{
                background-color: #4CAF50;

            }

            table{
                border-collapse: collapse
            }

            .pagination a {
                color: black;
                font-size: 22px;
                float: left;
                padding: 8px 16px;
                text-decoration: none; 
                background-color: white;
            }
            .pagination a.active {
                background-color: #4CAF50;
                color: white;
            }
            .pagination a:hover:not(.active) {
                background-color: chocolate;
            }            

            @media (max-width: 1200px) { 
                #paging{
                    width: 100%; 
                    margin: auto;
                }
                .table{
                    font-size: 20px;
                }

            }

            @media (max-width: 1200px) { 
                #searchByBrand{
                    width: 100%; 
                    margin: auto;
                }
                .table{
                    font-size: 20px;
                    width: auto ;
                }
                #nothing{
                    margin: auto;
                    height: 100px
                }
            }

        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>



        <div id="searchByBrand">



            <div class="tab "> 
                <ul class="nav justify-content-end">
                    <li class="nav-item" style="display: inline-block">
                        <c:forEach items="${requestScope.cats}" var="br">
                            <a class="${br.brandId==id?"active":""}" href="brand?id=${br.brandId}">
                                ${br.brand} &nbsp;&nbsp;&nbsp;
                            </a>
                        </c:forEach>
                    </li>

                </ul>

                <c:set var="page" value="${requestScope.page}"/>
            </div>


            <div class="pagination" >
                <c:forEach begin="${1}" end="${requestScope.num}" var="i">
                    <a class="${i==page?"active":""}" href="brand?page=${i}&id=${id}">${i}</a> 
                </c:forEach>

            </div>


            <div id="">
                <div class="row m-5">
                    <div class=" col-md-12 text-center">

                    </div>
                </div>

                <div class="row d-flex justify-content-center">

                    <!----start-model-box---->


                    <a data-toggle="modal" data-target=".bs-example-modal-md" href="#"> </a>

                    <c:forEach items="${requestScope.data}" var="p">
                        <!----start-model-box---->

                        <div id="topsale" class="col-sm-5 col-md-4 col-lg-3">
                            <div class="grid">

                                <div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
                                    <div class="portfolio-wrapper" style="text-align: center">
                                        <c:if test="${p.quantity != 0 }">
                                             <a href="detail?id=${p.id}" class="b-link-stripe b-animate-go  thickbox">
                                            <img class="img-responsive" src="images/${p.image}" style="width: 300px; height: 400px; "/>
                                            <div class="b-wrapper">
                                                <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                            </div>
                                        </a>
                                        </c:if>
                                          <c:if test="${p.quantity == 0 }">
                                             <a class="b-link-stripe b-animate-go  thickbox">
                                            <img class="img-responsive" src="images/${p.image}" style="width: 300px; height: 400px; "/>
                                            <div class="b-wrapper">
                                                <h2 class="b-animate b-from-left    b-delay03 "><img src="images/link-ico.png" alt="" /></h2>
                                            </div>
                                        </a>
                                        </c:if>
                                       
                                    </div>
                                </div>
                                <div style="background-color: black; height: 181px; ">
                                    <div style=" text-overflow: ellipsis;
                                         overflow: hidden; white-space: nowrap;    ">


                                        <p class="text-center">
                                            ${p.id}.${p.name}</p>

                                    </div>

                                    <h2 class="text-center"> 
                                        <fmt:formatNumber pattern="###,###.###" value="${p.price}"/>đ
                                    </h2>
                                    <div style="margin: 0 auto; text-align: center">
                                        <c:if test="${sessionScope.account.role == 'user'||sessionScope.account.role == null}">
                                            <c:if test="${p.quantity != 0 }">
                                                <a class="btn btn-outline-success mt-auto" href="detail?id=${p.id}" style="margin: 0 auto;">Details</a>
                                            </c:if>


                                            <c:if test="${p.quantity == 0 }">


                                                  <a   class="btn btn-outline-warning"  style="margin: 0 auto;">Hết Hàng</a>

                                            </c:if>    
                                        </c:if>
                                        <c:if test="${sessionScope.account.role == 'admin'}">
                                            <c:if test="${p.quantity != 0 }">
                                                <a class="btn btn-outline-success mt-auto"  style="margin: 0 auto;">Còn Hàng</a>
                                            </c:if>


                                            <c:if test="${p.quantity == 0 }">
                                                <a class="btn btn-outline-warning" href="updateP?id=${p.id}"  style="margin: 0 auto;">Hết Hàng</a>

                                            </c:if>    
                                        </c:if>

                                    </div>



                                </div>

                            </div>  
                            <!--                        </form>-->
                        </div>

                    </c:forEach>

                    <div class="clearfix"></div>


                </div>

            </div>


            <div class="pagination" >
                <c:forEach begin="${1}" end="${requestScope.num}" var="i">
                    <a class="${i==page?"active":""}" href="brand?page=${i}&id=${id}">${i}</a> 
                </c:forEach>

            </div>
        </div>


        <div id="nothing">

        </div>

        <%@include file="footer.jsp" %>
    </body>
</html>
