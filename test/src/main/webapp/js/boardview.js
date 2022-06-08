$('#delete').on('click', function(){
	
	let bno = $("#bno").val();
	
	let pw = $("#pw").val();
	
	$.ajax({
		url : "delete",
		data : {"bno" : bno, "pw" : pw},
		success : function(re){
			alert(re);
			location.href='boardlist.jsp';
		}
	})
	

})


