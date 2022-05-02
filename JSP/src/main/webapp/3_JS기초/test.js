// var : 중복 가능, 메모리 초기화 가능
var msg1 = "js var";			console.log(msg1);
//	alert(msg1);
var msg1 = "js duplicate variable";
//	alert(msg1);
// const : 중북 불가능, 메모리 초기화 불가능
const msg4 = "js const variable";
//	alert(msg4);
	
//msg4 = "const value change";
//	alert(msg4);
	
// let : 중복 불가능
let msg5 = "let variable";
//	alert(msg5);
//let msg5 = "let duplicate variable";
//	alert(msg5);
	msg5 = "let value change";

let tag1 = document.getElementById("spantag1");
tag1.innerHTML = "js char";

let price = 500;
let count = 10;
let total_price = price * count;
let tag2 = document.getElementById("spantag2");
tag2.innerHTML = total_price;

// function = method
function func1(){
	
	let color_array = ['red', 'white', 'black'];
	let tag3 = document.getElementById("spantag3");
	tag3.textContent = color_array[0];
	tag3.style.color = color_array[0];
	document.body.style.backgroundColor = "#eeeeee";
	
}

function func2(){
	
	let i = 1;
	while(i <= 10){
		let tag4 = document.getElementById("orderlist1");
		tag4.innerHTML += "<li>반복횟수 : " + i + "</li>";
		i++;
	}
	
	let j = 0;
	let item_array = ["galaxy", "iphone", "LG"];
	for (j; j < item_array.length; j++){
		let tag5 = document.getElementById("orderlist2");
		tag5.innerHTML += "<li> 제품명 : " + item_array[j] + "</li>";
	}
	
}

function func3(){
	let name = document.getElementById("input1").value;
	document.getElementById("orderlist3").innerHTML += "<li>" + name + "</li>";
}

function func4(){
	document.getElementById("orderlist3").innerHTML="";
}

function func5(name, sex){
	document.writeln("입력하신 이름 : " + name);
	document.writeln("입력하신 성별 : " + sex);
}










