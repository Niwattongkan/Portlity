<!doctype html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="assetsRegister/img/apple-icon.png">
<link rel="icon" type="image/png" href="assetsRegister/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Create your profile</title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />

<!--     Fonts and icons     -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css"
	rel="stylesheet">

<!-- CSS Files -->
<link href="assetsRegister/css/bootstrap.min.css" rel="stylesheet" />
<link href="assetsRegister/css/gsdk-bootstrap-wizard.css"
	rel="stylesheet" />

<!-- CSS Just for demo purpose, don't include it in your project -->
<link href="assetsRegister/css/demo.css" rel="stylesheet" />
</head>

<body>
	<div class="image-container set-full-height"
		style="background-image: url('')">

		<div class="container">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">

					<!--      Wizard container        -->
					<div class="wizard-container">
						<div class="card wizard-card" data-color="orange"
							id="wizardProfile">

							<div class="wizard-header">
								<h3>
									<b>Create</b> YOUR PROFILE <br>
								</h3>
							</div>
							<div class="row">
								<form:form method="post" action="savePersonal.do"
									commandName="user">
									<form:hidden path="userGoogle" />
									<div class="col-sm-4 col-sm-offset-1">
										<div class="picture-container">
											<div class="picture">
												<img src="assetsRegister/img/default-avatar.png"
													class="picture-src" id="wizardPicturePreview" title="" />
												<input type="file" id="wizard-picture">
											</div>
											<h6>Choose Picture</h6>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label>First Name <small>(required)</small></label>
											<form:input name="firstname" type="text" class="form-control"
												placeholder="Andrew..." path="name" />
										</div>
										<div class="form-group">
											<label>Last Name <small>(required)</small></label>
											<form:input name="lastname" type="text" class="form-control"
												placeholder="Smith..." path="surname" />
										</div>
									</div>
									<div class="col-sm-10 col-sm-offset-1">
										<div class="form-group">
											<label>Email <small>(required)</small></label>
											<form:input name="email" type="email" class="form-control"
												placeholder="youremail@gmail.com n" path="email" />
										</div>
									</div>
									<div class="col-sm-7 col-sm-offset-1">
										<div class="form-group">
											<label>Adress</label>
											<form:input type="text" class="form-control"
												placeholder="333/1 mo.1" path="address" />
										</div>
									</div>
									<div class="col-sm-3">
										<div class="form-group">
											<label>Nicname</label>
											<form:input type="text" class="form-control"
												placeholder="Big" path="nicname" />
										</div>
									</div>
									<div class="col-sm-5 col-sm-offset-1">
										<div class="form-group">
											<label>Higth</label>
											<form:input type="text" class="form-control"
												placeholder="184" path="hight" />
										</div>
									</div>
									<div class="col-sm-5">
										<div class="form-group">
											<label>Classroom</label><br>
											<form:select class="form-control" path="classroom">
												<form:option value="6/1" >6/1</form:option>
												<form:option value="6/2" >6/2</form:option>
												<form:option value="6/3" >6/3</form:option>
												<form:option value="6/4" >6/4</form:option>
												<form:option value="6/5" >6/5</form:option>
												<form:option value="6/6" >6/6</form:option>
												<form:option value="6/7" >6/7</form:option>
												<form:option value="6/8" >6/8</form:option>
											</form:select>
										</div>
									</div>
									<input type='submit' 										
										 value="Send" />
								</form:form>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- wizard container -->
	<!-- end row -->
	</div>
	<!--  big container -->



</body>

<!--   Core JS Files   -->
<script src="assetsRegister/js/jquery-2.2.4.min.js"
	type="text/javascript"></script>
<script src="assetsRegister/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assetsRegister/js/jquery.bootstrap.wizard.js"
	type="text/javascript"></script>

<!--  Plugin for the Wizard -->
<script src="assetsRegister/js/gsdk-bootstrap-wizard.js"></script>

<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
<script src="assetsRegister/js/jquery.validate.min.js"></script>

</html>
