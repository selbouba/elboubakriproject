var app=angular.module("MyApp",['ui.router']);
app.config(function($stateProvider ,$urlRouterProvider){
	$stateProvider.state('pole',{
		url:'/pole',
		templateUrl:'views/pole.html',
		controller:'PoleController'
	
	});
	
	$stateProvider.state('departement',{
		url:'/departement',
		templateUrl:'views/departement.html',
		controller:'DepartementController'
	
	});
	
	
	$stateProvider.state('user',{
		url:'/user',
		templateUrl:'views/user.html',
		controller:'UserController'
	
	});
	
	$stateProvider.state('demande',{
		url:'/demande',
		templateUrl:'views/demande.html',
		controller:'DemandeController'
	
	});
});

app.controller("PoleController",function($scope,$http){
	
	
	$scope.pole={};
	$scope.getpole = function getpole(){
	
	  $http.get("http://localhost:80/PUBLIC/poles")
	  .then(function(Out){
		
	  $scope.pole=Out.data;	
	  console.log(Out.data);
          
	  });
	  
	  
	}
	
    
	$scope.addpole = function addpole() {
		
		  $http.post( 'http://localhost:80/PUBLIC/poles',$scope.pole ).then(function(data) {
		    alert("pole added");
		    $scope.pole=data;
		   
		    console.log(data);
		  });
}
	
	
});


app.controller("DepartementController",function($scope,$http){
	
	$scope.departement={};
	$scope.getdepartement = function getdepartement(){
	
	  $http.get("http://localhost:80/PUBLIC/departements")
	  .then(function(Out){
		
	  $scope.departement=Out.data;	
	  console.log(Out.data);
          
	  });
	  
	  
	}
	
    
	$scope.addDepartement = function addDepartement() {
		
		  $http.post( 'http://localhost:80/PUBLIC/departements',$scope.departement ).then(function(data) {
		    alert("departement added");
		    $scope.departement=data;
		   
		    console.log(data);
		  });
}
	
	
});

app.controller("DemandeController",function($scope,$http){
	
	
	$scope.demande={};
	$scope.getdemande = function getdemande(){
	
	  $http.get("http://localhost:80/PUBLIC/demandes")
	  .then(function(Object){
		
	  $scope.demande=Object.data;	
	  console.log(Object.data);
          
	  });
	  
	  
	}
	
    
	
		   

	
	
});





app.controller("UserController",function($scope,$http){
	
	$scope.user={};
	$scope.getUser = function getUser(){
	
	  $http.get("http://localhost:80/PUBLIC/users")
	  .then(function(Out){
		
	  $scope.user=Out.data;	
	  console.log(Out.data);
          
	  });
	  
	  
	}
	
    
	$scope.addUser = function addUser() {
		
		  $http.post( 'http://localhost:80/PUBLIC/users',$scope.user ).then(function(data) {
		    alert("user added");
		    $scope.user=data;
		   
		    console.log(data);
		  });
}
		   

	
		  
		  
		  
			  
		  
			  
		  });
		     
		  
		 

	




