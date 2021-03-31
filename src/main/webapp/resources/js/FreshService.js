(function() { 

angular.module('myHome').
	service('FreshService', FreshService);
	FreshService.$inject = ['$http'];
	
	var urlBase = 'http://localhost:8080/helloTest/KitchenController/';
	
	function FreshService($http){

		
		var service = {
			getList: getList,
			createRecipe: createRecipe
		};
		
		return service;
		
		function getList(){
			return $http.get(urlBase+'AllRecList');		
		}
		
		function createRecipe(createObj){
			return $http.post(urlBase+'createRecipe',createObj);		
			
		}	

	}
	
})();