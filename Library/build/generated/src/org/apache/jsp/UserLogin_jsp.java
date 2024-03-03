package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bookbar.com.helper.Message;

public final class UserLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<a href=\"../../src/java/bookbar/com/servlet/userLogin.java\"></a>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>login</title>\n");
      out.write("   <link rel=\"shortcut icon\" type=\"image/icon\" href=\"assets/images/favicon.ico\"/>\n");
      out.write("        <link href=\"Front/css/file2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <a href=\"index.jsp\"><span class=\"icon-close\">\n");
      out.write("                    <ion-icon name=\"close\"></ion-icon>\n");
      out.write("                </span></a>\n");
      out.write("\n");
      out.write("            <div class=\"form-box login\">\n");
      out.write("                <h2>LOGIN</h2>\n");
      out.write("                <form  action=\"http://localhost:8080/Library/userLogin\" method=\"post\"  >\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"mail\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"email\" name=\"em\" required>\n");
      out.write("                        <label>Email</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"lock-closed\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"password\" name=\"ps\" maxlength=\"8\" required>\n");
      out.write("                        <label>password</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"remember-forgot\">\n");
      out.write("                        <label><input type=\"checkbox\">\n");
      out.write("                            Remember-me\n");
      out.write("                        </label>\n");
      out.write("                        <a href=\"\">forgot password</a>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" name=\"submit\" class=\"btn\">\n");
      out.write("                    <div class=\"login-register\">\n");
      out.write("                        <p>Don't have an account\n");
      out.write("                            <a href=\"RegisterPage.jsp\" class=\"register-link\">Register</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                        ");


                                Message data = (Message) session.getAttribute("msg");
                                if (data != null) {
                            
      out.write("\n");
      out.write("                            <div class=\"alert ");
      out.print( data.getError() );
      out.write("\" role=\"alert\">\n");
      out.write("                               ");
      out.print( data.getMsg() );
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                    session.removeAttribute("msg");
                                }


                            
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"script.js\"></script>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\n");
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
}
