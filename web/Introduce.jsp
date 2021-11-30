<%-- 
    Document   : Introduce
    Created on : Jun 30, 2021, 2:32:59 AM
    Author     : atung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Introduction</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
        <style>
            body{
                background-image: url('images/backgroundimg2.jpg');
                background-repeat: repeat-y;
                margin-left: auto;
                margin-right: auto;
                background-size: contain;
                min-height: 800px;
            }

            #intro{
                margin: auto;
                width: 80%;
                min-height: 800px;

            }
            video{
                width: 1080px;
                height: auto; 

                margin: 0 auto;
            }
            #thevideo {
                width: 1080px;
                height: auto;
                margin: 0 auto;
            }

            #intro h1{
                text-align: center;
                color: white;
            }
            @media(max-width: 1200px){
                #thevideo {
                    width: 480px;
                    height: auto;
                    margin: auto;
                }
                video{
                    width: 480px;
                    height: auto; 

                    margin: 0 auto;
                }
            }


        </style>

    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="intro">
            <h1>Introduction!</h1>
            <div id="thevideo">
                <video controls="controls">
                    <source src="video/Introduction.mp4" type="audio/mp4">
                </video>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
