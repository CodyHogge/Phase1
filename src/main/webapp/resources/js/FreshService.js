angular.module('myHome').
	factory('FreshService', FreshService);
	FreshService.$inject = ['$http', '$q'];
	
	var urlBase = 'http://localhost:8080/helloTest/RecipeController/AllRecList';
	
	function FreshService($http, $q){
		var deferred = $q.defer();
		
		var factory = {
			getList: getList
		};
		
		return factory;
		
		function getList(){
			$http.get(urlBase).then(
				function(response) {
					deferred.resolve(response.data);
					console.log('FreshService getting list' + response.data);
				},
				function(errResponse) {
					console.error('Error fetching list');
					deferred.reject(errResponse);
				}
			);
			return deferred.promise;
		}
	}