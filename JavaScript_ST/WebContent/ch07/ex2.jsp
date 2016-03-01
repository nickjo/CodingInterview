<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var a = 31415.9265358979;
document.write("단순 출력: " + a + "<br>");

document.write("부동 소수점(): " + a.toExponential() + "<br>");
document.write("부동 소수점(3): " + a.toExponential(3) + "<br>");
document.write("부동 소수점(5): " + a.toExponential(5) + "<br><br>");

document.write("고정 소수점(): " + a.toFixed() + "<br>");
document.write("고정 소수점(3): " + a.toFixed(3) + "<br>");
document.write("고정 소수점(5): " + a.toFixed(5) + "<br><br>");

document.write("유효자리수(): " + a.toPrecision() + "<br>");
document.write("유효자리수(3): " + a.toPrecision(3) + "<br>");
document.write("유효자리수(5): " + a.toPrecision(5) + "<br>");
document.write("유효자리수(6): " + a.toPrecision(6) + "<br>");
document.write("유효자리수(7): " + a.toPrecision(7) + "<br>");
document.write("타입: " + typeof(a) + "<br>");
</script>
</head>
<body>

</body>
</html>