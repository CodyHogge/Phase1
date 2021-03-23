angular.module('myHome').controller('FreshControl', ['$scope','FreshService', function($scope, FreshService) {
	$scope.test = 'Test string from $scope';
	$scope.formRec;
	

	
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
	]
	
	function createRecipe(){
		$scope.list2 = FreshService.createRecipe($scope.formRec).then(function(data) {
			$scope.list2 = data;
			return $scope.list2;
		});
	}
	
	$scope.list2 = [];
	$scope.list2 = FreshService.getList().then(function(data) {
		$scope.list2 = data;
		return $scope.list2;
	});
	
	
	
}]);