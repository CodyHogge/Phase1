(function(){
	'use strict';
	
	angular.
	module('myHome').
	component('recipeBookComp', {
		selector: 'recipeBookComp',
		template: 
			'<ul>' +
				'<li ng-repeat="recipe in list2">' +
					'<span ng-bind="recipe.name"></span>' +
					'  -> <span ng-bind="recipe.description"></span> <br>' +
				'</li>' +
			'</ul>',
		controller: 'FreshControl'
	});
});