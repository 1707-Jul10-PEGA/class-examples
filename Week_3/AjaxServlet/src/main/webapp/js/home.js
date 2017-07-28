function handleEvent(){
	
	var head = document.getElementById("head");
	
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(){
		
		switch (xhr.readyState) {
		
		case 0:
			
			head.innerHTML = "Request not initialized";
			break;
			
		case 1:
			head.innerHTML = "Connection Established";
			break;
			
		case 2:
			head.innerHTML = "Request Recieved";
			break;
			
		case 3:
			head.innerHTML = "Processing Request";
			break;
			
		case 4:
			if(xhr.status == 200){
				
				person = JSON.parse(xhr.responseText);
				document.getElementById("stuff").innerHTML = person.major;
				head.innerHTML = "Success";
				
			}
			
			else{
				
				head.innerHTML = "ERROR with Request, response code: " + xhr.status;
				
			}
			break;
			
		}
		
	}
	
	xhr.open("GET", "getPerson", true);
	xhr.send();
	
}

function makePerson(name, dob, major){
	
	var person = {};
	person.name = name;
	person.dob = dob;
	person.major = major;
	return person;
	
}

function postPerson(){
	
	var head = document.getElementById("head");
	
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(){
		
		switch (xhr.readyState) {
		
		case 0:
			
			head.innerHTML = "Request not initialized";
			break;
			
		case 1:
			head.innerHTML = "Connection Established";
			break;
			
		case 2:
			head.innerHTML = "Request Recieved";
			break;
			
		case 3:
			head.innerHTML = "Processing Request";
			break;
			
		case 4:
			if(xhr.status == 200){
				
				document.getElementById("stuff").innerHTML = "person posted!!!";
				head.innerHTML = "Success";
				
			}
			
			else{
				
				head.innerHTML = "ERROR with Request, response code: " + xhr.status;
				
			}
			break;
			
		}
		
	}
	
	xhr.open("POST", "getPerson", true);
	xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	var data = "person="+JSON.stringify(makePerson('blake', '7/29/17', 'some major'));
	xhr.send(data);
	
}

window.onload = function(){
	
	document.getElementById("myBtn").addEventListener("click", handleEvent, false);
	document.getElementById("myBtn2").addEventListener("click", postPerson, false)
	
	
}