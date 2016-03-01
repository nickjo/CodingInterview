<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function func(){
	// var를 생략하면 전역변수로 인식된다.
	score = 100;
	document.writeln(score + "<br>");
}

func();

document.write(score);

</script>
</head>
<body>

</body>
</html>