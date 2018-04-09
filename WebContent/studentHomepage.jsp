<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="The Page Description">
    <style type="text/css">
        @-ms-viewport {
            width: device-width;
        }
    </style>
    <title>Portlity - Home page</title>
    <link rel="stylesheet" href="css/layers.min.css" media="screen">
    <link rel="stylesheet" href="css/font-awesome.min.css" media="screen">
    <link rel="stylesheet" href="style.css" media="screen">
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400italic,700italic,400,700' rel='stylesheet' type='text/css'>
    <!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		<![endif]-->
    <link rel="icon" href="favicon.ico">
    <link rel="apple-touch-icon" href="img/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png">
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

<body class="page">
    <header role="banner" class="transparent light">
        <div class="row">
            <div class="nav-inner row-content buffer-left buffer-right even clear-after">
                <div id="brand">
                    <h1 class="reset">
                        <a href="studentHomepage.jsp">Portlity</a></h1>
                </div>
                <!-- brand -->
                <a id="menu-toggle" href="#"><i class="fa fa-bars fa-lg"></i></a>
                <nav>
                    <ul class="reset" role="navigation">
                        <li class="menu-item"><a href="studentHomepage.do">Home</a>
                        </li>
                        <li class="menu-item"><a href="editDataSutent.do">Personal</a>                           
                        </li>
                         <li class="menu-item"><a href="listTemplateActivity.do">Activity</a>                           
                        </li>
                        <li class="menu-item">
                            <a>Portfolio</a>	
                           <ul class="sub-menu">
                                <li><a href="portfolioWork.jsp">Work portfolio</a></li>
                                <li><a href="portfolioExample.jsp">Example portfolio</a></li>
                            </ul>  
                        </li>                    
                        <li class="menu-item"><a href="studentLogin.jsp" onclick="signOut();">Sign off</a></li>
                    </ul>
                </nav>
            </div>
            <!-- row-content -->
        </div>
        <!-- row -->
    </header>

    <main role="main">
        <div id="intro-wrap">
            <div id="intro" class="preload darken" data-autoplay="5000" data-navigation="true" data-pagination="true" data-transition="fadeUp">
                <div class="intro-item" style="background-image: url(images/cover1.jpg);">
                    <div class="caption">
                        <h2>PORTFOLIO CREATE BY PORTLITY</h2>
                        <p>Feel the new experience of using portfolio.</p> 
                                                     
                    </div>
                </div>
                <div class="intro-item" style="background-image: url(images/cover2.jpg);">
                    <div class="caption">
                        <h2>Example portfolio</h2>  
                        <p>There are many examples of work.</p>                       
                        <a class="button white transparent" href="portfolioExample.jsp">Example More</a>                  
                    </div>
                </div>
                <div class="intro-item" style="background-image: url(images/cover3.jpg);">
                    <div class="caption">
                        <h2>Activity portfolio</h2>
                        <p>You can add an event by yourself.</p>
                        <a class="button white transparent" href="activityAdd.jsp">Let starting</a>
                    </div>
                </div>
                <div class="intro-item" style="background-image: url(images/cover4.jpg);">
                    <div class="caption">
                        <h2>Create portfolio</h2>
                        <p>Start designing your portfolio.</p>
                        <a class="button white transparent" href="portfolioWork.jsp">Let starting</a>
                    </div>
                </div>
            </div>
            <!-- intro -->
        </div>
        <!-- intro-wrap -->

        <div id="main">

            <section class="row section call-to-action">
                <div class="row-content buffer even">

                    <p>Let do your portfolio</p>
                    <a class="button red" href="portfolioWork.jsp">Do It</a>

                </div>
            </section>
            
            <section class="row section">
                <div class="row-content buffer even clear-after">
                    <div class="section-title">
                        <h3>Latest News</h3>
                    </div>
                    <div class="grid-items blog-section masonry-style preload">
                        
                      <c:forEach items="${listInformation}" var="list">
                        <article class="item column three">
                            <a href="#">
                                <figure><img src="http://placehold.it/800x600/ddd/fff&text=Beetle%20image" alt=""><span class="blog-overlay"><i class="icon icon-doc"></i></span></figure>
                                <div class="blog-excerpt">
                                    <div class="blog-excerpt-inner">
                                        <h5 class="meta-post">News</h5>
                                        <h2>${list.body}</h2>
                                    </div>
                                    <!-- blog-excerpt -->
                                </div>
                                <!-- blog-excerpt-inner -->
                            </a>
                        </article>
                    	</c:forEach>
                        <div class="shuffle-sizer three"></div>
                    </div>
                    <!-- grid-items -->
                    <div class="more-btn"><a class="button transparent aqua" href="#">Read all News</a></div>
                </div>
            </section> 
 <!--             <section class="row section">
                <div class="row-content buffer even clear-after">
                    <div class="section-title">
                        <h3>Skills</h3>
                    </div>
                    <p class="centertxt">I’m an experienced and passionate user interface designer with interaction design background.<br>My goal is to make the world wide web a better place by designing beautiful user experiences, one site at a time.</p>
                    <div class="chart" data-percent="73" data-bar-color="#fd685b" data-animate="2000">
                        <div class="chart-content">
                            <div class="percent"></div>
                            <div class="chart-title">User Interface</div>
                        </div>
                    
                    </div>
                
                    <div class="chart" data-percent="85" data-bar-color="#ffce54" data-animate="2500">
                        <div class="chart-content">
                            <div class="percent"></div>
                            <div class="chart-title">Front-end</div>
                        </div>
                    </div>          
                    <div class="chart" data-percent="70" data-bar-color="#a0d468" data-animate="3000">
                        <div class="chart-content">
                            <div class="percent"></div>
                            <div class="chart-title">User Experience</div>
                        </div>
                    </div>
                    <div class="chart" data-percent="95" data-bar-color="#ac92ec" data-animate="3500">
                        <div class="chart-content">
                            <div class="percent"></div>
                            <div class="chart-title">Icon Design</div>
                        </div>
                    </div>
                </div>
            </section>
-->
            <section class="row section text-light" style="background-color:#4FC1E9;">
                <div class="row-content buffer even clear-after">
                    <div class="testimonial-slider centertxt" data-autoplay="5000" data-pagination="true" data-transition="fade" data-autoheight="false">
                        <div class="quote">
                            <p>"Don't be afraid to change. You may lose something good but you may gain something better."</p>
                            <div class="author">(จงอย่ากลัวที่จะเปลี่ยนแปลง คุณอาจจะสูญเสียสิ่งที่ดีไปแต่คุณก็อาจจะได้รับในสิ่งที่ดีกว่ากลับมาแทน)</div>
                        </div>
                        <!-- quote -->
                        <div class="quote">
                            <p>"The most successful people in the world Have made many mistakes and experienced far more failure than the rest."</p>
                            <div class="author">คนที่ประสบความสำเร็จมากที่สุดในโลกคือคนที่พบเจอความผิดพลาดและความล้มเหลวมามากกว่าคนอื่น&egrave;</div>
                        </div>
                        <!-- quote -->
                        <div class="quote">
                            <p>"You must lose your fear of being wrong in order to live a creative life."</p>
                            <div class="author">คุณต้องละทิ้งความกลัวที่จะผิดพลาดเพื่อจะได้ใช้ชีวิตอย่างสร้างสรรค์</div>
                        </div>
                        <!-- quote -->
                    </div>
                    <!-- testimonial-slider -->
                </div>
            </section>        
        </div>
        <!-- id-main -->
    </main>
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
                </section>s
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