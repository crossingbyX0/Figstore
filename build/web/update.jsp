<%-- 
    Document   : update
    Created on : Jul 6, 2021, 12:22:58 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE</title>
        <style>
               #updateCRUD{
                margin: 0px;
                /*                width: 80%;*/
                background-image: url('images/loginBackground.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                background-position: center;
                padding-top: 50px;
                padding-bottom: 50px;
            }
            #none{
                padding-bottom: 30px;
            }


            *[role="form"] {
                max-width: 530px;
                padding: 15px;
                margin: 0 auto;
                border-radius: 0.3em;
                background-color: #f2f2f2;
            }

            *[role="form"] h2 { 
                font-family: 'Open Sans' , sans-serif;
                font-size: 40px;
                font-weight: 600;
                color: #000000;
                margin-top: 5%;
                text-align: center;
                text-transform: uppercase;
                letter-spacing: 4px;
            }
            .h3{
                color: red;    
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="updateCRUD">

            <div class="row justify-content-center">

                <div class="col-md-4 col-sm-4">
                    <div class="card">
                        <div class="card-header">UPDATE</div>
                        <div class="card-body">

                            <form class="form-horizontal" action="updateP" method="post" >
                                <c:set var="p"  value="${requestScope.product}"  />
                                <div class="form-group">
                                    <label for="id" class="cols-sm-2 control-label">ID</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="id"  value="${p.id}" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">PRODUCT NAME</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="name"  value="${p.name}" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="image" class="cols-sm-2 control-label">Image</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="file" class="form-control" name="image" value="images/${p.image}" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="price" class="cols-sm-2 control-label">PRICE</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="price" value="${p.price}" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="quantity" class="cols-sm-2 control-label">Quantity</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="quantity"  value="${p.quantity}" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="des" class="cols-sm-2 control-label">DESCRIPTION</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="des" value="${p.des}" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="brandId" class="cols-sm-2 control-label">BRANDID</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="brandId" value="${p.brandId}"/>
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group ">
                                    <button type="submit" class="btn btn-primary btn-lg btn-block login-button">UPDATE</button>
                                </div>

                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </div>
       


        <%@include file="footer.jsp" %>
    </body>
</html>
