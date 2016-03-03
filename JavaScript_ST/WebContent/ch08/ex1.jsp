<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var ar = [1,2,3,4,5];
var ar_1 = new Array(1,2,3,4,5);

//delete ar[2];
ar.push(6)
ar.reverse();
ar = ar.concat(ar_1);
ar.sort();
ar = ar.slice(3, 6);

document.write(typeof(ar) + "<br>");

for(var i=0; i < ar.length; i++){
	document.write(ar[i] + "<br>");
}

document.write("<br>");

for(var i=0; i < ar_1.length; i++){
	document.write(ar_1[i] + "<br>");
}

ar_1.splice(1, 0, 7, 8, 9);
document.write("<br>"+ar_1.join("-> "));

document.write("<br>"+ar.join("-> "));

var sum = 0;

ar_1.forEach(function(v){
	sum += v;
});
document.write("<br>" + sum);


var ar_2 = ar_1.filter(function(v){
	return v > 5;
});

document.write("<br>" + typeof(ar_2) + " " + ar_2.join("-> "));
</script>
</head>
<body>

</body>
</html>