
var app = angular.module("app", [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home.html'
	});
	$routeProvider.when('/restaurants', {
		templateUrl : 'link1.html',
		controller : 'restaurantCtrl'
	});
	$routeProvider.when('/items', {
		templateUrl : 'items.html',
		controller : 'itemsCtrl'
	});
	$routeProvider.when('/users', {
		templateUrl : 'users.html',
		controller : 'usersCtrl'
	});
	$routeProvider.when('/userLogin',{
		templateUrl : 'login.html',
		controller : 'loginCtrl'
	});
	$routeProvider.when('/addRestaurants',{
		templateUrl : 'restaurant.html',
		controller : 'restaurantCtrl'
	});
	$routeProvider.when('/viewRestaurants',{
		templateUrl : 'link2.html',
		controller : 'restaurantCtrl'
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);

app.controller("restaurantCtrl", function($scope, $http) {

	$scope.fetchRestaurant = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/restaurant/getAll'
		}).success(function(data, status) {
			console.log(data);
			if(data) {
				$scope.status = status;
				$scope.restaurants = data;
			}
			else {
				document.getElementById("demo").innerHTML =
					"NO RECORDS YET"
			}
			
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveRestaurant = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/restaurant/create',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.restaurant
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchRestaurant();
			$scope.restaurants = data;
			alert("Restaurant Details Saved!");
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});

app.controller("itemsCtrl", function($scope, $http) {

	$scope.fetchItem = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/restaurant/getItem'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.items = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	$scope.saveItem = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/restaurant/addItems',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.item
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchItem();
			$scope.items = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});



app.controller("usersCtrl", function($scope, $http) {

	$scope.fetchUser = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/user/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.users = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveUser = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/user/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.user
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchUser();
			$scope.users = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});

app.controller("loginCtrl", function($scope, $http) {
	$scope.logIn = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/user/login',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.user
		}).success(function(data, status) {
			console.log(data);
			if(data) {
				alert("LoggedIn");
				$scope.user = data;
			}
			else
				alert("ADD USER");
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});