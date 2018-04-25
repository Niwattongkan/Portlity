<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
	
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="description" content="The Page Description">
		<style type="text/css">@-ms-viewport{width: device-width;}</style>
		<title>Activity</title>
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
		
<script src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/plugins/image.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/css/froala_editor.pkgd.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/css/froala_style.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/plugins/image.min.js"
	rel="stylesheet" type="text/css" />
		
<link rel="icon" href="favicon.ico">
	
<script>
		function onClickSave() {
			var htmlBody = $('textarea#froala-editor').val();
			console.log('Save ',htmlBody);
			$.ajax({
				url : "saveActivity.do",
				data : {
					htmlBody : htmlBody
				},
				type:"post",
				success : function(result) {
					console.log('result', result);
					if (result === 'success') {
						window.location = "listActivityList.do";
						console.log('success');}
				},
				error : function(xhr, status, error) {
					console.log('worng')
					console.log(error);
				},
				complete:function(){
		            console.log("Request finished.");
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

	<div id="main" class="row">

			<section class="row section text-light" style="background-color:#4FCEAD;">
					<div class="row-content buffer even clear-after">
						<div class="slogan animation onscreen">
							<h2>Your activity will come to portfolio</h2>	
							<p>Here you can select .</p>						
						</div><!-- slogan -->				
					</div>
			</section>

				<div class="row-content buffer clear-after">
				<!-- ใช่ forloop list template -->
					<ul class="inline cats filter-options">
						<li data-group="advertising">All template</li>
				<!--	<li data-group="nomal">Nomal</li>
						<li data-group="icons"></li>
				    	<li data-group="infographics">Infographics</li>
						<li data-group="lightbox">Lightbox</li>
						<li data-group="minimal">Minimal</li>
						<li data-group="web-design">Web design</li>
						<li ><a href="addActivity.do">New actity</a></li>
				 -->
					</ul>
					<div class="grid-items portfolio-section preload">
					
						<article class="item column four">
								<figure><img src="images/icons/TechData-Icon.jpg" alt=""></figure>
								<a class="overlay" href="#editerArea" onclick="myFunction()">
									<div class="overlay-content">
										<div class="post-type"><i class="icon icon-camera"></i></div>
										<h2>template</h2>
										<p>basic of activity</p>
									</div><!-- overlay-content -->
								</a><!-- overlay -->
							</article>	
					</div><!-- grid-items -->	
				</div><!-- row-content -->
			</div><!-- row -->


				<section  class="row-content buffer even clear-after" id="editerArea">
				<div id="myDIV" style="display: none;"  class="grid-items portfolio-section preload">
					<form>
					 <textarea  id="froala-editor">
						<c:forEach items="${temActivityList}" var="temActivityList">
							${temActivityList.bodyHTML}
						</c:forEach>
					</textarea>
													
						<div class="more-btn">				
						<input class="button transparent pink" type="button" value="Next" onclick="onClickSave()">
						</div>
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
                            <li><a href="https://www.facebook.com/profile.php?id=100008621857819" class="facebook-share border-box"><i class="fa fa-facebook fa-lg"></i></a></li>
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
	$('textarea#froala-editor').froalaEditor({
		  toolbarInline: true,
		  charCounterCount: false,
		  toolbarButtons: ['bold', 'italic', 'underline', 'strikeThrough', 'subscript', 'superscript', '-', 'paragraphFormat', 'align', 'formatOL', 'formatUL', 'indent', 'outdent', '-', 'insertImage', 'insertLink', 'insertFile', 'insertVideo', 'undo', 'redo'],
		  toolbarVisibleWithoutSelection: true
		})
		 .on('froalaEditor.image.beforeUpload', function (e, editor, files) {
					    if (files.length) {
					      // Create a File Reader.
					      var reader = new FileReader();
					 
					      // Set the reader to insert images when they are loaded.
					      reader.onload = function (e) {
					        var result = e.target.result;
					        editor.image.insert(result, null, null, editor.image.get());
					      };
					      
					      // Read image as base64.
					      reader.readAsDataURL(files[0]);
					    }
					
					    editor.popups.hideAll();
					
					    // Stop default upload chain.
					    return false;
					  })
     			 .on('froalaEditor.image.uploaded', function (e, editor, response) {
     			   // Image was uploaded to the server.
   			   		})
     			 .on('froalaEditor.image.inserted', function (e, editor, $img, response) {
        			// Image was inserted in the editor.
    			  })
     			 .on('froalaEditor.image.replaced', function (e, editor, $img, response) {
     			   // Image was replaced in the editor.
     				})
     			   .on('froalaEditor.image.error', function (e, editor, error, response) {
     			 if (error.code == 1) {
						console.log('Bad link.');
     			 	}

			        // No link in upload response.
			        else if (error.code == 2) {console.log('No link in upload response.'); }
			 
			        // Error during image upload.
			        else if (error.code == 3) {console.log('Error during image upload.'); }
			 
			        // Parsing response failed.
			        else if (error.code == 4) {console.log(' Parsing response failed.'); }
			 
			        // Image too text-large.
			        else if (error.code == 5) {console.log('Image too text-large.');}
			 
			        // Invalid image type.
			        else if (error.code == 6) { console.log(' Invalid image type.'); }
			 
			        // Image can be uploaded only to same domain in IE 8 and IE 9.
			        else if (error.code == 7) { console.log(' Image can be uploaded only to same domain in IE 8 and IE 9.'); }
     			  });
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