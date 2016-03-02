<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script type="text/javascript" src="../jquery/jquery-1.12.1.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(function(){
	$("h1").css("background","yellow").css("color", "purple");
	var elem = $('<p>add p tage</p>');
	
	elem.appendTo('h1');
});
</script>
</head>
<body>
<h1>Title</h1>
</body>
</html>