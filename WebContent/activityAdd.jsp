<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<form>
		<textarea  id="froala-editor">
			<c:forEach items="${listActivity}" var="listActivity">
				${listActivity.page}
			</c:forEach>
		</textarea>
		<input type="button" value="Next" onclick="onClickSave()">
	</form>
	<br />
	<div id="preview" class="fr-view">
		<p>
				<c:forEach items="${listActivity}" var="listActivity">
					${listActivity.page}
				</c:forEach>
		</p>

	</div>
	<script>
		$('textarea#froala-editor').froalaEditor().on('froalaEditor.contentChanged',
				function(e, editor) {
					$('#preview').html(editor.html.get());
				})
	</script>

</body>
</html>