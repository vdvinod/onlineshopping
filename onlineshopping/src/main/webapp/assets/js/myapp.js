$(function(){
	switch(menu){
	case 'About Us':
		$("#about").addClass('active');
		break;
	case 'Contact Us':
		$("#contacts").addClass('active');
		break;
	case 'All Products':
		alert(menu);
		$("#listProducts").addClass('active');
		break;
	default:
		$("#listProducts").addClass('active');
		$("#a_"+menu).addClass('active');
		break;
	}
});