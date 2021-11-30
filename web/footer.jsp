<%-- 
    Document   : footer
    Created on : Jun 8, 2021, 10:55:22 PM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


        <style>
           
            .footer-top-area .zigzag-bottom{
                background: #f4f4f4
            }
            .footer-top-area {
                background: none repeat scroll 0 0 #333;
                color: #999;
                padding: 35px 0 180px;}


            .footer-bottom-area {
                background: #000;
                color: #fff
            }
            .footer-about-us span {
                color: #5a88ca;
            }
            .footer-wid-title {
                font-family: raleway;
                font-size: 30px;
                font-weight: 100;color: #fff
            }

            .footer-about-us h2 {
                font-weight: 200;
            }
            .footer-menu ul {
                list-style: outside none none;
                margin: 0;
                padding: 0;
            }
            .footer-menu ul li {
                border-bottom: 1px dashed #555;
                padding: 5px 0;
            }
            .footer-menu a {
                display: block;
                padding: 5px 0;color: #999
            }


            .footer-social a {
                background: none repeat scroll 0 0 #5a88ca;
                color: #fff;
                display: inline-block;
                font-size: 20px;
                height: 40px;
                margin-bottom: 10px;
                margin-right: 10px;
                padding-top: 5px;
                text-align: center;
                width: 40px;border: 1px solid #5a88ca;
            }

            .footer-social a:hover {
                background-color: #222;
                border-color: #666
            }

            .footer-social {
                margin-top: 20px
            }
        </style>
    </head>
    <body>

        <div class="footer-top-area">

            <div class="zigzag-bottom"></div>
            <div class="container">

                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="footer-about-us">
                            <h2>PAT<span>フィギュアショプ</span></h2>
                            <p>
                               
                            </p>

                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">Social Media </h2>
                            <ul>
                                <li><a href="#">Facebook</a></li>
                                <li><a href="https://twitter.com/PATtrick1101">Twitter</a></li>
                                <li><a href="https://myfigurecollection.net/">Goggle+</a></li>

                                <li><a href="home">Front page</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">Contract us</h2>
                            <ul>
                                <li>PatrickFigStore</li>
                                <li>Address:</li>
                                <li><a href="https://goo.gl/maps/Z5LGrxEssFsc12XK8">19 Trần Đại Nghĩa, Bách Khoa,
                                        Hai Bà Trưng, Hà Nội, Việt Nam </a></li>

                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-newsletter">
                            <h2 class="footer-wid-title">Newsletter</h2>
                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                            <div class="newsletter-form">
                                <form action="#">
                                    <input type="email" placeholder="Type your email">
                                    <input type="submit" value="Subscribe">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End footer top area -->

        <div class="footer-bottom-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="copyright">
                            <p>&copy; 2021 PAtrickFigureshop. All Rights Reserved. <a href="https://myfigurecollection.net/" target="_blank">myfigurecollection.net</a></p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="footer-card-icon">
                            <i class="fa fa-cc-discover"></i>
                            <i class="fa fa-cc-mastercard"></i>
                            <i class="fa fa-cc-paypal"></i>
                            <i class="fa fa-cc-visa"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End footer bottom area -->

    </body>
</html>
