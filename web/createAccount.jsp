<%-- 
    Document   : creatAccount
    Created on : Jun 13, 2021, 4:31:20 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER</title>


        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <!--        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
                <script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
                ---- Include the above in your HEAD tag ---------->

        <style>


            #createAccount{
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
        <script>

            function checkPass() {
                var pass = document.getElementById('password');
                var confirm = document.getElementById('confirm');
                var message = document.getElementById('confirmMessage');
                var goodColor = "#66cc66";
                var badColor = "#ff6666";
                if (pass.value === confirm.value) {
                    confirm.style.backgroundColor = goodColor;
                    message.style.color = goodColor;
                    message.innerHTML = "Mật khẩu đã trùng";
                } else {
                    confirm.style.backgroundColor = badColor;
                    message.style.color = badColor;
                    message.innerHTML = "Mật khẩu không trùng!";
                }
            }
            ;

//            function validateForm() {
//                var name = document.createForm.name.value;
//                var dob = document.createForm.dob.value;
//                var phone = document.createForm.phone.value;
//                var address = document.createForm.address.value;
//                var user = document.createForm.user.value;
////                var pass = document.createForm.pass.value;
//
//                if (user === "" || user === null) {
//                    alert('Bạn chưa nhập tài khoản');
//                }
//
//                checkPass();
//
//                if (name === "" || dob === "" || phone === "" || address === "" || name === null || dob === null || phone === null || address === null) {
//                    alert('Bạn chưa nhập đầy đủ thông tin cá nhân');
//                } else {
//                    return true;
//                }
//                return false;
//            }
//            ;




        </script>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="createAccount">

            <div class="row justify-content-center">
                <h3 style="color: red;"> ${requestScope.error} </h3>
                <div class="col-md-4 col-sm-4">
                    <div class="card">
                        <div class="card-header">Register</div>
                        <div class="card-body">

                            <form class="form-horizontal" name="createForm" action="create" method="post" onsubmit="return validateForm()">

                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">Your Name</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="name"  placeholder="Enter your Name" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="dob" class="cols-sm-2 control-label">Date of birth</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="dob"  placeholder="Enter Date of Birth" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="phone" class="cols-sm-2 control-label">PhoneNum</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="phone"  placeholder="Enter your Phone Number" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="address" class="cols-sm-2 control-label">Address</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="address"  placeholder="Enter your Address" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="username" class="cols-sm-2 control-label">Username</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="user" id="username" placeholder="Enter your Username" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group"> 
                                    <label for="password" class="cols-sm-2 control-label">Password</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                            <input type="password" class="form-control" name="pass" id="password" placeholder="Enter your Password" />
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                            <input type="password" class="form-control" name="confirm" id="confirm" placeholder="Confirm your Password" />
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group ">
                                    <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
                                </div>

                                <div class="login-register">
                                    <a href="login.jsp">Login</a>
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
