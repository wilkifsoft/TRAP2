      var googleUser = {};
      var startApp = function() {
        gapi.load('auth2', function(){
          // Retrieve the singleton for the GoogleAuth library and set up the client.
          auth2 = gapi.auth2.init({
            client_id: '589385573959-vkil0vc6nbhn9mrf7bfg3dic3bg6u4c3.apps.googleusercontent.com',
            cookiepolicy: 'single_host_origin',
            // Request scopes in addition to 'profile' and 'email'
            //scope: 'additional_scope'
          });
          attachSignin(document.getElementById('customBtn'));
        });
      };
    
      function attachSignin(element) {
        console.log(element.id);
        auth2.attachClickHandler(element, {},
            function(googleUser) {
        	googleLogin();
              document.getElementById('name').innerText = "Signed in: " +
                  googleUser.getBasicProfile().getName();
            }, function(error) {
              alert(JSON.stringify(error, undefined, 2));
            });
      }
      
      
      
      function google() {

    		$.ajax({

    		  url: "/offre-service/googleLogin",
    		  type: 'get',
    		  contentType: 'application/json',
    		  cache: false,
    		  timeout: 600000,
    		  success: function (response) {

    		 window.location.replace("/offre-service/checkout");

    		  },

    		  error: function (err) {
    			  
    			  $('#ajaxLoader2').hide();
    			var msg = err.responseText.substring(7, err.responseText.length-1);
    			 $("#errormsg").show();
    			  $("#msg").text(msg);
    			  
    		  }
    		});

    		}





    	function googleLogin() {
    		$('#ajaxLoader2').show();
    		    $.ajax({
    		      url: 'http://localhost:8081/authorization-server/oauth2/authorization/google',
    		      dataType: 'jsonp',
    		      type: 'GET',
    		      data: {
    		         format: 'json'
    		      }, 
    			    complete: function() {
    				      // Schedule the next request when the current one's complete
    				      window.setTimeout( google() , 500);
    				    	
    				    },
    					 
    		   });

    		} 
      
      
    	
    	
    	
    	
    	function facebookLogin() {
    		$('#ajaxLoader1').show();
    		    $.ajax({
    		      url: 'http://localhost:8081/authorization-server/oauth2/authorization/facebook',
    		      dataType: 'jsonp',
    		      type: 'GET',
    		      data: {
    		         format: 'json'
    		      }, 
    			    complete: function() {
    				      // Schedule the next request when the current one's complete
    				    window.setTimeout(facebook() , 1500);
    			    	// window.location.replace("/offre-service/checkout");
    				    },
    		   });

    		} 



    	function facebook() {
    		 $("#errormsg").hide();
    		$.ajax({

    		  url: "/offre-service/facebookLogin",
    	      type: 'get',
    	     // dataType: 'json',
    	      contentType: 'application/json',
    	      cache: false,
    	      timeout: 600000,
    		  success: function (response) {
    	 //  alert("SUCCESS "+response)
    		
    		 window.location.replace("/offre-service/checkout");

    		  },

    		  error: function (err) {
    			  
    				var msg = err.responseText.substring(7, err.responseText.length  -1); 
    				   $('#ajaxLoader1').hide();
    				   $("#errormsg").show();
    				   $("#msg").text( msg);
    				  
    		  }
    		});

    		}
    		
    		

    	/* Open facebook popup login */
    	window.fbAsyncInit = function() {

    	    FB.init({
    	      appId: '2885289241548354', // App ID
    	      channelUrl: '//http://localhost:8081/authorization-server/login', // Channel File
    	      status: true,
    	      cookie: true,
    	      xfbml: true
    	    });

    	    FB.Event.subscribe('auth.authResponseChange', function(response) {

    	      if (response.status === 'connected') {
    	        testAPI();
    	      } else if (response.status === 'not_authorized') {
    	    	   alert( response.status );
    	      } else {

    	      }
    	    });
    	  };

    	  (function(d) {
    	    var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
    	    if (d.getElementById(id)) {
    	      return;
    	    }
    	    js = d.createElement('script');
    	    js.id = id;
    	    js.async = true;
    	    js.src = "//connect.facebook.net/en_US/all.js";
    	    ref.parentNode.insertBefore(js, ref);
    	  }(document));

    	  function testAPI() {
    	    FB.api('/me', function(response) {
    	    	closeup();
    	    	//facebookLogin();
    	      //alert('Good to see you, ' + response.name + '.');
    	    });
    	  }

    	  function loginFB()
    	  {    
    	    FB.login(function(response) {

    	      if (response.authResponse) {
    	    	//  alert("RESPONSE "+response.authResponse)
    	        testAPI();
    	        facebookLogin();
    	      } else {
    	      }
    	    });
    	  }

    	  function logoutFB()
    	  {
    	    FB.logout(function(response) {
    	    });
    	  }
