$(document).ready(function(){
	// Prepare the preview for profile picture
		$("#wizard-picture-1").change(function(){
			readURL_1(this);
		});
		$("#wizard-picture-2").change(function(){
			readURL_2(this);
		});
		$("#wizard-picture-3").change(function(){
			readURL_3(this);
		});
	});
	function readURL_1(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
	
			reader.onload = function (e) {
				$('#wizardPicturePreview-1').attr('src', e.target.result).fadeIn('slow');
			}
			reader.readAsDataURL(input.files[0]);
		}
	}
	function readURL_2(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
	
			reader.onload = function (e) {
				$('#wizardPicturePreview-2').attr('src', e.target.result).fadeIn('slow');
			}
			reader.readAsDataURL(input.files[0]);
		}
	}
	function readURL_3(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
	
			reader.onload = function (e) {
				$('#wizardPicturePreview-3').attr('src', e.target.result).fadeIn('slow');
			}
			reader.readAsDataURL(input.files[0]);
		}
	}