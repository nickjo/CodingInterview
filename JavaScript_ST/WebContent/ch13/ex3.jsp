<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="../jquery/jquery-1.12.1.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(function(){
	var arColor = ['yellow','red','green','blue','gray'];
	
	$('h3').each(function(i,v){
		$(v).css('background',arColor[i]);
	});
});
</script>
</head>
<body>
<h3>문단0</h3>
<h3>문단1</h3>
<h3>문단2</h3>
<h3>문단3</h3>
<h3>문단4</h3>
</body>
</html>