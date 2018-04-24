<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="The Page Description">
<style type="text/css">
@
-ms-viewport {
	width: device-width;
}
</style>
<title>Portlity - Activity</title>
<link rel="stylesheet" href="css/layers.min.css" media="screen">
<link rel="stylesheet" href="css/font-awesome.min.css" media="screen">
<link rel="stylesheet" href="style.css" media="screen">
<link
	href='http://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400italic,700italic,400,700'
	rel='stylesheet' type='text/css'>
<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		<![endif]-->
<link rel="icon" href="favicon.ico">
<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="img/apple-touch-icon-76x76.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="img/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="img/apple-touch-icon-152x152.png">
	
	<meta name="google-signin-client_id" content="322812928410-ru9dr6in3oa9gcqbu6tefptb61fd1pt9.apps.googleusercontent.com">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://apis.google.com/js/platform.js" async defer></script>
 	<script src="https://apis.google.com/js/platform.js?onload=init" async
	defer></script>
	<script>
    function signOut() {
        var auth2 = gapi.auth2.getAuthInstance();
        auth2.signOut().then(function () {
          console.log('User signed out.');
        });
      }

      function onLoad() {
        gapi.load('auth2', function() {
          gapi.auth2.init();
        });
      }
	</script>
	<script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
</head>

<body class="portfolio">

	<header role="banner" class="transparent light">
		<div class="row">
			<div
				class="nav-inner row-content buffer-left buffer-right even clear-after">
				<div id="brand">
					<h1 class="reset">
						<!--<img src="img/logo.png" alt="logo">-->
						<a href="studentHomepage.do">Portlity</a>
					</h1>
				</div>
				<!-- brand -->
				<a id="menu-toggle" href="#"><i class="fa fa-bars fa-lg"></i></a>
				<nav>
					<ul class="reset" role="navigation">
						<li class="menu-item"><a href="studentHomepage.do">Home</a>
						</li>
						<li class="menu-item"><a href="editDataSutent.do">Personal</a>
						</li>
						<li class="menu-item"><a href="#">Activity</a></li>
						<li class="menu-item"><a>Portfolio</a>
							<ul class="sub-menu">
								<li><a href="portfolioWork.jsp">Work portfolio</a></li>
								<li><a href="portfolioExample.jsp">Example portfolio</a></li>
							</ul></li>
						<li class="menu-item"><a href="studentLogin.jsp"
							onclick="signOut();">Sign off</a></li>
					</ul>
				</nav>
			</div>
			<!-- row-content -->
		</div>
		<!-- row -->
	</header>
	<main role="main">
			<div id="intro-wrap">
					<div id="intro" class="preload" data-autoplay="5000" data-navigation="true" data-pagination="true" data-transition="fade">					
						<div class="intro-item" style="background-color: #65C2E1;">		
							<div class="intro-mockup-wrapper">		
								<div class="caption-mockup caption-right column six last-special">
									<h2>Template Information Technology</h2>
									<p>You can create portfolio after you cerate activity.
								</div><!-- caption -->
								<div class="intro-mockup intro-left column six">
									<img src="images/pictures/InformationTechnology/cover.jpg" alt="">
								</div><!-- intro-mockup -->							
							</div><!-- intro-mockup-wrapper -->
						</div>					
						<div class="intro-item" style="background-color: #f5be55;">
							<div class="intro-mockup-wrapper">						
								<div class="caption-mockup">
									<h2>Template shool of Law</h2>
									<p>You can create portfolio after you cerate activity.</p>
								</div><!-- caption -->	
								<div class="photocaption">
									
								</div><!-- photocaption -->													
								<div class="intro-mockup">
									<img src="images/pictures/Law/personal.jpg" alt="">
								</div><!-- intro-mockup -->	
							</div><!-- intro-mockup-wrapper -->										
						</div>
						<div class="intro-item" style="background-color: #6b3f4f;">
							<div class="intro-mockup-wrapper">
								<div class="caption-mockup caption-left column six">
									<h2>Template shool of Nurse</h2>
									<p>Although nursing practice varies both through its.
								</div><!-- caption -->												
								<div class="intro-mockup intro-right column six last">
									<img src="images/pictures/Nurse/cover.jpg" alt="">
								</div><!-- intro-mockup -->	
							</div><!-- intro-mockup-wrapper -->
						</div>	
						<div class="intro-item" style="background-color: #32cba3;">
							<div class="intro-mockup-wrapper">						
								<div class="caption-mockup">
									<h2>Create portfolio of Science</h2>
									<a class="button white transparent" href="portfolioPrintScience.jsp">Cerate</a>
								</div><!-- caption -->	
								<div class="photocaption">
								
								</div><!-- photocaption -->													
								<div class="intro-mockup">
									<img src="images/pictures/Science/cover.jpg" alt="">
								</div><!-- intro-mockup -->	
							</div><!-- intro-mockup-wrapper -->										
						</div>
					</div><!-- intro -->
				</div><!-- intro-wrap -->
	<div id="main" class="row">
	
	<section class="row section call-to-action">
			<div class="row-content buffer even">
				<p>You can add information each a day</p>
				<a class="button aqua" href="listTemplateActivity.do"> Add your activity!</a>
			</div>
	</section>

	<section class="row section text-light" style="background-color: #FC6E51">
			<div class="row-content buffer even clear-after">
				
				<c:forEach items="${listActivity}" var="listActivity">
					<div class="column four centertxt">
						<div class="big-icon red">
							<i class="icon icon-flash"></i>
						</div>
						<div class="big-icon-text clear-after">
							<h4>${list.activityId}</h4>
							<p class="text-s">${list.page}</p>
							<a class="button transparent white" href="deleteActivity.do?id=${listActivity.activityId}">Delete</a>
						</div>
					</div>
				</c:forEach>
			</div>
	</section>

		
	<div class="row-content buffer clear-after">
			<div class="grid-items portfolio-section preload">
				<ul class="inline cats filter-options">
					<c:forEach items="${listActivity}" var="listActivity">
					
					</c:forEach>
				</ul>
		</div>
	</div>
		<!-- row-content -->
	</div>
	<!-- row --> </main>
	<!-- main -->

	<footer role="contentinfo">
		<div class="row">
			<div class="row-content buffer clear-after">
				<section id="top-footer">
					<div class="widget column three">
						<!-- la class="widget" è forse generata utomaticamente da wp -->
						<h4>Menu</h4>
						<ul class="plain">
							<li><a href="home-01.html">Home</a></li>
							<li><a href="works-3-columns.html">Portfolio</a></li>
							<li><a href="blog-4-columns-masonry.html">Blog</a></li>
							<li><a href="resume.html">Resume</a></li>
							<li><a
								href="file:///Users/pasqualevitiello/My%20Folder/Job/Envato/PR%20Themeforest/Flattie/Markup/Beetle/contact.html">Contact</a></li>
						</ul>
					</div>
					<div class="widget column three">
						<h4>Portlity</h4>
						<p>This web application create for student everyone and it
							free</p>
					</div>
					<div class="widget meta-social column three">
						<h4>Follow Us</h4>
						<ul class="inline">
							<li><a href="#" class="twitter-share border-box"><i
									class="fa fa-twitter fa-lg"></i></a></li>
							<li><a href="#" class="facebook-share border-box"><i
									class="fa fa-facebook fa-lg"></i></a></li>
							<li><a href="#" class="pinterest-share border-box"><i
									class="fa fa-pinterest fa-lg"></i></a></li>
						</ul>
					</div>
				</section>
				<!-- top-footer -->
				<section id="bottom-footer">
					<p class="keep-left">
						&copy; 2018 <a href="" alt="Mokaine Lab">Portlity</a>.
					</p>
				</section>
				<!-- bottom-footer -->
			</div>
			<!-- row-content -->
		</div>
		<!-- row -->
	</footer>


	<script src="https://code.jquery.com/jquery.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script src="js/plugins.js"></script>
	<script src="js/beetle.js"></script>

</body>

</html>
