package org.apache.jsp.Front;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <title>Register</title>\n");
      out.write("        <!-- <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"logo.png\">\n");
      out.write("        -->\n");
      out.write("        <link href=\"css/file3.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"  crossorigin=\"anonymous\"/>\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("\n");
      out.write("    </head>          \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <a href=\"home.php\"> <span class=\"icon-close\">\n");
      out.write("                    <ion-icon name=\"close\"></ion-icon>  \n");
      out.write("                </span></a>\n");
      out.write("\n");
      out.write("            <div class=\"form-box register\">\n");
      out.write("                <h2>REGISTRATION</h2>\n");
      out.write("                <form id=\"reg\" action=\"http://localhost:8080/Library/userReg\" method=\"post\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"person\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"text\" name=\"nm\"required>\n");
      out.write("                        <label>Username</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\" style=\"margin-top:10%;\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"mail\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"email\" name=\"email\"required>\n");
      out.write("                        <label>Email</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"lock-closed\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"password\" maxlength=\"8\" name=\"ps\" required>\n");
      out.write("                        <label>password</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"remember-forgot\">\n");
      out.write("                        <label><input type=\"checkbox\">\n");
      out.write("                            I agree to the terms & conditions\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Register\" class=\"btn\">\n");
      out.write("                    <div class=\"login-register\">\n");
      out.write("                        <p>Already have an account\n");
      out.write("                            <a href=\"UserLogin.jsp\" class=\"login-link\">Login</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"script.js\"></script>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.7.1.min.js\" integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("</html>\n");
      out.write("   <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                console.log(\"document loded...\");\n");
      out.write("                $('#reg').on('submit', function (event) {\n");
      out.write("                    \n");
      out.write("                    event.preventDefault();\n");
      out.write("\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("\n");
      out.write("                    $(\"#submit-btn\").hide();\n");
      out.write("                    \n");
      out.write("                    //send requst in servlet\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"http://localhost:8080/Library/userReg\",\n");
      out.write("                        type: 'post',\n");
      out.write("                        data: form,\n");
      out.write("                        success: function (data, textstatus, jqXHR) {\n");
      out.write("                            console.log(data)\n");
      out.write("\n");
      out.write("\n");
      out.write("                            $(\"#submit-btn\").show();\n");
      out.write("                          \n");
      out.write("\n");
      out.write("                            if (data.trim() === 'DONE') {\n");
      out.write("\n");
      out.write("                                swal(\"Registration Successful. we are going to rediracting login page.\")\n");
      out.write("                                        .then((value) => {\n");
      out.write("                                            window.location = \"UserLogin.jsp\";\n");
      out.write("                                        });\n");
      out.write("                            }\n");
      out.write("                            else{\n");
      out.write("                                \n");
      out.write("                               swal(data);\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                            swal(\"Try Again\");\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            $(\"#submit-btn\").show();\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>");
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
