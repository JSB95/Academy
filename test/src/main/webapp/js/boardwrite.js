$('#write').on('click',function(){
	let btitle = $(this).parent().parent().find('#board_title').val();
	let bcontent = $(this).parent().parent().find('#board_content').val();
	let bpassword = $(this).parent().parent().find('#board_password').val();
	let bwrite = $(this).parent().parent().find('#board_write').val();
	
	if(btitle == '' || bcontent == '' || bpassword == '' || bwrite == ''){
		alert("비어있는 항목 존재");
		return;
	}
	
	$.ajax({
		url : "boardwrite",
		data : {"btitle" : btitle, "bcontent" : bcontent, "bpassword" : bpassword, "bwrite" : bwrite},
		success : function(re){
			location.href="boardlist.jsp";
		}
		
		
	})
})