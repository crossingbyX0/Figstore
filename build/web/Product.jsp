<%-- 
    Document   : Product
    Created on : Jun 23, 2021, 12:03:48 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUCT </title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <style>
            #paging{
                width: 80%;
                margin: auto;
                color: white;
            }

            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
            }
            #paging h1{
                text-align: center;
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


        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="paging">

            <c:set var="page" value="${requestScope.page}"/>

            <h1>List Of product </h1>

            <nav aria-label="Page navigation example">

                <ul class="pagination pagination-lg">

                    <li class="page-item" style="display: inline-block;" >
                        <c:forEach begin="1" end="${requestScope.num}" var="i">

                            <a class="${requestScope.page} " href="list?page=${i}">
                                ${i} </a> 


                        </c:forEach>
                    </li>
                </ul>
            </nav>

            <div id="newest">
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
                                        <fmt:formatNumber pattern="###,###.###" value="${p.price}"/>??
                                    </h2>
                                    <div style="margin: 0 auto; text-align: center">
                                        <c:if test="${sessionScope.account.role == 'user'||sessionScope.account.role == null}">
                                            <c:if test="${p.quantity != 0 }">
                                                <a class="btn btn-outline-success mt-auto" href="detail?id=${p.id}" style="margin: 0 auto;">Details</a>
                                            </c:if>


                                            <c:if test="${p.quantity == 0 }">

                                                <a   class="btn btn-outline-warning"  style="margin: 0 auto;">H???t H??ng</a>
                                            </c:if>    
                                        </c:if>
                                        <c:if test="${sessionScope.account.role == 'admin'}">
                                            <c:if test="${p.quantity != 0 }">
                                                <a class="btn btn-outline-success mt-auto"  style="margin: 0 auto;">C??n H??ng</a>
                                            </c:if>


                                            <c:if test="${p.quantity == 0 }">

                                                <a   class="btn btn-outline-warning" href="updateP?id=${p.id}"  style="margin: 0 auto;">H???t H??ng</a>


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



            <ul class="pagination pagination-lg">

                <li class="page-item" style="display: inline-block; " >
                    <c:forEach begin="1" end="${requestScope.num}" var="i">

                        <a class="${requestScope.page} " href="list?page=${i}">
                            ${i} </a> 


                    </c:forEach>
                </li>

            </ul>


        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>

<script type="text/javascript">
    function buy(id, quantity) {
        var m = document.f.num.value;
        if (m > quantity) {
            alert("Khong du hang");
            return;
        } else {
            document.f.action = "buy?id=" + id;
            document.f.submit();
        }
    }
</script>    
