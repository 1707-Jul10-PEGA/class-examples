//"use strict";

x = 5;

console.log(x);

var doStuff;

console.log(a=5);

var a, b, c, d, e, f, g, h, i;

console.log(a);

a = 10;
b = "10";
c = true;
d = {};
e = null;
// f = ;
g = (0 / 0);
h = [];
i = function() {
	
	var functionScope = 100;
	
	function nestedFunction() {
		
		console.log(nestedScope);
		
		var nestedScope = 50;
		
		console.log(functionScope);
		
	}
	
	nestedFunction();
	
	console.log(b);
	
	// console.log(nestedScope);
	
};

i();

// console.log(functionScope);

a = b;
a = c;
a = d;
a = e;
a = g;
a = h;
a = i;

var checkTrue = function(d) {

	if (d) {

		console.log(d + " is true");

	}

	else {

		console.log(d + " is false")

	}
}

function changeString(myVar) {

	console.log(myVar);
	myVar = "changed that string";
	console.log(myVar);

}

var book = {
		
		title: "The Fellowship of the Ring",
		year: 1954,
		author: {
			
			name: "JRR Tolkein",
			dob: 1892
			
		},
		
		checkedOut: false,

		checkout:function(){
			
			this.checkedOut = !this.checkedOut;
			
		}
		
};

//var sumNum = function(){console.log("no args")};

function sumNum(x, y, z){
	
	if(z){
	
		console.log(x + y + z + " inside first funtion");
	
	}
	
	else{
		
		console.log(x + y);
		
	}
}

{

	const blockConst = "Hi";
	
	blockConst = "Bye";
	
	let blockScope = 10;
	
	console.log(blockScope);
	
}

console.log(blockScope);

function sumNum(){
	
	console.log("nothing");
	console.log(arguments[0], arguments[1], arguments[2]);
	console.log(arguments);
	var temp = 0;
	for (let x of arguments){
		
		temp = temp + x;
		
	}
	console.log(temp);
	
}

/*
 * function sumNum(x, y){
 * 
 * console.log(x + y + " inside x & y"); }
 */

window.onload = function() {

	doStuff = function(x) {

		alert(x + " from an external file");

	}

}