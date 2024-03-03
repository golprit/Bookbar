<%@page import="bookbar.com.helper.Message"%>
<a href="../../src/java/bookbar/com/servlet/userLogin.java"></a>
<html>
    <head>
        <title>login</title>
   <link rel="shortcut icon" type="image/icon" href="assets/images/favicon.ico"/>
        <link href="Front/css/file2.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"  crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   
    </head>
    <body>
        <div class="wrapper">
            <a href="index.jsp"><span class="icon-close">
                    <ion-icon name="close"></ion-icon>
                </span></a>

            <div class="form-box login">
                <h2>LOGIN</h2>
                <form  action="http://localhost:8080/Library/userLogin" method="post"  >
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="mail"></ion-icon>
                        </span>
                        <input type="email" name="em" required>
                        <label>Email</label>
                    </div>
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="lock-closed"></ion-icon>
                        </span>
                        <input type="password" name="ps" maxlength="8" required>
                        <label>password</label>
                    </div>
                    <div class="remember-forgot">
                        <label><input type="checkbox">
                            Remember-me
                        </label>
                        <a href="">forgot password</a>
                    </div>
                    <input type="submit" name="submit" class="btn">
                    <div class="login-register">
                        <p>Don't have an account
                            <a href="RegisterPage.jsp" class="register-link">Register</a>
                        </p>
                    </div>

                </form>

                        <%

                                Message data = (Message) session.getAttribute("msg");
                                if (data != null) {
                            %>
                            <div class="alert <%= data.getError() %>" role="alert">
                               <%= data.getMsg() %>
                            </div>
                            <%
                                    session.removeAttribute("msg");
                                }


                            %>

            </div>
        </div>
        <script src="script.js"></script>
        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

    </body>
</html>
