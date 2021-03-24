//put IIFE for john papa
(function() { 
'use strict';

angular.module('myHome').controller('FreshControl', ['$scope','FreshService', function($scope, FreshService) {
	$scope.test = 'Test string from $scope';

	$scope.form = {
		createRecipeForm: {}
	};
	
	$scope.list = [
		{
			name: 'test1',
			description: 'test1 desc'
		},
		{
			name: 'test2',
			description: 'test2 desc'
		},
		{
			name: 'test3',
			description: 'test3 desc'
		}
	];
	$scope.list2 = [];
	
	$scope.listComp = function listComp(){
		console.log("listComp called in FreshControl");
		FreshService.getList().then(function(data) {
			$scope.list2 = data;
			return $scope.list2;
		});
		};
	
	$scope.createRecipe = function createRecipe(form){
		console.log("createRecipe() in the Fresh Control");
		FreshService.createRecipe(form);
		$scope.list2 = $scope.listComp();
		};
		
	$scope.list2 = $scope.listComp();
	
	/*$scope.list2 = FreshService.getList().then(function(data) {
		$scope.list2 = data;
		return $scope.list2;
	});*/

	
	
	
	
	
		
	$scope.submit = function submit() {
		console.log("Submit() from the freshcntrl");

		};
		
}]);

})();