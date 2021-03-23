angular.module('myHome').
	factory('FreshService', FreshService);
	FreshService.$inject = ['$http', '$q'];
	var thisFreshService = {};
	
	var urlBase = 'http://localhost:8080/helloTest/RecipeController/';
	
	function FreshService($http, $q){
		var deferred = $q.defer();
		
		
		var factory = {
			getList: getList,
			createRecipe: createRecipe
		};
		
		return factory;
		
		function getList(){
			$http.get(urlBase+'AllRecList').then(
				function(response) {
					deferred.resolve(response.data);
					console.log('FreshService getting list' , response.data);
				},
				function(errResponse) {
					console.error('Error fetching list');
					deferred.reject(errResponse);
				}
			);
			console.log(deferred.promise);
			return deferred.promise;
		}
		
		function createRecipe(createObj){
			var recipeDetail = {
				name: name,
				description: description
			};
			
			$http.post(urlBase+'createRecipe', data).then(
				function(response) {
					return response.statusText;
				},
				function(errResponse) {
					return errResponse.statusText;
				}
			);
		}
		
	}