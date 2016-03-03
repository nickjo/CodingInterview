<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
// caller: 이 함수를 호출한 함수, callee: 호출을 당한 함수 자신
document.write("5! = " + function(n){
	if(n == 1){
		return 1;		
	}else{
		return n * arguments.callee(n-1);
	}
}(5));
</script>
</head>
<body>

</body>
</html>