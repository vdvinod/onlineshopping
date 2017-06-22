$(function(){
	switch(menu){
	case 'About Us':
		$("#about").addClass('active');
		break;
	case 'Contact Us':
		$("#contacts").addClass('active');
		break;
	default:
		$("#home").addClass('active');
		break;
	}
});