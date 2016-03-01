<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function Human(name,age){
	this.name = name;
	this.age = age;
}

Human.prototype.intro = function(){
	document.write(this.name + "<br>");
	document.write(this.age + "<br><br>");
}

var jo = new Human("jo", 33);
var kim = new Human("kim", 22);

jo.intro();
kim.intro();

if(jo instanceof Human) document.write("jo is Human!!!");
</script>
</head>
<body>

</body>
</html>