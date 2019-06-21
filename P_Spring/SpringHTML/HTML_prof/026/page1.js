$(function(){

	$('.m1').toggle(function() {
		$('.hide').animate({"height":"100px"}, 500);
		$('.m1').html("close");
	}, function(){
		$('.hide').animate({"height":"0px"}, 500);
		$('.m1').html("more");
	});

});