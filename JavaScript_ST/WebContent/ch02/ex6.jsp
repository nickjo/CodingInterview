<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var human = {
	name: 'nickjo',
	age: 33,
	local: "Seoul",
	job: "No...T.T"
};

delete human.age;
human.salary = 300;

with(human){
	document.write(name +"<br>");
	//document.write(age+"<br>");
	document.write(salary+"<br>");
	document.write(local+"<br>");
	document.write(job+"<br>");
}
</script>
</head>100
<body>

</body>
</html>