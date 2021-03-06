<%-- 
    Document   : account
    Created on : Jul 13, 2021, 9:03:00 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            #main{
                margin: 0 auto;
                width: 55%;
                color: white;

            }
            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
                min-height: 500px;
            }
            @media (max-width: 1200px) { 
                #main{
                    width: 55%; 
                    margin: auto;
                }
                .table{
                    font-size: 20px;
                }

            }
        </style>
    </head>
    <script>
        function check() {
            var confirm = prompt("Enter your old password");
            var oldpass = document.getElementById("oldpass").value;
            if (oldpass === confirm) {
                alert("Correct password, changes will be saved");
                return true;
            } else {
                alert("Wrong password! Change will not be saved");
                return false;
            }
        }
    </script>
    <body>
        <%@include file="header.jsp" %>
        <div style="margin: 40px 0 ;">
            
        </div>
        <div id="main">
            <c:if test="${sessionScope.account.role=='user'}">
                <div>
                    <form action="account" onsubmit="return check()" method="post">
                        <h3 style="text-align: center;">Th??ng tin t??i kho???n</h3>
                        <div class="form-group">
                            <label>T??n ????ng nh???p</label>
                            <input type="text" class="form-control" name="userName" value="${requestScope.AccountInfo.userName}" readonly>
                        </div>
                        <div class="form-group">
                            <input type="password" style="display: none;" class="form-control" id="oldpass" value="${sessionScope.account.password}">
                        </div>
                        <div class="form-group">
                            <label>M???t kh???u</label>
                            <input type="password" class="form-control" name="pass" value="${sessionScope.account.password}">
                        </div>
                        <div class="form-group">
                            <label>T??n ng?????i nh???n h??ng:</label>
                            <input type="text " class="form-control" name="name" value="${requestScope.AccountInfo.name}">
                        </div>
                        <div class="form-group">
                            <label>?????a ch???</label>
                            <input type="text" class="form-control" name="address" value="${requestScope.AccountInfo.address}">
                        </div>
                        <div class="form-group">
                            <label>S??? ??i???n tho???i:</label>
                            <input type="text" class="form-control" name="phone" value="${requestScope.AccountInfo.phone}">
                        </div>
                        <input type="submit" class="btn btn-primary" value="Save"/>
                        <small id="emailHelp" class="form-text text-muted">Ch??ng t??i s??? kh??ng chia s??? th??ng tin n??y v???i b???t k??? ai.</small>
                        <div style="font-size: 10px;" class="form-text text-muted">
                            </br>
                            Tr??? khi c?? ng?????i tr??? gi?? cao h??n.
                        </div>

                    </form>
                </div>

            </c:if>

            <c:if test="${sessionScope.account.role == 'admin'}">
                <div>
                    <form action="account" onsubmit="return check()" method="post">
                        <h3 style="text-align: center;">Th??ng tin t??i kho???n</h3>
                        <div class="form-group">
                            <label>T??n ????ng nh???p</label>
                            <input type="text" class="form-control" name="userName" value="${requestScope.AccountInfo.userName}" readonly>
                        </div>
                        <div class="form-group">
                            <input type="password" style="display: none;" class="form-control" id="oldpass" value="${sessionScope.account.password}">
                        </div>
                        <div class="form-group">
                            <label>M???t kh???u</label>
                            <input type="password" class="form-control" name="pass" value="${sessionScope.account.password}">
                        </div>
                        <div class="form-group">
                            <label>T??n ng?????i nh???n h??ng:</label>
                            <input type="text " class="form-control" name="name" value="${requestScope.AccountInfo.name}" readonly>
                        </div>
                        <div class="form-group">
                            <label>?????a ch???</label>
                            <input type="text" class="form-control" name="address" value="${requestScope.AccountInfo.address}" readonly>
                        </div>
                        <div class="form-group">
                            <label>S??? ??i???n tho???i:</label>
                            <input type="text" class="form-control" name="phone" value="${requestScope.AccountInfo.phone}" readonly>
                        </div>

                        <small id="emailHelp" class="form-text text-muted">Ch??ng t??i s??? kh??ng chia s??? th??ng tin n??y v???i b???t k??? ai.</small>
                        <div style="font-size:9px;" class="form-text text-muted">
                            </br>
                            Tr??? khi c?? ng?????i tr??? gi?? cao h??n.
                        </div>
                    </form>
                </div>

            </c:if>

            <c:if test="${sessionScope.account.role != 'admin'}">
                <div >
                    <div style="text-align: center">
                        <h3 style="color: green">Th???ng k??</h3>
                        <p>Trong th??ng n??y, b???n c?? 
                            <span style="color: red; font-size:20px; font-weight: bold">${requestScope.orderNum}</span>
                            ????n h??ng</p>

                        <a href="account" style="text-decoration: threedface;">
                            <button class="btn btn-info">Xem l???i l???ch s??? mua h??ng?</button>
                        </a>

                    </div>

                    </br>

                    <div  >
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
                                            <fmt:formatNumber pattern="###,###.###" value="${o.totalMoney}"/>??

                                        </td>

                                        <td> 
                                            <fmt:formatNumber pattern="###,###.###" value="${(o.totalMoney *102)/100}"/>??
                                        </td> 
                                        <td>delivered </td>
                                        <td style="text-align: center"><a href="odetail?oid=${o.id}">
                                                <button class="btn btn-light">Detail</button>
                                            </a></td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>

                </div>
            </c:if> 

            <div style="margin: 50px 0;">

            </div>
        </div>
        <%@include file="footer.jsp" %>      
    </body>
</html>
