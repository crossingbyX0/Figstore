<%-- 
    Document   : login
    Created on : Jun 6, 2021, 8:22:56 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>

        <style>
            #loginOutside{
                margin: 0;
                height: 1000px;
                background-image: url('images/loginBackground.jpg' ) ;
                background-size: cover;
                background-repeat: no-repeat;
                background-position: center;
                /*                height: 100%;*/
                /*                width: 80%;*/
            }

            .card{
                height: 370px;
                margin-top: auto;
                margin-bottom: auto;
                width: 400px;
                background-color: rgba(0,0,0,0.5) !important;
            }

            .social_icon span{
                font-size: 60px;
                margin-left: 10px;
                color: #FFC312;
            }

            .social_icon span:hover{
                color: white;
                cursor: pointer;
            }

            .card-header h3{
                color: white;
            }

            .social_icon{
                position: absolute;
                right: 20px;
                top: -45px;
            }

            .input-group-prepend span{
                width: 50px;
                background-color: #FFC312;
                color: black;
                border:0 !important;
            }

            input:focus{
                outline: 0 0 0 0  !important;
                box-shadow: 0 0 0 0 !important;

            }

            .remember{
                color: white;
            }

            .remember input
            {
                width: 20px;
                height: 20px;
                margin-left: 15px;
                margin-right: 5px;
            }

            .login_btn{
                color: black;
                background-color: #FFC312;
                width: 100px;
            }

            .login_btn:hover{
                color: black;
                background-color: white;
            }

            .links{
                color: white;
            }

            .links a{
                margin-left: 4px;
            }

            /*            #none{
                            padding-bottom: 100px;
                        } */
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div id="loginOutside" >   

            <div class="alert alert-success" role="alert">
                <h2 style="color: red; text-align: center"> ${requestScope.error} </h2>
            </div>
            <div class="d-flex justify-content-center h-100">
                <div class="card">
                    <div class="card-header">
                        <h3>Sign In</h3>

                        <div class="d-flex justify-content-end social_icon">
                            <span><i class="fab fa fa-fw fa-facebook-f"></i></span>
                            <span><i class="fab fa fa-fw fa-twitter"></i></span>
                            <span><i class="fab fa fa-fw fa-google"></i></span>
                        </div>
                    </div>
                    <div class="card-body">
                        <form action="login" method="post">
                            <c:set var="cookie "value="${pageContext.request.cookies}"/>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa fa-fw fa-user"></i></span>
                                </div>
                                <input type="text" name="user" class="form-control" placeholder="username"
                                       value="${cookie.user.value}"  >

                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" name="pass" class="form-control" placeholder="password"
                                       value="${cookie.pass.value}">
                            </div>
                            <div class="row align-items-center remember">
                                <input type="checkbox" ${cookie.rem.value eq 'ON' ?"checked":""} 
                                       name="rem" value="ON">Remember Me
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Đăng nhập" id="loginBtn" class="btn float-right login_btn">
                            </div>
                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            Don't have an account?<a href="createAccount.jsp">Sign Up</a>
                        </div>
                        <div class="d-flex justify-content-center">
                            <a href="#">Forgot your password?</a>
                        </div>
                    </div>
                </div>
            </div>

            <div id="none"> </div>

        </div>


        <%@include file="footer.jsp" %>
    </body>
</html>
