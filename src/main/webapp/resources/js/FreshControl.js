angular.module('myHome').controller('FreshControl', ['$scope','FreshService', function($scope, FreshService) {
	$scope.test = 'Test string from $scope';
	
	$scope.list = [
		{
			name: 'test1',
			desc: 'test1 desc'
		},
		{
			name: 'test2',
			desc: 'test2 desc'
		},
		{
			name: 'test3',
			desc: 'test3 desc'
		}
	]
	
	$scope.list2 = FreshService.getList();
}]);