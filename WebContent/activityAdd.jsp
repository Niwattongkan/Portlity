<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Portfolio</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Portfolio - Add</title>

<!-- Bootstrap Core CSS -->
<link href="vendorPortfolio/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendorPortfolio/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="vendorPortfolio/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="css/stylish-portfolio.min.css" rel="stylesheet">
<!-- CSS Picture popup -->
<link href="css/SlidePicture.css" rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/css/froala_editor.pkgd.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/css/froala_style.min.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" href="favicon.ico">
<meta name="google-signin-client_id"
	content="322812928410-ru9dr6in3oa9gcqbu6tefptb61fd1pt9.apps.googleusercontent.com">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://apis.google.com/js/platform.js?onload=init" async
	defer></script>
<script>
	function signOut() {
		var auth2 = gapi.auth2.getAuthInstance();
		auth2.signOut().then(function() {
			console.log('User signed out.');
		});
	}

	function onLoad() {
		gapi.load('auth2', function() {
			gapi.auth2.init();
		});
	}
</script>
<script src="https://apis.google.com/js/platform.js?onload=onLoad" async
	defer></script>
</head>
<body>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>
	<!-- Include Editor JS files. -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/froala_editor.pkgd.min.js"></script>
	<!--  wrapper -->
	<script>
		function onClickSave() {
			var htmlValue = $('textarea#froala-editor').val();
			console.log('Save ', htmlValue);
			$
					.ajax({
						url : "saveActivity.do",
						data : {
							htmlValue : htmlValue
						},
						success : function(result) {
							console.log('result', result);
							if (result === 'success') {
								window.location = "http://localhost:8080/Portlity/activityList.jsp";
							}
						},
						error : function(xhr, status, error) {
							console.log('worng')
							console.log(error);
						}
					});
		}
	</script>
	<section class="content-section" id="portfolio">
	<div class="container">
		<div class="content-section-heading">
			<h2 class="text-secondary mb-0">
				<a href="activityList.jsp"> Add Activity </a>
			</h2>
		</div>
		<br>
		<br>
			<br>
			<br>
		<div class="row">
			<form>
				<textarea id="froala-editor">
		
				</textarea>
				<br> <input type="button" class="btn btn-warning" value="Next"
					onclick="onClickSave()">
			</form>
			
			<script>
				$('textarea#froala-editor').froalaEditor().on(
						'froalaEditor.contentChanged', function(e, editor) {
							$('#preview').html(editor.html.get());
						})
			</script>
			<script>
				$('textarea#froala-editor').froalaEditor(
						{
							toolbarInline : true,
							charCounterCount : false,
							toolbarButtons : [ 'bold', 'italic', 'underline',
									'strikeThrough', 'subscript',
									'superscript', '-', 'paragraphFormat',
									'align', 'formatOL', 'formatUL', 'indent',
									'outdent', '-', 'insertImage',
									'insertLink', 'insertFile', 'insertVideo',
									'undo', 'redo' ],
							toolbarVisibleWithoutSelection : true
						})
			</script>
		</div>
	</div>
	</section>
	<!-- Bootstrap core JavaScript -->
	<script src="vendorPortfolio/jquery/jquery.min.js"></script>
	<script src="vendorPortfolio/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="vendorPortfolio/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/stylish-portfolio.min.js"></script>
	<!-- Slide Picture -->
	<script src="js/SlidePicture.js"></script>
</body>
</html>