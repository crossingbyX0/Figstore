package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("              #header{\n");
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
      out.write("        </style>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"home.jsp\"><img src=\"images/yukinagato.png\" style=\"width: 50px; \" >\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Introduce.html\">Giới thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            SAN PHAM\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Figma</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">SHF</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Nendoroid</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\"><img src=\"images/UniconicIcon.jpg\" style=\"width: 40px; height: 30px\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"tutorial.html\">Hướng dẫn</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"\">\n");
      out.write("                            <span class=\"glyphicon glyiconuser\"></span>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </a>\n");
      out.write("                    </li><li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"\">\n");
      out.write("                            đăng xuất\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
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
}
