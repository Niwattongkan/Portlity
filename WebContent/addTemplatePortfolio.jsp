<!DOCTYPE html>
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
			url : "saveTemplatePortfolio.do",
			data : {
				htmlBody : htmlBody
			},
			success : function(result) {
				console.log('result', result);
				if (result === 'success') {
					//window.location = "";}
					console.log('success');}
			},
			error : function(xhr, status, error) {
				console.log('worng')
				console.log(error);
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
	
	<script>
		$('textarea#froala-editor').froalaEditor(
				{
					toolbarInline : true,
					charCounterCount : false,
					toolbarButtons : [ 'bold', 'italic', 'underline',
							'strikeThrough', 'subscript', 'superscript', '-',
							'paragraphFormat', 'align', 'formatOL', 'formatUL',
							'indent', 'outdent', '-', 'insertImage',
							'insertLink', 'insertFile', 'insertVideo', 'undo',
							'redo' ],
					toolbarVisibleWithoutSelection : true
				})
	</script>

	<script src="https://code.jquery.com/jquery.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script src="js/plugins.js"></script>
	<script src="js/beetle.js"></script>
</body>
</html>