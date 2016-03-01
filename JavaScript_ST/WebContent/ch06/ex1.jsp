<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var ar = [1,2,3];
delete(ar[1]);

for(var i=0; i < ar.length; i++){
	if(!(i in ar)){
		document.writeln("nothing <br>");
	}else{
		document.writeln(ar[i] + "<br>");
	}
}
</script>
</head>
<body>

</body>
</html>