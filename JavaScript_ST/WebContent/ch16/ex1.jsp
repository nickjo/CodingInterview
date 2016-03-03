<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script type="text/javascript" src="../jquery/jquery-1.12.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<p>p tag 0</p>
<p>p tag 1</p>
<p>p tag 2</p>
<p>p tag 3</p>
<hr />
</body>
<script type="text/javascript">
$(function(){
	//document.write("html: " + $('p').html() + "<br>");
	document.write("text: " + $('p').text());
});
</script>
</html>