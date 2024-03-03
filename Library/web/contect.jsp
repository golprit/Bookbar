<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>BookBar</title>
        <!-- Favicon -->
        <link rel="shortcut icon" type="image/icon" href="assets/images/favicon.ico"/>
        <!-- Font Awesome -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
        <!-- Bootstrap -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <!-- Slick slider -->
        <link href="assets/css/slick.css" rel="stylesheet">
        <!-- Theme color -->
        <link id="switcher" href="assets/css/theme-color/default-theme.css" rel="stylesheet">

        <!-- Main Style -->
        <link href="Front/css/style.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
        <!-- Fonts -->

        <!-- Open Sans for body font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700,800" rel="stylesheet">
        <!-- Lato for Title -->
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet"> 


        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>


        <!-- Start Header -->
        <header id="mu-header" class="" role="banner">
            <div class="container">
                <nav class="navbar navbar-default mu-navbar">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>

                            <!-- Text Logo -->
                        <a class="navbar-brand" href="index.html"><img src="image/logo.png" alt="" style="height: 65px;"/></a> 


                            <!-- Image Logo -->
                            <!-- <a class="navbar-brand" href="index.html"><img src="assets/images/logo.png"></a> -->


                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav mu-menu navbar-right">

                                 <li><a href="athome.jsp"> At Home</a></li>
                                <li><a href="atlib.jsp"> At Library</a></li>
                                <li> <a href="bookhistory.jsp">Book History</a> </li>
                                <li><a href="contect.jsp">Contact</a></li>
                                <li><a href="">LOGOUT</a></li>
                                <span class="icon">
                                    <a href="userPage.jsp"><span class = "fa fa-user-circle-o fa-spin fa-3x" style="color: #f5f5f5;" ></span></a>
                                </span>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
            </div>
        </header>
        <!-- End Header -->

        <!-- Start Featured Slider -->

        <section id="mu-hero">
            <div class="container">
                <div class="row">

                    <div class="col-md-6 col-sm-6 col-sm-push-6">
                        <div class="mu-hero-right">
                            <img src="assets/images/l2.jpg" alt="Ebook img" height="300px" width="800px">
                        </div>
                    </div>

                    <div class="col-md-6 col-sm-6 col-sm-pull-6">
                        <div class="mu-hero-left">
                            <h1>Perfect Landing Page Template to Present Your eBook</h1>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quam saepe, recusandae quidem nulla! Eveniet explicabo perferendis aut, ab quos omnis labore laboriosam quisquam hic deserunt ipsum maxime aspernatur velit impedit.</p>

                        </div>
                    </div>	

                </div>
            </div>
        </section>

      

<!-- Start Contact Content -->
                                <div class="mu-contact-content">

                                    <div id="form-messages"></div>
                                    <form id="ajax-contact" action="Contact" method="post"  class="mu-contact-form">
                                        <div class="form-group">                
                                            <input type="text" class="form-control" placeholder="Name" id="name" name="name" required>
                                        </div>
                                        <div class="form-group">                
                                            <input type="email" class="form-control" placeholder="Enter Email" id="email" name="email" required>
                                        </div>              
                                        <div class="form-group">
                                            <textarea class="form-control" placeholder="Message" id="message" name="message" required></textarea>
                                        </div>
                                        <button type="submit" class="mu-send-msg-btn"><span>SUBMIT</span></button>
                                    </form>

                                </div>
                                <!-- End Contact Content -->

            <!-- jQuery library -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
            <!-- Include all compiled plugins (below), or include individual files as needed -->
            <!-- Bootstrap -->
            <script src="assets/js/bootstrap.min.js"></script>
            <!-- Slick slider -->
            <script type="text/javascript" src="assets/js/slick.min.js"></script>
            <!-- Counter js -->
            <script type="text/javascript" src="assets/js/counter.js"></script>
            <!-- Ajax contact form  -->
            <script type="text/javascript" src="assets/js/app.js"></script>



            <!-- Custom js -->
            <script type="text/javascript" src="assets/js/custom.js"></script>


    </body>
</html>