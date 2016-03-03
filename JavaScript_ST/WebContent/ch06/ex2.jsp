<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function Human(name,age){
	this.name = name;
	this.age = age;
	this.intro = function(){
		document.write("name: " + this.name + "<br>");
		document.write("age: " + this.age + "<br><br>");
	}
}

var kim = new Human("kim", "30");
var jo = new Human("jo", "33");

kim.intro();
jo.intro();
</script>
</head>
<body>

</body>
</html>