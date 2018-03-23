<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<link rel="icon" href="favicon.ico">

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
										<br />
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
											<c:forEach items="${listuser}" var="listuser">
											${listuser.classroom}<br />
												<small>Classroom</small>
											</c:forEach>
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
								<form:form method="post" action="savePersonal.do"
									commandName="user">
<<<<<<< HEAD

									<div class="row">

										<div class="col-md-3">
											<div class="form-group">
												<label></label> First Name
												<form:input type="text" class="form-control border-input"
													value="${listuser.firstName}" path="firstName" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label></label> Last Name
												<form:input type="text" class="form-control border-input"
													placeholder="Last Name" value="${listuser.surName}"
													path="surName" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label></label> Nickname
												<form:input type="text" class="form-control border-input"
													placeholder="Nickname" value="${listuser.nicName}"
													path="surName" />
=======
									<c:forEach items="${listuser}" var="listuser">
										<div class="row">

											<div class="col-md-4">
												<div class="form-group">
													<label></label> First Name
													<form:input type="text" class="form-control border-input"
														value="${listuser.firstName}" path="firstName" />
												</div>
											</div>
											<div class="col-md-5">
												<div class="form-group">
													<label></label> Last Name
													<form:input type="text" class="form-control border-input"
														placeholder="Last Name" value="${listuser.surName}"
														path="surName" />
												</div>
>>>>>>> 6cc54c06ccfcd6f0d653619e92fbe122cf01fccd
											</div>
										</div>

<<<<<<< HEAD
									<div class="row">
										<div class="col-md-9">
											<div class="form-group">
												<label>Home Address</label>
												<form:input type="text" class="form-control border-input"
													placeholder="" value="${listuser.address}" path="address" />
=======
										<div class="row">
											<div class="col-md-9">
												<div class="form-group">
													<label>Home Address</label>
													<form:input type="text" class="form-control border-input"
														placeholder="" value="${listuser.address}" path="address" />
												</div>
>>>>>>> 6cc54c06ccfcd6f0d653619e92fbe122cf01fccd
											</div>
										</div>

<<<<<<< HEAD
									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<label>Email</label>
												<form:input type="email" class="form-control border-input"
													placeholder="" value="${listuser.email}" path="email" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label>Nicname</label>
												<form:input type="text" class="form-control border-input"
													placeholder="Country" value="${listuser.nicName}"
													path="nicName" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label>Phone</label>
												<form:input type="number" class="form-control border-input"
													placeholder="ZIP Code" value="${listuser.phone}"
													path="phone" />
=======
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label>Email</label>
													<form:input type="email" class="form-control border-input"
														placeholder="" value="${listuser.email}" path="email" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Nicname</label>
													<form:input type="text" class="form-control border-input"
														placeholder="Country" value="${listuser.nicName}"
														path="nicName" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Phone</label>
													<form:input type="number" class="form-control border-input"
														placeholder="ZIP Code" value="${listuser.phone}"
														path="phone" />
												</div>
>>>>>>> 6cc54c06ccfcd6f0d653619e92fbe122cf01fccd
											</div>
										</div>

<<<<<<< HEAD
									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<label>Height</label>
												<form:input type="number" class="form-control border-input"
													value="${listuser.hight}" path="hight" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label>Weight</label>
												<form:input type="number" class="form-control border-input"
													value="${listuser.wight}" path="wight" />
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label>Age</label>
												<form:input type="number" class="form-control border-input"
													value="${listuser.age}" path="age" />
											</div>

										</div>
									</div>
									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<label>Primary</label>
												<form:input type="text" class="form-control border-input"
													value="${listuser.historyEducattionPrimary}"
													path="historyEducattionPrimary" />
											</div>
										</div>


										<div class="col-md-3">
											<div class="form-group">
												<label>Grade 1-3 </label>
												<form:input type="text" class="form-control border-input"
													placeholder="ZIP Code"
													value="${listuser.historyEducattionHihgthschool13}"
													path="historyEducattionHihgthschool13" />
											</div>
										</div>


										<div class="col-md-3">
											<div class="form-group">
												<label>Grade 4-6 </label>
												<form:input type="text" class="form-control border-input"
													placeholder="ZIP Code"
													value="${listuser.historyEducattionHihgthschool46}"
													path="historyEducattionHihgthschool46" />
											</div>
										</div>

									</div>
									<div class="text-center">
										<input type="submit" class="btn btn-info btn-fill btn-wd"
											value="Update Profile" />
									</div>

=======
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label>Higth</label>
													<form:input type="number" class="form-control border-input"
														value="${listuser.hight}" path="hight" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Wigth</label>
													<form:input type="number" class="form-control border-input"
														value="${listuser.wight}" path="wight" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Age</label>
													<form:input type="number" class="form-control border-input"
														value="${listuser.age}" path="age" />
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label>Primary</label>
													<form:input type="text" class="form-control border-input"
														value="${listuser.historyEducattionPrimary}"
														path="historyEducattionPrimary" />
												</div>
											</div>																		
											<div class="col-md-3">
												<div class="form-group">
													<label>Education Hihgthschool 1-3 </label>
													<form:input type="text" class="form-control border-input"
														placeholder="ZIP Code"
														value="${listuser.historyEducattionHihgthschool13}"
														path="historyEducattionHihgthschool13" />
												</div>
											</div>															
											<div class="col-md-3">
												<div class="form-group">
													<label>Education Hihgthschool 4-6 </label>
													<form:input type="text" class="form-control border-input"
														placeholder="ZIP Code"
														value="${listuser.historyEducattionHihgthschool46}"
														path="historyEducattionHihgthschool46" />
												</div>
											</div>
										</div>

										<div class="text-center">
											<input type="submit" class="btn btn-info btn-fill btn-wd"
												value="Update Profile" />
										</div>
									</c:forEach>
>>>>>>> 6cc54c06ccfcd6f0d653619e92fbe122cf01fccd
								</form:form>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<footer class="footer">
		<div class="container-fluid">
			<nav class="pull-left"> </nav>
			<div class="copyright pull-right"></div>
		</div>
		</footer>

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
