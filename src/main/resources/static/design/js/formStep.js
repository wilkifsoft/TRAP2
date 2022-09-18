var currentTab = 0; // Current tab is set to be the first tab (0)
	showTab(currentTab); // Display the current tab
	function showTab(n) {
	  // This function will display the specified tab of the form...
	  var x = document.getElementsByClassName("tab");
	  x[n].style.display = "block";
	  //... and fix the Previous/Next buttons:

	  if (n == 0) {
		document.getElementById("nextBtn").style.display = "inline";
	    document.getElementById("prevBtn").style.display = "none";
		document.getElementById("submitBtn").style.display = "none";
	  } 
	
	if (n == 1 || n == 2){
		document.getElementById("prevBtn").style.display = "inline";
		document.getElementById("nextBtn").style.display = "inline";
		document.getElementById("submitBtn").style.display = "none";
	}
	
	if (n == 3){
		document.getElementById("nextBtn").style.display = "none";
		document.getElementById("prevBtn").style.display = "inline";
		document.getElementById("submitBtn").style.display = "inline";
	}
	/*else {
	    document.getElementById("prevBtn").style.display = "inline";
		console.log(n)
	  }
	  if (n == (x.length - 1)) {
	    document.getElementById("nextBtn").innerHTML = "Submit";
	}*/
	  // } else if(n == 3){
	  //   document.getElementById("prevBtn").style.display = "none";
	  //   document.getElementById("nextBtn").style.display = "none";
	  // }
	  else{
	  	document.getElementById("nextBtn").innerHTML = "Next";
	  }
	 
	  fixStepIndicator(n)
	}

	function nextPrev(n) {
	  // This function will figure out which tab to display
	  var x = document.getElementsByClassName("tab");
	  // Exit the function if any field in the current tab is invalid:
	  if (n == 1 && !validateForm()) return false;
	  // Hide the current tab:
	  x[currentTab].style.display = "none";
	  // Increase or decrease the current tab by 1:
	  currentTab = currentTab + n;
	  // if you have reached the end of the form...
	  if (currentTab >= x.length) {
	    // ... the form gets submitted:
	    document.getElementById("regForm").submit();
	    return false;
	  }
	  // Otherwise, display the correct tab:
	  showTab(currentTab);
	}

	function validateForm(n) {
	  // This function deals with validation of the form fields
	  var x, y, i, valid = true;
	  x = document.getElementsByClassName("tab");
	  y = x[currentTab].getElementsByTagName("input");
	  // A loop that checks every input field in the current tab:
/*	  for (i = 0; i < y.length; i++) {
	    // If a field is empty...
	    if (y[i].value == "") {
	      // add an "invalid" class to the field:
	      // y[i].className += " invalid";
	      // and set the current valid status to false
	      valid = false;
	    }
	  }*/

//valid();


if($('#lastname').val()==""){
	
	$('#lastname').addClass( " invalid" );

	 valid = false;
}
else{
		$('#lastname').removeClass( " invalid" );
	// valid = true;
}




if($('#firstname').val()==""){
	
	$('#firstname').addClass( " invalid" );

	 valid = false;
}
else{
		$('#firstname').removeClass( " invalid" );
	// valid = true;
}




if($('#tel').val()==""){
	
	$('#tel').addClass( " invalid" );

	 valid = false;
}
else{
		$('#tel').removeClass( " invalid" );
	// valid = true;
}



if($('#sexe').val()==""){
	
	$('#sexe').addClass( " invalid" );

	 valid = false;
}
else{
		$('#sexe').removeClass( " invalid" );
	// valid = true;
}





if($('#cin_nif').val()==""){
	
	$('#cin_nif').addClass( " invalid" );

	 valid = false;
}
else{
		$('#cin_nif').removeClass( " invalid" );
	// valid = true;
}



















	  // If the valid status is true, mark the step as finished and valid:
	  if (valid) {
	    document.getElementsByClassName("step")[currentTab].className += " finish";
	  }
	  return valid; // return the valid status
	}

	function fixStepIndicator(n) {
	// This function removes the "active" class of all steps...
	  var i, x = document.getElementsByClassName("step");
	  for (i = 0; i < x.length; i++) {
	    x[i].className = x[i].className.replace(" active", "");
	  }
	  x[n].className += " active";
	}


	$(document).ready( function() {
    	$(document).on('change', '.btn-file :file', function() {
		var input = $(this),
			label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
		input.trigger('fileselect', [label]);
		});

		$('.btn-file :file').on('fileselect', function(event, label) {
		    
		    var input = $(this).parents('.input-group').find(':text'),
		        log = label;
		    
		    if( input.length ) {
		        input.val(log);
		    } else {
		        if( log ) alert(log);
		    }
	    
		});
		function readURL(input) {
		    if (input.files && input.files[0]) {
		        var reader = new FileReader();
		        
		        reader.onload = function (e) {
		            $('#img-upload').attr('src', e.target.result);
		        }
		        
		        reader.readAsDataURL(input.files[0]);
		    }
		}

		$("#imgInp").change(function(){
		    readURL(this);
		}); 	
	});
	
	
	
	function valid(){
		
		if($('#lastname').val()==""){
	
	$('#lastname').addClass( " invalid" );

	 valid = false;
}
else{
		$('#lastname').removeClass( " invalid" );
	// valid = true;
}




if($('#firstname').val()==""){
	
	$('#firstname').addClass( " invalid" );

	 valid = false;
}
else{
		$('#firstname').removeClass( " invalid" );
	// valid = true;
}




if($('#tel').val()==""){
	
	$('#tel').addClass( " invalid" );

	 valid = false;
}
else{
		$('#tel').removeClass( " invalid" );
	// valid = true;
}



if($('#sexe').val()==""){
	
	$('#sexe').addClass( " invalid" );

	 valid = false;
}
else{
		$('#sexe').removeClass( " invalid" );
	// valid = true;
}



if($('#cin_nif').val()==""){
	
	$('#cin_nif').addClass( " invalid" );

	 valid = false;
}
else{
		$('#cin_nif').removeClass( " invalid" );
	// valid = true;
}
		
	}
	
	

	
	
	
	
	
	
	
	
	
	