<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>Profile</title>
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

<body >

	<header role="banner" class="transparent light">
		<div class="row">
			<div
				class="nav-inner row-content buffer-left buffer-right even clear-after">
				<div id="brand">
					<h1 class="reset">
						<a href="studentHomepage.do">Portlity</a>
					</h1>
				</div>
				<!-- brand -->
				<a id="menu-toggle" href="#"><i class="fa fa-bars fa-lg"></i></a>
				<nav>
					<ul class="reset" role="navigation">
						<li class="menu-item"><a href="studentHomepage.do">Home</a></li>
						<li class="menu-item"><a href="editDataSutent.do">Personal</a>
						</li>
						<li class="menu-item"><a href="listActivityList.do">Activity</a>
						</li>
						<li class="menu-item"><a>Portfolio</a>
							<ul class="sub-menu">
								<li><a href="portfolioWork.jsp">Work portfolio</a></li>
							 
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

	
	<section class="row section">
		<div class="row-content buffer even clear-after">
			<div class="column nine">
			<div class="header">
								<h1 class="title">Edit Profile</h1>
							</div>
				<div class="content">
				<form:form method="post" action="savePersonal.do" commandName="user">
					<c:forEach items="${listuser}" var="listuser">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group">
									<label></label> First Name
									<form:input type="text" class="name plain buffer"
										value="${listuser.firstName}" path="firstName" />
								</div>
							</div>
							<div class="col-md-5">
								<div class="form-group">
									<label></label> Last Name
									<form:input type="text" class="name plain buffer"
										placeholder="Last Name" value="${listuser.surName}"
										path="surName" />
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-9">
								<div class="form-group">
									<label>Home Address</label>
									<form:input type="text" class="name plain buffer"
										placeholder="" value="${listuser.address}" path="address" />
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label>Email</label>
									<form:input type="email" class="name plain buffer"
										placeholder="" value="${listuser.email}" path="email" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Nicname</label>
									<form:input type="text" class="name plain buffer"
										placeholder="Country" value="${listuser.nicName}"
										path="nicName" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Phone</label>
									<form:input type="text" class="name plain buffer"
										placeholder="ZIP Code" value="${listuser.phone}" path="phone" />
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label>Higth</label>
									<form:input type="text" class="name plain buffer"
										value="${listuser.hight}" path="hight" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Wigth</label>
									<form:input type="text" class="name plain buffer"
										value="${listuser.wight}" path="wight" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Age</label>
									<form:input type="text" class="name plain buffer"
										value="${listuser.age}" path="age" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label>Primary</label>
									<form:input type="text" class="name plain buffer"
										value="${listuser.historyEducattionPrimary}"
										path="historyEducattionPrimary" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Education Hihgthschool 1-3 </label>
									<form:input type="text" class="name plain buffer"
										placeholder="ZIP Code"
										value="${listuser.historyEducattionHihgthschool13}"
										path="historyEducattionHihgthschool13" />
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label>Education Hihgthschool 4-6 </label>
									<form:input type="text" class="name plain buffer"
										placeholder="ZIP Code"
										value="${listuser.historyEducattionHihgthschool46}"
										path="historyEducattionHihgthschool46" />
								</div>
							</div>
						</div>

						
							<input type="submit" class="plain button red" 
								value="Update Profile" />
					
					</c:forEach>
				</form:form>
				
			</div>
			</div>
		</div>
	</section>
	<!-- main -->

	<footer role="contentinfo">
        <div class="row">
            <div class="row-content buffer clear-after">
                <section id="top-footer">
                    <div class="widget column three">
                        <!-- la class="widget" � forse generata utomaticamente da wp -->
                       
                    </div>
                    <div class="widget column three">
                        <h4>Portlity</h4>
                        <p>This web application create for student everyone and it free</p>
                    </div>
                    <div class="widget meta-social column three">
                        <h4>Follow Us</h4>
                        <ul class="inline">
                           
                            <li><a href="https://www.facebook.com/profile.php?id=100008621857819" class="facebook-share border-box"><i class="fa fa-facebook fa-lg"></i></a></li>
                    
                        </ul>
                    </div>
                </section>
                <!-- top-footer -->
                <section id="bottom-footer">
                    <p class="keep-left">&copy; 2018 <a href="" alt="Mokaine Lab">Portlity</a>.</p>
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
