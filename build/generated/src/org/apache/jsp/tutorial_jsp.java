package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tutorial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background-image: url('images/backgroundimg2.jpg');\n");
      out.write("                background-repeat: repeat-y;\n");
      out.write("                /*                margin-left: auto;\n");
      out.write("                                margin-right: auto;*/\n");
      out.write("                background-size: contain;\n");
      out.write("            }\n");
      out.write("            #tutorial{\n");
      out.write("                margin: 0;\n");
      out.write("                width: 80%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .b {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*            @media (max-width: 1100px) { \n");
      out.write("                            #tutorial{\n");
      out.write("                                width: 60%; \n");
      out.write("                                margin: auto;\n");
      out.write("                            }\n");
      out.write("            \n");
      out.write("                        }*/\n");
      out.write("\n");
      out.write("/*            @media (min-width: 1200px) { \n");
      out.write("                #tutorial{\n");
      out.write("                    margin: 0;\n");
      out.write("                    width: 80%;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }*/\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
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
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
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
      out.write("                    <a href=\"cart\" class=\"nav-item nav-link\">\n");
      out.write("                        <i class=\"fa fa-fw fa-shopping-cart\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"tutorial\">\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                </br>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <b style=\"color: #cc0000;\">\n");
      out.write("\n");
      out.write("                    QUÝ KHÁCH LƯU Ý LÀ KHÔNG NHẬN THANH TOÁN QUA NGÂN LƯỢNG VÀ BAOKIM NHA MỌI NGƯỜI\n");
      out.write("\n");
      out.write("                </b>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"color: white\">\n");
      out.write("                NHẬN SHIP TRỰC TIẾP Ở TRONG NỘI THÀNH HÀ NỘI, FREE SHIP QUANH BÁN KÍNH 10KM Ở SHOP\n");
      out.write("                </br> LIÊN HỆ ĐỂ BIẾT CHI TIẾT\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
        out.write("                            <a class=\"nav-link\" href=\"\">\n");
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
}
