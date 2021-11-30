package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tung Figure Store </title>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/mycode.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                background-image: url('images/YukiBackground2.jpg') ;\n");
      out.write("                background-repeat: repeat-y;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                background-size: contain;\n");
      out.write("                /*                width: 80%;*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #container {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 80%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #newest{\n");
      out.write("                margin: 0 auto;\n");
      out.write("                text-align: center;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .brands-area {\n");
      out.write("                border-top:1px solid #e5e5e5;\n");
      out.write("                border-bottom:1px solid #e5e5e5;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 20px 0 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #category img {\n");
      out.write("                /*                -webkit-filter: grayscale(100%);*/\n");
      out.write("                /*                filter: grayscale(100%);*/\n");
      out.write("                -webkit-transition: .8s ease-in-out;\n");
      out.write("                transition: .8s ease-in-out;\n");
      out.write("                width: 10em;\n");
      out.write("                height: 10em;\n");
      out.write("            }\n");
      out.write("            #category:hover img {\n");
      out.write("                -webkit-filter: grayscale(0);\n");
      out.write("                filter: grayscale(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #header{\n");
      out.write("                background-color: wheat;\n");
      out.write("            }\n");
      out.write("            .header-area {\n");
      out.write("                background: none repeat scroll 0 0 #f4f4f4;\n");
      out.write("            }\n");
      out.write("            .header-area a {\n");
      out.write("                color: #888;\n");
      out.write("            }\n");
      out.write("            .user-menu ul {\n");
      out.write("                list-style: outside none none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .user-menu li {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .user-menu li a {\n");
      out.write("                display: block;\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .user-menu li a i.fa {\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"home\"><img src=\"images/yukinagato.png\" style=\"width: 50px; \" >\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"home\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Introduce.jsp\">Giới thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"list\">SẢN PHẨM</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a  class=\"nav-link dropdown-toggle\" href=\"Product.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            PHÂN LOẠI\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=1\">Figma</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=5\">S.H.F</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=2\">Nendoroid</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=3\">DX</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=4\">PrePainted</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"brand?id=9\">Other</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\"><img src=\"images/UniconicIcon.jpg\" style=\"width: 40px; height: 30px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"tutorial.jsp\">Hướng dẫn</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\" action=\"search\" method=\"get\">\n");
      out.write("\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" aria-label=\"Search\" name=\"key\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" onclick=\"this.form.sunbmit\">\n");
      out.write("                        Search\n");
      out.write("                    </button>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("\n");
      out.write("            <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/Slider1.jpg\" alt=\"First slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/Slider2.jpg\" alt=\"Second slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/Slider3.jpg\" alt=\"Third slide\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"newest\">\n");
      out.write("                <div class=\"row m-5\">\n");
      out.write("                    <div class=\" col-md-12 text-center\">\n");
      out.write("                        <h2><mark>Sản phẩm mới nhất</mark></h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\n");
      out.write("\n");
      out.write("                    <!----start-model-box---->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <a data-toggle=\"modal\" data-target=\".bs-example-modal-md\" href=\"#\"> </a>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"newest\">\n");
      out.write("                <div class=\"row m-5\">\n");
      out.write("                    <div class=\" col-md-12 text-center\">\n");
      out.write("                        <h2><mark>SẢN PHẨM RẺ </mark></h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\n");
      out.write("\n");
      out.write("                    <!----start-model-box---->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <a data-toggle=\"modal\" data-target=\".bs-example-modal-md\" href=\"#\"> </a>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"nothing\" style=\"margin-top: 50px; margin-bottom: 50px;\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row m-3 d-flex justify-content-center d-none .d-lg-flex d-xl-flex\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2\" id=\"category\">\n");
      out.write("                    <a href=\"brand?id=5\" >\n");
      out.write("                        <img src=\"images/brand1.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2\" id=\"category\">\n");
      out.write("                    <a href=\"brand?id=1\" >\n");
      out.write("                        <img src=\"images/brand2.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-md-3 col-xs-2 col-lg-2 justify-content-center m-2\" id=\"category\">\n");
      out.write("                    <a href=\"brand?id=2\" >\n");
      out.write("                        <img src=\"images/brand4.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-md-3  col-xs-2 col-lg-2 justify-content-center m-2\" id=\"category\">\n");
      out.write("                    <a href=\"brand?id=3\" >\n");
      out.write("                        <img src=\"images/brand5.png\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-md-3  col-xs-2  col-lg-2 justify-content-center m-2\" id=\"category\">\n");
      out.write("                    <a href=\"brand?id=4\">\n");
      out.write("                        <img src=\"images/brand7.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--            End brands area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"allproduct\">\n");
      out.write("                <div class=\"row m-5\">\n");
      out.write("                    <div class=\" col-md-12 text-center\">\n");
      out.write("                        <a href=\"list\">\n");
      out.write("                            <h2><mark>PRODUCT</mark></h2>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            .footer-top-area .zigzag-bottom{\n");
      out.write("                background: #f4f4f4\n");
      out.write("            }\n");
      out.write("            .footer-top-area {\n");
      out.write("                background: none repeat scroll 0 0 #333;\n");
      out.write("                color: #999;\n");
      out.write("                padding: 35px 0 180px;}\n");
      out.write("\n");
      out.write("\n");
      out.write("            .footer-bottom-area {\n");
      out.write("                background: #000;\n");
      out.write("                color: #fff\n");
      out.write("            }\n");
      out.write("            .footer-about-us span {\n");
      out.write("                color: #5a88ca;\n");
      out.write("            }\n");
      out.write("            .footer-wid-title {\n");
      out.write("                font-family: raleway;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 100;color: #fff\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-about-us h2 {\n");
      out.write("                font-weight: 200;\n");
      out.write("            }\n");
      out.write("            .footer-menu ul {\n");
      out.write("                list-style: outside none none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .footer-menu ul li {\n");
      out.write("                border-bottom: 1px dashed #555;\n");
      out.write("                padding: 5px 0;\n");
      out.write("            }\n");
      out.write("            .footer-menu a {\n");
      out.write("                display: block;\n");
      out.write("                padding: 5px 0;color: #999\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .footer-social a {\n");
      out.write("                background: none repeat scroll 0 0 #5a88ca;\n");
      out.write("                color: #fff;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 20px;\n");
      out.write("                height: 40px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 40px;border: 1px solid #5a88ca;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-social a:hover {\n");
      out.write("                background-color: #222;\n");
      out.write("                border-color: #666\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-social {\n");
      out.write("                margin-top: 20px\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"footer-top-area\">\n");
      out.write("\n");
      out.write("            <div class=\"zigzag-bottom\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-about-us\">\n");
      out.write("                            <h2>PAT<span>フィギュアショプ</span></h2>\n");
      out.write("                            <p>\n");
      out.write("                               \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Social Media </h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Facebook</a></li>\n");
      out.write("                                <li><a href=\"https://twitter.com/PATtrick1101\">Twitter</a></li>\n");
      out.write("                                <li><a href=\"https://myfigurecollection.net/\">Goggle+</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"home\">Front page</a></li>\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Contract us</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>PatrickFigStore</li>\n");
      out.write("                                <li>Address:</li>\n");
      out.write("                                <li><a href=\"https://goo.gl/maps/Z5LGrxEssFsc12XK8\">19 Trần Đại Nghĩa, Bách Khoa,\n");
      out.write("                                        Hai Bà Trưng, Hà Nội, Việt Nam </a></li>\n");
      out.write("\n");
      out.write("                            </ul>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"footer-newsletter\">\n");
      out.write("                            <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\n");
      out.write("                            <div class=\"newsletter-form\">\n");
      out.write("                                <form action=\"#\">\n");
      out.write("                                    <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                    <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End footer top area -->\n");
      out.write("\n");
      out.write("        <div class=\"footer-bottom-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"copyright\">\n");
      out.write("                            <p>&copy; 2021 PAtrickFigureshop. All Rights Reserved. <a href=\"https://myfigurecollection.net/\" target=\"_blank\">myfigurecollection.net</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"footer-card-icon\">\n");
      out.write("                            <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                            <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End footer bottom area -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"crud\">+</a>\n");
        out.write("                        </li>\n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"account\">\n");
        out.write("                                <span class=\"glyphicon glyiconuser\"></span>\n");
        out.write("                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"logout\">\n");
        out.write("                                đăng xuất\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role=='user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <a href=\"cart\" class=\"nav-item nav-link\">\n");
        out.write("                            <i class=\"fa fa-fw fa-shopping-cart\">\n");
        out.write("\n");
        out.write("                            </i></a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null || sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                           \n");
        out.write("                                    <a href=\"cart.jsp\" class=\"nav-item nav-link\">\n");
        out.write("                            <i class=\"fa fa-fw fa-shopping-cart\">\n");
        out.write("\n");
        out.write("                            </i></a>\n");
        out.write("                       \n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.top}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("top");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <!----start-model-box---->\n");
          out.write("\n");
          out.write("                        <div id=\"topsale\" class=\"col-sm-5 col-md-4 col-lg-3\">\n");
          out.write("                            <div class=\"grid\">\n");
          out.write("                                <div class=\"portfolio app mix_all\" data-cat=\"app\" style=\"display: inline-block; opacity: 1;\">\n");
          out.write("                                    <div class=\"portfolio-wrapper\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                       \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div style=\"background-color: rgb(217,191,194); height: 191px; \">\n");
          out.write("                                    <div style=\"text-overflow: ellipsis;\n");
          out.write("                                         overflow: hidden; white-space: nowrap\">\n");
          out.write("                                        <p class=\"text-center\" >\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p> \n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("                                    <h2 class=\"text-center\"> \n");
          out.write("                                        ");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("đ\n");
          out.write("                                    </h2>\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                </div>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                             <a  href=\"detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
        out.write("                                            <img class=\"img-responsive\" src=\"images/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 250px; height: 310px\"/>\n");
        out.write("                                            <div class=\"b-wrapper\">\n");
        out.write("                                                <h2 class=\"b-animate b-from-left    b-delay03 \"><img src=\"images/link-ico.png\" alt=\"\" /></h2>\n");
        out.write("                                            </div>\n");
        out.write("                                        </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                              <a class=\"b-link-stripe b-animate-go  thickbox\">\n");
        out.write("                                            <img class=\"img-responsive\" src=\"images/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 250px; height: 310px\"/>\n");
        out.write("                                            <div class=\"b-wrapper\">\n");
        out.write("                                                <h2 class=\"b-animate b-from-left    b-delay03 \"><img src=\"images/link-ico.png\" alt=\"\" /></h2>\n");
        out.write("                                            </div>\n");
        out.write("                                        </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setPattern("###,###.###");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'user' ||sessionScope.account.role == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("    \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-success mt-auto\" href=\"detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"margin: 0 auto;\">Details</a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-warning\" style=\"margin: 0 auto;\">Hết Hàng</a>\n");
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("    \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-success mt-auto\"  style=\"margin: 0 auto;\">Còn Hàng</a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-warning\" href=\"updateP?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  style=\"margin: 0 auto; color: black;\">Hết Hàng</a>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cheap}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("cheap");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <!----start-model-box---->\n");
          out.write("\n");
          out.write("                        <div id=\"topsale\" class=\"col-sm-5 col-md-4 col-lg-3\">\n");
          out.write("                            <div class=\"grid\">\n");
          out.write("                                <div class=\"portfolio app mix_all\" data-cat=\"app\" style=\"display: inline-block; opacity: 1;\">\n");
          out.write("                                    <div class=\"portfolio-wrapper\">\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                         ");
          if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                        \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div style=\"background-color: rgb(217,191,194); height: 191px; \">\n");
          out.write("                                    <div style=\"text-overflow: ellipsis;\n");
          out.write("                                         overflow: hidden; white-space: nowrap\">\n");
          out.write("                                        <p class=\"text-center\" >\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p> \n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("                                    <h2 class=\"text-center\"> \n");
          out.write("                                        ");
          if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("đ\n");
          out.write("                                    </h2>\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                </div>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a href=\"detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
        out.write("                                            <img class=\"img-responsive\" src=\"images/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 250px; height: 310px\"/>\n");
        out.write("                                            <div class=\"b-wrapper\">\n");
        out.write("                                                <h2 class=\"b-animate b-from-left    b-delay03 \"><img src=\"images/link-ico.png\" alt=\"\" /></h2>\n");
        out.write("                                            </div>\n");
        out.write("                                        </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"b-link-stripe b-animate-go  thickbox\">\n");
        out.write("                                            <img class=\"img-responsive\" src=\"images/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 250px; height: 310px\"/>\n");
        out.write("                                            <div class=\"b-wrapper\">\n");
        out.write("                                                <h2 class=\"b-animate b-from-left    b-delay03 \"><img src=\"images/link-ico.png\" alt=\"\" /></h2>\n");
        out.write("                                            </div>\n");
        out.write("                                        </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatNumber_1.setPattern("###,###.###");
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'user'||sessionScope.account.role == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("    \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-success mt-auto\" href=\"detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"margin: 0 auto;\">Details</a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-warning\" style=\"margin: 0 auto;\">Hết Hàng</a>\n");
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("    \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-success mt-auto\"  style=\"margin: 0 auto;\">Còn Hàng</a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.quantity == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"btn btn-outline-warning\" href=\"updateP?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cheap.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  style=\"margin: 0 auto;\">Hết Hàng</a>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }
}
