//put IIFE for john papa
(function() {
'use strict';

angular
	.module('myHome')
	.controller('FreshControl', FreshControl);
	FreshControl.$inject = ['FreshService'];
	
	function FreshControl(FreshService){
		var vm = this;
		vm.test = 'Test string from this.test';
		
		vm.form = {};
					
		vm.list2 = [];
	
		vm.formReset = function formReset(){
			vm.form.name = null;
			vm.form.descreption = null;
			vm.form.cookTime = null;
		}
		
		vm.cGetList = function cGetList(){
			console.log("cGetList() called in FreshControl");
			FreshService.getList()
			.then(function(response){
				vm.list2 = response.data;	
				console.log('data -> ',response.data);			
				console.log('Recipes returned to controller.');
			});
		};
		
		vm.createRecipe = function createRecipe(form){
			console.log("createRecipe() in FreshControl");
			FreshService.createRecipe(form)
			.then(vm.cGetList,
			function(response){
				console.log('^^response : ',response);
			},
			vm.formReset);
		};
		
		
		vm.cGetList();
		
		
	}
	
})(); //Close the John Papa IIFE




/* THIS WAS THE ORIGINAL CODE THAT I USED TO GET THE PROJECT RUNNING, BEFORE CONVERTING FORMAT TO JOHN PAPA ->
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
		return $scope.list2;
		};
		
	$scope.list2 = $scope.listComp();*/
	
	/*This is getting the updated list after the createRecipe(), but the data on the JSP is not refreshing
	unless I reload the page. Need to see about maybe wrapping a div to reload whenever angular controller is called
	or someway to reload just a "canvas"?*/
	
	
	/*$scope.list2 = FreshService.getList().then(function(data) {
		$scope.list2 = data;
		return $scope.list2;
	});*/

	
	/*$scope.submit = function submit() {
		console.log("Submit() from the freshcntrl");

		};
	
}]);*/
	
		

