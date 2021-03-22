/**
 * 
 */

(function(){
	'use strict';
	
	angular.
	module('myHome').
	controller('MyHomeController', function MyHomeController(){

	}).
	component('recipeBookComp', {
		selector: 'recipeBookComp',
		template: 
			'<ul>' +
				'<li ng-repeat="recipe in recipes">' +
					'<span>{{ recipe.name }}</span>' +
					'<p>{{ recipe.description }}</p>' +
				'</li>' +
			'</ul>',
		controller: 'MyHomeController'
	});
})();