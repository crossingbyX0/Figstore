<%-- 
    Document   : CRUD
    Created on : Jun 30, 2021, 2:52:10 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD</title>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <style>
            #CRUD{
                margin: auto;
                width: 55%;
            }
            body{
                background-image: url('images/CRUDBeckGroumd.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
            }
            .table{
                font-size: 21px;
                width: fit-content;
                color: white;
            }
            #addbutton{
                background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 13px 29px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }

            #nothing{
                margin: 50px 0; 
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
                #CRUD{
                    width: 100%; 
                    margin: auto;
                }
                .table{
                    font-size: 19px;
                    color: blue;
                }
                body{

                    background-repeat: repeat-y;
                    margin-left: auto;
                    margin-right: auto;
                    background-size: contain;
                }
                .table th{
                    background-color: wheat;
                    color: black;
                }
                .table td{
                    color: white;
                    background-color: none;
                }
                #name{
                    background-color: black;
                }

            }
        </style>



    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="CRUD">
            <div style="text-align: center; margin: 20px 0 20px;">

                <a class="btn btn-lg btn-outline-success" style="text-align: center;" href="add.jsp">ADD</a>

            </div>
            <c:set var="page" value="${requestScope.page}"/>
            <div id="pagination">
                <nav aria-label="Page navigation example">

                    <ul class="pagination pagination-lg">

                        <li class="page-item" style="display: inline-block;" >
                            <c:forEach begin="1" end="${requestScope.num}" var="i">

                                <a class="${requestScope.page} " href="crud?page=${i}">
                                    ${i} </a> 


                            </c:forEach>
                        </li>
                    </ul>
                </nav>
            </div>


            <table class="table" border="2px" style=" ">
                <tr>
                    <th scope="col" style="color: black;">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Image</th>

                    <th scope="col">price</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Description</th>
                    <th scope="col">brand</th>

                    <th scope="last" ></th>
                </tr>
                <c:forEach items="${requestScope.listC}" var="p">
                    <tr>
                        <td >${p.id}</td>
                        <td id="name">${p.name}</td>
                        <td><img src="images/${p.image}" width="150px" height="175px"/></td>

                        <td>
                            <fmt:formatNumber pattern="###,###.###" value="${p.price}"/>đ
                        </td>
                        <td>${p.quantity}</td>
                        <td>${p.des}</td>
                        <td>${p.brandId}</td>

                        <td style="background-color: black;">
                            <a class="btn btn-outline-info" style="margin: 10px 0;" href="updateP?id=${p.id}">Update</a>

                            </br>
                            <a class="btn btn-outline-danger" style="margin: 10px 0;" href="deleteP?id=${p.id}">Delete</a> 

                        </td>

                    </tr>

                </c:forEach>

            </table>

            <div id="pagination">
                <nav aria-label="Page navigation example">

                    <ul class="pagination pagination-lg">

                        <li class="page-item" style="display: inline-block;" >
                            <c:forEach begin="1" end="${requestScope.num}" var="i">

                                <a class="${requestScope.page} " href="crud?page=${i}">
                                    ${i} </a> 


                            </c:forEach>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <div id="nothing">

        </div>

        <%@include file="footer.jsp" %>
    </body>
</html>
