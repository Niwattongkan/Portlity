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
</head>

<body>
	<!-- Create a tag that we will use as the editable area. -->
	<!-- You can use a div tag as well. -->

	<!-- Include external JS libs. -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>

	<!-- Include Editor JS files. -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/froala_editor.pkgd.min.js"></script>
	<form action="save" method="POST">
		<textarea name="editor_content" id="myEditor"></textarea>
		<button>Submit</button>
	</form>

	<script>
		$(function() {
			$('#myEditor').froalaEditor({
				toolbarInline : false
			})
		});
	</script>
</body>
</html>