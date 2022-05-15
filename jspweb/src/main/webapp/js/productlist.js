function pnomove(pno){
	$("#modalinput").val(pno);
}

function activechange(active){
	let pno = $("#modalinput").val();
	
	$.ajax({
		url : "activechange",
		data : {"pno" : pno, "active" : active},
		success : function(re){
			if (re == 1){
				alert("상태변경 성공");
				$("#modalclosebtn").click();
				$("#mainbox").load("productlist.jsp")
			} else {
				alert("상태변경 실패");
			}
		}
		
	});
}