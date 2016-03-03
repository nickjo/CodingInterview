<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var a = new String("Korea");
var b = "Korea";

/* == 연산자는 타입을 무시하고 값만 비교한다
   === 연산자는 값과 타입을 모두 비교한다.
*/
document.write("a 타입: " + typeof(a) + "<br>");
document.write("b 타입: " + typeof(b) + "<br><br>");
document.write((a==b) + "<br>");
document.write((a===b) + "<br>");
</script>
</head>
<body>

</body>
</html>