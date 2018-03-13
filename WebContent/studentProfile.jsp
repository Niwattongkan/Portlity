<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html lang="en">
<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="assetsPersonal/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="assetsPersonal/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<title>Your profile</title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />


<!-- Bootstrap core CSS     -->
<link href="assetsPersonal/css/bootstrap.min.css" rel="stylesheet" />

<!-- Animation library for notifications   -->
<link href="assetsPersonal/css/animate.min.css" rel="stylesheet" />

<!--  Paper Dashboard core CSS    -->
<link href="assetsPersonal/css/paper-dashboard.css" rel="stylesheet" />

<!--  CSS for Demo Purpose, don't include it in your project     -->
<link href="assetsPersonal/css/demo.css" rel="stylesheet" />

<!--  Fonts and icons     -->
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Muli:400,300'
	rel='stylesheet' type='text/css'>
<link href="assetsPersonal/css/themify-icons.css" rel="stylesheet">

</head>
<body>
	<div>
		<nav class="navbar navbar-default"></nav>
		<div class="content">
			<div class="container-fluid">
				<div class="row">
				<c:forEach items="${listuser}" var="listuser">
					<div class="col-lg-4 col-md-5">
						<div class="card card-user">
							<div class="image">
								<img src="assetsPersonal/img/background.jpg" alt="..." />
							</div>
							<div class="content">
								<div class="author">
									<img class="avatar border-white"
										src="assetsPersonal/img/faces/face-2.jpg" alt="..." />
									<h4 class="title">
										${listuser.name}<br />
									</h4>
								</div>
							</div>
							<hr>
							<div class="text-center">
								<div class="row">
									<div class="col-md-3 col-md-offset-1">
										<h5>
											1<br /> <small>Portfolio</small>
										</h5>
									</div>
									<div class="col-md-4">
										<h5>
											2<br /> <small>Activity</small>
										</h5>
									</div>
									<div class="col-md-3">
										<h5>
											${listuser.classroom}<br /> <small>Classroom</small>
										</h5>
									</div>
								</div>
							</div>
						</div>

					</div>
					<div class="col-lg-8 col-md-7">
						<div class="card">
							<div class="header">
								<h4 class="title">Edit Profile</h4>
							</div>
							<div class="content">
								<form>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label>${listuser.name}</label> <input type="text"
													class="form-control border-input" placeholder="First Name"
													value="Chet">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label>${listuser.surname}</label> <input type="text"
													class="form-control border-input" placeholder="Last Name"
													value="Faker">
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label>${listuser.address}</label> <input type="text"
													class="form-control border-input"
													placeholder="Home Address" value="Melbourne, Australia">
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-4">
											<div class="form-group">
												<label>${listuser.classroom}</label> <input type="text"
													class="form-control border-input" placeholder=""
													value="Melbourne">
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label>${listuser.email}</label> <input type="text"
													class="form-control border-input" placeholder="Country"
													value="Australia">
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<label>${listuser.nicname}</label> <input type="text"
													class="form-control border-input" placeholder="ZIP Code">
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label>${listuser.hight}</label> <input type="number"
													class="form-control border-input" placeholder="ZIP Code">
											</div>
										</div>
									</div>
									<div class="text-center">
										<button type="submit" class="btn btn-info btn-fill btn-wd">Update Profile</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
						</div>
					</div>
				</c:forEach>

				</div>
			</div>
		</div>


		<footer class="footer">
			<div class="container-fluid">
				<nav class="pull-left">					
				</nav>
				<div class="copyright pull-right">
				</div>
			</div>
		</footer>

	</div>
	</div>


</body>

<!--   Core JS Files   -->
<script src="assetsPersonal/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assetsPersonal/js/bootstrap.min.js" type="text/javascript"></script>

<!--  Checkbox, Radio & Switch Plugins -->
<script src="assetsPersonal/js/bootstrap-checkbox-radio.js"></script>

<!--  Charts Plugin -->
<script src="assetsPersonal/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="assetsPersonal/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<script type="text/javascript"
	src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Paper Dashboard Core javascript and methods for Demo purpose -->
<script src="assetsPersonal/js/paper-dashboard.js"></script>

<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="assetsPersonal/js/demo.js"></script>

</html>
