/**
 * 
 */

angular.
	module('myHome').
	factory('RecipeService', RecipeService);
	RecipeService.$inject = ['$http' , '$q'];
	
	
	var urlBase = 'http://localhost:8080/helloTest/RecipeController/AllRecList';
		
		//need factory here
		
		
		function RecipeService($http, $q){
			var deferred = $q.defer();
			
			var factory = {
				getRecipes: getRecipes
			};
			
			return factory;
			
			
		function getRecipes(){
			
			$http.get(urlBase)
			.then(
				function(response){
					deferred.resolve(response.data);
					console.log("RecService getting rec's" + response.data);
		},	
				function(error){
					console.error('Error fetching recipes');
					deferred.reject(error);
				}
			);
			return deferred.promise;
		};
		
		}
		
	

/*var REST_SERVICE_URI = '<a class="vglnk" href="http://localhost:8080/Spring4MVCAngularJSExample/user/" rel="nofollow"><span>http</span><span>://</span><span>localhost</span><span>:</span><span>8080</span><span>/</span><span>Spring4MVCAngularJSExample</span><span>/</span><span>user</span><span>/</span></a>';
 */