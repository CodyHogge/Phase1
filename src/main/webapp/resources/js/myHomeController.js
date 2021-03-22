//Define the RecipeListController controller on the app module
(function() {
	'use strict';
	
	angular.module('myHome').controller('MyHomeController', ['$scope', 'RecipeService', function($scope, RecipeService) {
		$scope.recipes = [];
		$scope.recipe = {};
		$scope.test = 'Test string TEST TEST !!!!';
		
		getReciptes();
		
		function MyHomeController(RecipeService) {
			$scope.recipes = RecipeService.getRecipes();
		}		
		
		
	}]);
	
	
/*	MyHomeController.$inject = ['RecipeService'];
	

function MyHomeController(RecipeService){
	
	var vm = this;
	vm.recipes = [];
	vm.recipe = {};
	vm.test = 'Test string TEST !!!!';
	
	
	getRecipes();
	
	function getRecipes(){
		//this.recipes = RecipeService.getRecipes();
	}
	
	
	
}*/
				
});
		