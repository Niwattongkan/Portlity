<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
	
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="description" content="The Page Description">
		<style type="text/css">@-ms-viewport{width: device-width;}</style>
		<title>Beetle - Works 3 Columns</title>
		<link rel="stylesheet" href="css/layers.min.css" media="screen">
		<link rel="stylesheet" href="css/font-awesome.min.css" media="screen"> 
		<link rel="stylesheet" href="style.css" media="screen">
		<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400italic,700italic,400,700' rel='stylesheet' type='text/css'>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		<link rel="icon" href="favicon.ico">
		<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
		<link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png">
		<link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png">
		<link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png">	
		
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
	
<script>
	function onClickSave() {
		var htmlValue = $('textarea#froala-editor').val();
		console.log('Save',htmlValue);
		$.ajax({
			url : "saveActivity.do",
			data : {
				htmlValue : htmlValue
			},
			success : function(result) {
				console.log('result', result);
				if (result === 'success') {
					window.location = "http://localhost:8080/Portlity/activityList.jsp";}
			},
			error : function(xhr, status, error) {
				console.log('worng')
				console.log(error);
			}
		});
	}
</script>
</head>
<body class="portfolio">
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>
	<!-- Include Editor JS files. -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/froala_editor.pkgd.min.js"></script>

	<div id="main" class="row">
				<div class="row-content buffer clear-after">
				<!-- ใช่ forloop list template -->
					<ul class="inline cats filter-options">
						<li data-group="advertising">All template</li>
						<li data-group="nomal">Nomal</li>
						<li data-group="icons"></li>
				<!--    <li data-group="infographics">Infographics</li>
						<li data-group="lightbox">Lightbox</li>
						<li data-group="minimal">Minimal</li>
						<li data-group="web-design">Web design</li>
						<li ><a href="addActivity.do">New actity</a></li>
				 -->
					</ul>
					<div class="grid-items portfolio-section preload">
							
		
						<article class="item column four" data-groups='["nomal", "icons"]'>
							<figure><img src="http://placehold.it/800x600/ddd/fff&text=Beetle%20image" alt=""></figure>
							<a class="overlay" href="#editerArea" onclick="myFunction()" >
								<div class="overlay-content">
									<div class="post-type"><i class="icon icon-picture"></i></div>
									<h2>Taj Mahal</h2>
									<p>Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
								</div><!-- overlay-content -->
							</a><!-- overlay -->
						</article>
						
					</div><!-- grid-items -->	
				</div><!-- row-content -->
			</div><!-- row -->
				<section  class="container text-center my-auto" id="editerArea">
				<div id="myDIV" style="display: none;"  class="grid-items portfolio-section preload">
					<form>
					<div id="froala-editor">
					
					</div>
						<input type="button" value="Next" onclick="onClickSave()">
					</form>
				</div>
				</section>
	 
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
                            <li><a href="file:///Users/pasqualevitiello/My%20Folder/Job/Envato/PR%20Themeforest/Flattie/Markup/Beetle/contact.html">Contact</a></li>
                        </ul>
                    </div>
                    <div class="widget column three">
                        <h4>Portlity</h4>
                        <p>This web application create for student everyone and it free</p>
                    </div>
                    <div class="widget meta-social column three">
                        <h4>Follow Us</h4>
                        <ul class="inline">
                            <li><a href="#" class="twitter-share border-box"><i class="fa fa-twitter fa-lg"></i></a></li>
                            <li><a href="#" class="facebook-share border-box"><i class="fa fa-facebook fa-lg"></i></a></li>
                            <li><a href="#" class="pinterest-share border-box"><i class="fa fa-pinterest fa-lg"></i></a></li>
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
		
	<script>
	$('div#froala-editor').froalaEditor({
		  toolbarInline: true,
		  charCounterCount: false,
		  toolbarButtons: ['bold', 'italic', 'underline', 'strikeThrough', 'subscript', 'superscript', '-', 'paragraphFormat', 'align', 'formatOL', 'formatUL', 'indent', 'outdent', '-', 'insertImage', 'insertLink', 'insertFile', 'insertVideo', 'undo', 'redo'],
		  toolbarVisibleWithoutSelection: true
		})
	</script>
			<script>
		function myFunction() {
		    var x = document.getElementById("myDIV");
		    if (x.style.display === "none") {
		        x.style.display = "block";
		    } else {
		        x.style.display = "none";
		    }
		}
		</script>
	<script src="https://code.jquery.com/jquery.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>		
	<script src="js/plugins.js"></script>
	<script src="js/beetle.js"></script>
</body>
</html>