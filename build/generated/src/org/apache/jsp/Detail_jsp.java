package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .product-info {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .reviews-counter {\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .reviews-counter span {\n");
      out.write("                vertical-align: -2px;\n");
      out.write("            }\n");
      out.write("            .rate {\n");
      out.write("                float: left;\n");
      out.write("                padding: 0 10px 0 0;\n");
      out.write("            }\n");
      out.write("            .rate:not(:checked) > input {\n");
      out.write("                position:absolute;\n");
      out.write("                top:-9999px;\n");
      out.write("            }\n");
      out.write("            .rate:not(:checked) > label {\n");
      out.write("                float: right;\n");
      out.write("                width: 15px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 21px;\n");
      out.write("                color:#ccc;\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                line-height: 21px;\n");
      out.write("            }\n");
      out.write("            .rate:not(:checked) > label:before {\n");
      out.write("                content: '\\2605';\n");
      out.write("            }\n");
      out.write("            .rate > input:checked ~ label {\n");
      out.write("                color: #ffc700;    \n");
      out.write("            }\n");
      out.write("            .rate:not(:checked) > label:hover,\n");
      out.write("            .rate:not(:checked) > label:hover ~ label {\n");
      out.write("                color: #deb217;  \n");
      out.write("            }\n");
      out.write("            .rate > input:checked + label:hover,\n");
      out.write("            .rate > input:checked + label:hover ~ label,\n");
      out.write("            .rate > input:checked ~ label:hover,\n");
      out.write("            .rate > input:checked ~ label:hover ~ label,\n");
      out.write("            .rate > label:hover ~ input:checked ~ label {\n");
      out.write("                color: #c59b08;\n");
      out.write("            }\n");
      out.write("            .product-dtl p {\n");
      out.write("                font-size: 14px;\n");
      out.write("                line-height: 24px;\n");
      out.write("                color: #7a7a7a;\n");
      out.write("            }\n");
      out.write("            .product-dtl .form-control {\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .product-dtl label {\n");
      out.write("                line-height: 16px;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .form-control:focus {\n");
      out.write("                outline: none;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("            .product-count {\n");
      out.write("                margin-top: 15px; \n");
      out.write("            }\n");
      out.write("            .product-count .qtyminus,\n");
      out.write("            .product-count .qtyplus {\n");
      out.write("                width: 34px;\n");
      out.write("                height: 34px;\n");
      out.write("                background: #212529;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 19px;\n");
      out.write("                line-height: 36px;\n");
      out.write("                color: #fff;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .product-count .qtyminus {\n");
      out.write("                border-radius: 3px 0 0 3px; \n");
      out.write("            }\n");
      out.write("            .product-count .qtyplus {\n");
      out.write("                border-radius: 0 3px 3px 0; \n");
      out.write("            }\n");
      out.write("            .product-count .qty {\n");
      out.write("                width: 60px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .round-black-btn {\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background: #212529;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 7px 45px;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border: solid 2px #212529; \n");
      out.write("                transition: all 0.5s ease-in-out 0s;\n");
      out.write("            }\n");
      out.write("            .round-black-btn:hover,\n");
      out.write("            .round-black-btn:focus {\n");
      out.write("                background: transparent;\n");
      out.write("                color: #212529;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-info-tabs {\n");
      out.write("                margin-top: 25px; \n");
      out.write("            }\n");
      out.write("            .product-info-tabs .nav-tabs {\n");
      out.write("                border-bottom: 2px solid #d8d8d8;\n");
      out.write("            }\n");
      out.write("            .product-info-tabs .nav-tabs .nav-item {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("            }\n");
      out.write("            .product-info-tabs .nav-tabs .nav-link {\n");
      out.write("                border: none; \n");
      out.write("                border-bottom: 2px solid transparent;\n");
      out.write("                color: #323232;\n");
      out.write("            }\n");
      out.write("            .product-info-tabs .nav-tabs .nav-item .nav-link:hover {\n");
      out.write("                border: none; \n");
      out.write("            }\n");
      out.write("            .product-info-tabs .nav-tabs .nav-item.show .nav-link, \n");
      out.write("            .product-info-tabs .nav-tabs .nav-link.active, \n");
      out.write("            .product-info-tabs .nav-tabs .nav-link.active:hover {\n");
      out.write("                border: none; \n");
      out.write("                border-bottom: 2px solid #d8d8d8;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .product-info-tabs .tab-content .tab-pane {\n");
      out.write("                padding: 30px 20px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                line-height: 24px;\n");
      out.write("                color: #7a7a7a;\n");
      out.write("            }\n");
      out.write("            .review-form .form-group {\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("            .mb-20 {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .review-form .rate {\n");
      out.write("                float: none;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .review-heading {\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                line-height: 24px;\n");
      out.write("                margin-bottom: 6px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("            .review-form .form-control {\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .review-form input.form-control {\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            .review-form textarea.form-control {\n");
      out.write("                resize: none;\n");
      out.write("            }\n");
      out.write("            .review-form .round-black-btn {\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>        \n");
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
      out.write("                        <a class=\"nav-link disabled\" href=\"tutorial.html\">Hướng dẫn</a>\n");
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
      out.write("        <div class=\"pd-wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading-section\">\n");
      out.write("                    <h2>Chi tiết sản phẩm</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div id=\"kitimg\" class=\"d-flex justify-content-center\">\n");
      out.write("                            <img style=\"width: 400px; height: 500px\"  src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"product-dtl\">\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"product-name\"></div>\n");
      out.write("                                <div class=\"reviews-counter\">\n");
      out.write("                                    <div class=\"rate\">\n");
      out.write("                                        <input type=\"radio\" id=\"star5\" name=\"rate\" value=\"5\" checked/>\n");
      out.write("                                        <label for=\"star5\" title=\"text\">5 stars</label>\n");
      out.write("                                        <input type=\"radio\" id=\"star4\" name=\"rate\" value=\"4\" />\n");
      out.write("                                        <label for=\"star4\" title=\"text\">4 stars</label>\n");
      out.write("                                        <input type=\"radio\" id=\"star3\" name=\"rate\" value=\"3\" />\n");
      out.write("                                        <label for=\"star3\" title=\"text\">3 stars</label>\n");
      out.write("                                        <input type=\"radio\" id=\"star2\" name=\"rate\" value=\"2\" />\n");
      out.write("                                        <label for=\"star2\" title=\"text\">2 stars</label>\n");
      out.write("                                        <input type=\"radio\" id=\"star1\" name=\"rate\" value=\"1\" />\n");
      out.write("                                        <label for=\"star1\" title=\"text\">1 star</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-price-discount text-danger\"><span>\n");
      out.write("                                        ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("</span></div>\n");
      out.write("                                <!--                                <span class=\"line-through\">$29.00</span>-->\n");
      out.write("                            </div>\n");
      out.write("                            <p>\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                Brand: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.brandId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <form action=\"addcart\">\n");
      out.write("                                        <label for=\"\">ID</label> \n");
      out.write("                                        \n");
      out.write("                                        <br>\n");
      out.write("                                        <input type=\"text\" name=\"Id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly> <br>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label for=\"size\">Quantity</label>\n");
      out.write("                                        <div class=\"display-flex\">\n");
      out.write("                                            <div class=\"qtyminus\"><button type=\"button\" class=\"btn btn-dark\">-</button></div>\n");
      out.write("                                            <input type=\"text\" size=\"1\" name=\"quantity\" value=\"1\" class=\"qty align-center\">\n");
      out.write("                                            <div class=\"qtyplus\"><button type=\"button\" class=\"btn btn-dark\">+</button></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" class=\"round-black-btn\" value=\"Add to Cart\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-info-tabs\">\n");
      out.write("                    <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" id=\"description-tab\" data-toggle=\"tab\" href=\"#description\" role=\"tab\" aria-controls=\"description\" aria-selected=\"true\">Mô tả</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"description\" role=\"tabpanel\" aria-labelledby=\"description-tab\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.des}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            Dear customers: this price is for in-stock items, you can order or pre-order for better prices if you dont might to wait for about 7 days. \n");
      out.write("                            </br> Please contact us with this facebook address: «Tung Figure Shop» for a good price. Thank you.\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setType("number");
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(2);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }
}
