<html>
    <head>
        <script>

        </script>

        <title>Register</title>
        <!-- <link rel="shortcut icon" type="image/x-icon" href="logo.png">
        --><link rel="shortcut icon" type="image/icon" href="assets/images/favicon.ico"/>
        <link href="Front/css/file3.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"  crossorigin="anonymous"/>
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>

    </head>          
    <body>

        <div class="wrapper">
            <a href="index.jsp"><span class="icon-close">
                    <ion-icon name="close"></ion-icon>
                </span></a>

            <div class="form-box register">
                <h2>REGISTRATION</h2>
                <form id="reg" action="userReg" method="post">
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="person"></ion-icon>
                        </span>
                        <input type="text" name="nm"required>
                        <label>Username</label>
                    </div>
                    <div class="input-box" style="margin-top:10%;">
                        <span class="icon">
                            <ion-icon name="mail"></ion-icon>
                        </span>
                        <input type="email" name="email"required>
                        <label>Email</label>
                    </div>
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="lock-closed"></ion-icon>
                        </span>
                        <input type="password" maxlength="8" name="ps" required>
                        <label>password</label>
                    </div>
                    <div class="remember-forgot">
                        <label><input type="checkbox">
                            I agree to the terms & conditions
                        </label>

                    </div>
                    <input type="submit" name="submit" value="Register" class="btn" id="submit-btn">
                    <div class="login-register">
                        <p>Already have an account
                            <a href="UserLogin.jsp" class="login-link">Login</a>
                        </p>
                    </div>

                   
                </form>



            </div>
        </div>
        <script src="script.js"></script>
        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

    </body>

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</html>
  
