<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>

	<!-- Include Editor JS files. -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.7.6/js/froala_editor.pkgd.min.js"></script>
	<div id="froala-editor">
		<p>Start typing and you can preview the content of the WYSIWYG
			HTML editor as you type below the editing box.</p>
	</div>
	<br />
	<div id="preview" class="fr-view">
		<p>Start typing and you can preview the content of the WYSIWYG
			HTML editor as you type below the editing box.</p>
	</div>
	<script>
		$('div#froala-editor').froalaEditor().on('froalaEditor.contentChanged',
				function(e, editor) {
					$('#preview').html(editor.html.get());
				})
	</script>
</body>
</html>