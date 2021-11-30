package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dal.AccountDAO;
import dal.CartDAO;
import dal.DBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Cart;

/**
 *
 * @author atung
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
//        String roleId= request.getParameter("roleId");
//        int role = Integer.parseInt(roleId);
        String r = request.getParameter("rem");
        AccountDAO db = new AccountDAO();
        Account a = db.getAccount(user, pass);

        if (a == null) {
//            request.getSession().setAttribute("account", a);

            request.setAttribute("error", user + " chua ton tai");
            request.getRequestDispatcher("login.jsp").forward(request, response);

        } else {
            HttpSession session = request.getSession();
            session.setAttribute("account", a);
            CartDAO cdb = new CartDAO();
            Cart cart = cdb.getCart(user);
            session.setAttribute("cart", cart);
          
            //tao cookie
            Cookie cu = new Cookie("user", user);
            Cookie cp = new Cookie("pass", pass);
            Cookie cr = new Cookie("rem", r);

            if (r != null) {

                cu.setMaxAge(60 * 60 * 24);
                cp.setMaxAge(60 * 60 * 24);
                cr.setMaxAge(60 * 60 * 24);

                response.addCookie(cu);
                response.addCookie(cp);
                response.addCookie(cr);


                response.sendRedirect("home");

            } else {
                cu.setMaxAge(0);
                cp.setMaxAge(0);
                cr.setMaxAge(0);
                response.sendRedirect("home");
            }

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
