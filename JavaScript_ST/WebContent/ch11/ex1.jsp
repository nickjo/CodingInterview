<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var test = {
	name:"jo",
	age:33
};

test[0] = "add index";

document.write(test.name + "<br>");
document.write(test["name"] + "<br>");

document.write(test[0] + "<br><br>");

for(var i in test){
	document.write(test[i] + "<br>");
}

document.write("<br><br>");

</script>
</head>
<body>

</body>
</html>