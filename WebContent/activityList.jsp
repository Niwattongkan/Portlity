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
<title>Beetle - Works 3 Columns</title>
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
</head>

<body class="portfolio">

	<header role="banner" class="transparent light">
		<div class="row">
			<div
				class="nav-inner row-content buffer-left buffer-right even clear-after">
				<div id="brand">
					<h1 class="reset">
						<!--<img src="img/logo.png" alt="logo">-->
						<a href="studentHomepage.jsp">Portlity</a>
					</h1>
				</div>
				<!-- brand -->
				<a id="menu-toggle" href="#"><i class="fa fa-bars fa-lg"></i></a>
				<nav>
					<ul class="reset" role="navigation">
						<li class="menu-item"><a href="studentHomepage.jsp">Home</a>
						</li>
						<li class="menu-item"><a href="editDataSutent.do">Personal</a>
						</li>
						<li class="menu-item"><a href="#">Activity</a></li>
						<li class="menu-item"><a>Portfolio</a>
							<ul class="sub-menu">
								<li><a href="portfolioWork.jsp">Work portfolio</a></li>
								<li><a href="examplePortfolio.jsp">Example portfolio</a></li>
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
	<div id="intro-wrap" class="full-height">
		<div id="intro" class="preload darken more-button">
			<div class="intro-item"
				style="background-image: url(images/activity.jpg);">
				<div class="caption">
					<h2>Activity portfolio</h2>
					<p>You can add an event by yourself.</p>
				</div>
				<!-- caption -->
			</div>
		</div>
		<!-- intro -->
	</div>
	<!-- intro-wrap -->

	<div id="main" class="row">
		<div class="row-content buffer clear-after">
			<ul class="inline cats filter-options">
			<a class="button red" href="#"><i class="icon icon-add"></i>Activity</a>							
			</ul>
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
