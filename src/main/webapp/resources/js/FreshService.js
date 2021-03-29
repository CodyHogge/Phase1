(function() { 

angular.module('myHome').
	service('FreshService', FreshService);
	FreshService.$inject = ['$http', '$q'];
	var thisFreshService = {};
	
	var urlBase = 'http://localhost:8080/helloTest/RecipeController/';
	
	function FreshService($http, $q){
		var deferred = $q.defer();
		
		
		var service = {
			getList: getList,
			createRecipe: createRecipe
		};
		
		return service;
		
		function getList(){
			return $http.get(urlBase+'AllRecList');		
		}
		
		/*$http.get(urlBase+'AllRecList').then(
				function(response) {
					deferred.resolve(response.data);
					console.log('FreshService getting list' , response.data);
// code review suggest, working with http mod->	return response.data;
				},
				function(errResponse) {
					console.error('Error fetching list');
					deferred.reject(errResponse);
				}
			);
			console.log(deferred.promise);
			return deferred.promise;*/
		
		
		function createRecipe(createObj){
			return $http.post(urlBase+'createRecipe',createObj);		
			
			}
			
			
			
			/*console.log('createRecipe in the Fresh Service', createObj);
			$http({
				method : "POST",
				url : urlBase+"createRecipe",
				data : angular.toJson(createObj),
				headers : {
					'Content-Type' : 'application/json'
				}
			}).then(function(response) {
				console.log('Response from createRecipe -> FreshService -> ', response);
			
			},
			function(errResponse){
				console.log("ERROR");
			});
			
			return deferred.promise;*/
				
		
	}
	
})();