var pokemonVar;

function getPokemon(id){
	
	//Step 1. Open XHR
	var xhr = new XMLHttpRequest();

	//Step 2. function to handle ready state change of the response
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState === 4 && xhr.status == 200){
			
			console.log("returned");
			console.log(xhr.responseText);
			pokemonVar = JSON.parse(xhr.responseText);
			
		}
		
		else{
			
			console.log(xhr.readyState);
			
		}
		
	};
	
	xhr.open("GET", "http://pokeapi.co/api/v2/pokemon/" + id, true);
	xhr.send();
	
	
}