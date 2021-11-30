<%-- 
    Document   : add
    Created on : Jul 2, 2021, 12:42:02 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADDING</title>
        <style>
                 #addCRUD{
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
        <div id="addCRUD">

            <div class="row justify-content-center">
       
                <div class="col-md-4 col-sm-4">
                    <div class="card">
                   
                        <div class="card-body">

                            <form class="form-horizontal" name="createForm" action="add" method="get" >

                                <div class="form-group">
                                    <label for="id" class="cols-sm-2 control-label">ID</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="id"  placeholder="ProductID" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">PRODUCT NAME</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="name"  placeholder="PRODUCT's NAME" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="image" class="cols-sm-2 control-label">Image</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="file" class="form-control" name="image"  placeholder="IMAGES" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="price" class="cols-sm-2 control-label">PRICE</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="price"  placeholder="PRICE (VND)" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="quantity" class="cols-sm-2 control-label">Quantity</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="quantity"  placeholder="QUANTITY" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="des" class="cols-sm-2 control-label">DESCRIPTION</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="des" placeholder="DESCRIPTION" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="brandId" class="cols-sm-2 control-label">BRANDID</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">

                                            <input type="text" class="form-control" name="brandId" placeholder="BRANDID" />
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group ">
                                    <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Add Figure</button>
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
