<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="utf-8">
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


</head>
<body>
	<script>
	function onClickSave() {
		var htmlBody = $('textarea#froala-editor').val();
		console.log('Save ',htmlBody);
		$.ajax({
			url : "saveTemplateActivity.do",
			data : {
				htmlBody : htmlBody
			},
			type:"post",
			success : function(result) {
				console.log('result', result);
				if (result === 'success') {
					window.location = "listTemplateActivityAdmin.do";
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
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>
	<!-- Include Editor JS files. -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/froala_editor.pkgd.min.js"></script>
	
	
	<form>
		<textarea id="froala-editor"></textarea>
		<input type="button" value="Next" onclick="onClickSave();">
	</form>
	<table border="1">
		<c:forEach items="${temActivityList}" var="temActivityList">
			<tr>
				<td>${temActivityList.bodyHTML}</td>
				<td><a href="deleteTemplate.do?id=${temActivityList.templateActivityId}">delelet</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<script>
		$('textarea#froala-editor')
				.froalaEditor({
					toolbarInline : true,
					charCounterCount : false,
					toolbarButtons : [ 'bold', 'italic', 'underline',
							'strikeThrough', 'subscript', 'superscript', '-',
							'paragraphFormat', 'align', 'formatOL', 'formatUL',
							'indent', 'outdent', '-', 'insertImage',
							'insertLink', 'insertFile', 'insertVideo', 'undo',
							'redo' ],
					toolbarVisibleWithoutSelection : true,
					// Set the image upload parameter.
			        			 
			        // Set max image size to 5MB.
			        imageMaxSize: 5 * 1024 * 1024,
			 
			        // Allow to upload PNG and JPG.
			        imageAllowedTypes: ['jpeg', 'jpg', 'png']
			        
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

	<script src="https://code.jquery.com/jquery.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script src="js/plugins.js"></script>
	<script src="js/beetle.js"></script>
	<script src="js/image.min.js"></script>

</body>
</html>