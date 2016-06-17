var app = angular.module('myApp', []);
app.controller('ProductController', function($scope,$http) {
	   $http.get("prod").then(
               function(response){
                   $scope.Data= response.data;
               });

	
 
});