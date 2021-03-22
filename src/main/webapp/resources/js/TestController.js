(function() {
	'use strict';
	
	angular.module('myHome').controller('TestController', TestController);
	TestController.$inject = ['RecipeService'];
	
	function TestController(RecipeService) {
		this.recipes = [];
		this.recipe = {};
		
		function getRecipes() {
			console.log('Getting recipes');

			
		}
		
		getRecipes();
	}
	
	
});