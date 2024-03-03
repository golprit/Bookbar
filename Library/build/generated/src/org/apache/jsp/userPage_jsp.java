package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <title>BookBar</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/icon\" href=\"assets/images/favicon.ico\"/>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Slick slider -->\n");
      out.write("        <link href=\"assets/css/slick.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Theme color -->\n");
      out.write("        <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Main Style -->\n");
      out.write("        <link href=\"Front/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" />\n");
      out.write("        <!-- Fonts -->\n");
      out.write("\n");
      out.write("        <!-- Open Sans for body font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700,800\" rel=\"stylesheet\">\n");
      out.write("        <!-- Lato for Title -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Start Header -->\n");
      out.write("        <header id=\"mu-header\" class=\"\" role=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-default mu-navbar\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <!-- Text Logo -->\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.html\"><i class=\"fa fa-book\" aria-hidden=\"true\"></i> BookBar</a>\n");
      out.write("\n");
      out.write("                            <!-- Image Logo -->\n");
      out.write("                            <!-- <a class=\"navbar-brand\" href=\"index.html\"><img src=\"assets/images/logo.png\"></a> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav mu-menu navbar-right\">\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">\n");
      out.write("                                        <select style=\"background-color: #ff871c; border-color: #ff871c;\" Name=\"Home\" Size=\"\">  \n");
      out.write("                                            <option>At Home</option>  \n");
      out.write("                                            <option>At Library </option>  \n");
      out.write("                                        </select>  \n");
      out.write("                                    </a></li>\n");
      out.write("                                <li> <a href=\"\">Book History</a> </li>\n");
      out.write("                                <li><a href=\"#mu-contact\">CONTACT</a></li>\n");
      out.write("                                <li><a href=\"\">LOGOUT</a></li>\n");
      out.write("                                <span class=\"icon\">\n");
      out.write("                                    <a href=\"user.html\"><span class = \"fa fa-user-circle-o fa-spin fa-3x\" style=\"color: #f5f5f5;\" ></span></a>\n");
      out.write("                                </span>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- End Header -->\n");
      out.write("\n");
      out.write("        <!-- Start Featured Slider -->\n");
      out.write("\n");
      out.write("        <section id=\"mu-hero\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-sm-push-6\">\n");
      out.write("                        <div class=\"mu-hero-right\">\n");
      out.write("                            <img src=\"assets/images/l2.jpg\" alt=\"Ebook img\" height=\"300px\" width=\"800px\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-sm-pull-6\">\n");
      out.write("                        <div class=\"mu-hero-left\">\n");
      out.write("                            <h1>Perfect Landing Page Template to Present Your eBook</h1>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quam saepe, recusandae quidem nulla! Eveniet explicabo perferendis aut, ab quos omnis labore laboriosam quisquam hic deserunt ipsum maxime aspernatur velit impedit.</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <main role=\"main\">\n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"margin-top: 50%; margin-bottom: 10%;\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">id</th>\n");
      out.write("                        <th scope=\"col\">UserName</th>\n");
      out.write("                        <th scope=\"col\">Email</th>\n");
      out.write("                        <th scope=\"col\">Password</th>\n");
      out.write("                        <th scope=\"col\">Date</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">1</th>\n");
      out.write("                        <td>Mark</td>\n");
      out.write("                        <td>Otto</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                 \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">2</th>\n");
      out.write("                        <td>Jacob</td>\n");
      out.write("                        <td>Thornton</td>\n");
      out.write("                        <td>@fat</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">3</th>\n");
      out.write("                        <td>Larry</td>\n");
      out.write("                        <td>the Bird</td>\n");
      out.write("                        <td>@twitter</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">4</th>\n");
      out.write("                        <td>Larry</td>\n");
      out.write("                        <td>the Bird</td>\n");
      out.write("                        <td>@twitter</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">5</th>\n");
      out.write("                        <td>Larry</td>\n");
      out.write("                        <td>the Bird</td>\n");
      out.write("                        <td>@twitter</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- jQuery library -->\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("            <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("            <!-- Bootstrap -->\n");
      out.write("            <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("            <!-- Slick slider -->\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/slick.min.js\"></script>\n");
      out.write("            <!-- Counter js -->\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/counter.js\"></script>\n");
      out.write("            <!-- Ajax contact form  -->\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Custom js -->\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
