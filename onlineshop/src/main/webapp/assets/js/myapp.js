$(function(){
	// solving the active manu problem
	switch(manu){
	
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
		$('#a_'+manu).addClass('active');
		break;
	
	}
	
	
});