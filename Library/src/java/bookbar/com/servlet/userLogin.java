package bookbar.com.servlet;

import bookbar.com.dao.userData;
import bookbar.com.entity.userInfo;
import bookbar.com.helper.DbConnection;
import bookbar.com.helper.Message;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class userLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String email = request.getParameter("em");
            String pass = request.getParameter("ps");

            userInfo ui = new userInfo();
            ui.setEmail(email);
            ui.setPassword(pass);

            userData ud = new userData(DbConnection.connectionProvider());

            if (ud.selectUser(ui)) {
                HttpSession ss = request.getSession(true);
                ss.setAttribute("user", email);
                response.sendRedirect("order.jsp");
            } else {
                HttpSession ss = request.getSession(true);
                Message ms = new Message();
                ms.setMsg("Enter valid username password!");
                ms.setRoll("alert");
                ms.setError("alert alert-danger");

                ss.setAttribute("msg", ms);
                response.sendRedirect("UserLogin.jsp");
            }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
