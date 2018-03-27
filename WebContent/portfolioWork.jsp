<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
	<script>
		function OpenTemplate() {
		    var x = document.getElementById("myDIV");
		    if (x.style.display === "none") {
		        x.style.display = "block";
		    } else {
		        x.style.display = "none";
		    }
		}
	</script>
    <title>Work portfolio</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendorPortfolio/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="icon" href="favicon.ico">
    <!-- Custom Fonts -->
    <link href="vendorPortfolio/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="vendorPortfolio/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.min.css" rel="stylesheet">

  </head>

  <body id="page-top">
    <!-- Header -->
    <header class="masthead d-flex">
      <div class="container text-center my-auto">
        <h1 class="mb-1">Welcome to portfolio</h1>
        <h3 class="mb-5">
          <em>your activity can keep in portfolio</em>
        </h3>
        <a class="btn btn-primary btn-xl js-scroll-trigger" href="#listPortfolio">Let start</a>
      </div>
      <div class="overlay"></div>
    </header>
    <section  class="content-section bg-primary text-white text-center" id="listPortfolio">     
    	<div class="container text-center my-auto">
	        <h1 class="mb-1">list of Portfolio </h1>
		        <h3 class="mb-5">
		          <em></em>
		        </h3>
	        <a class="btn btn-primary btn-xl js-scroll-trigger" href="#SchoolOf">Let start</a>
      </div>
      <div class="overlay"></div>
    </section>   
    
  	<section class="content-section" id="SchoolOf">    
  		<div class="container">
        <div class="content-section-heading text-center">
          <h3 class="text-secondary mb-0">Choose</h3>
          <h2 class="mb-5">School of</h2>
        </div>
        <div class="row no-gutters">
          <div class="col-lg-6">
            <a class="portfolio-item" href="#templateOfIt" onclick="OpenTemplate()">
              <span class="caption">
                <span class="caption-content">
                  <h2>IT</h2>
                  <p class="mb-0">Informations </p>
                </span>
              </span>
              <img class="img-fluid" src="img/portfolio-1.jpg" alt="">
            </a>
          </div>
        </div>
      </div>
    </section>
     <div class="container" id="myDIV" style="display: none;">
    <section  id="templateOfIt" >  
        <div class="content-section-heading text-center">
          <h3 class="text-secondary mb-0">Portfolio</h3>
          <h2 class="mb-5">template</h2>
        </div>
        <div class="row no-gutters">
          <div class="col-lg-6">
            <a class="portfolio-item" href="listActivityForPortfolio.do">
              <span class="caption">
                <span class="caption-content">
                  <h2>Stationary</h2>
                  <p class="mb-0">A yellow pencil with envelopes on a clean, blue backdrop!</p>
                </span>
              </span>
              <img class="img-fluid" src="img/portfolio-1.jpg" alt="">
            </a>
          </div>
          <div class="col-lg-6">
            <a class="portfolio-item" href="listActivityForPortfolio.do">
              <span class="caption">
                <span class="caption-content">
                  <h2>Ice Cream</h2>
                  <p class="mb-0">A dark blue background with a colored pencil, a clip, and a tiny ice cream cone!</p>
                </span>
              </span>
              <img class="img-fluid" src="img/portfolio-2.jpg" alt="">
            </a>
          </div>
          <div class="col-lg-6">
            <a class="portfolio-item" href="listActivityForPortfolio.do">
              <span class="caption">
                <span class="caption-content">
                  <h2>Strawberries</h2>
                  <p class="mb-0">Strawberries are such a tasty snack, especially with a little sugar on top!</p>
                </span>
              </span>
              <img class="img-fluid" src="img/portfolio-3.jpg" alt="">
            </a>
          </div>
          <div class="col-lg-6">
            <a class="portfolio-item" href="listActivityForPortfolio.do">
              <span class="caption">
                <span class="caption-content">
                  <h2>Workspace</h2>
                  <p class="mb-0">A yellow workspace with some scissors, pencils, and other objects.</p>
                </span>
              </span>
              <img class="img-fluid" src="img/portfolio-4.jpg" alt="">
            </a>
          </div>
        </div>
        </section>
      </div>
    
    
    <!-- Footer -->
    <footer class="footer text-center">
      <div class="container">
        <ul class="list-inline mb-5">
        </ul>
        <p class="text-muted small mb-0">Goodlack&copy;in interview</p>
      </div>
    </footer>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded js-scroll-trigger" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>

    <!-- Bootstrap core JavaScript -->
    <script src="vendorPortfolio/jquery/jquery.min.js"></script>
    <script src="vendorPortfolio/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendorPortfolio/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/stylish-portfolio.min.js"></script>

  </body>

</html>
