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

function getamount(pno){
	let scolor = $("#colorbox"+pno).val();
	let ssize = $("#sizebox"+pno).val();
	$.ajax({
		url : "getstock",
		data : {"field" : "amount", "pno" : pno, "scolor" : scolor, "ssize" : ssize},
		success : function(re){
			if (re == "") {
				$("#amountbox" + pno).html("해당 사이즈 색상 <br> 재고없음");
				$("#databox" + pno).html("");
			} else {
				$("#amountbox" + pno).html(re.split(',')[0] + "개");
				$("#databox" + pno).html(re.split(',')[1]);
			}
		}
	})
}

function getstock(pno){

	$.ajax({
		url : "getstock",
		data : {"pno" : pno},
		success : function(re){
			$("#stocklistbox").html(re);
		}
		
	});
	
}

function showupdate(sno){
	$("#updatebox").css("display","block");
	$("#sno").html(sno);
}

function stockupdate(){
	let sno = $("#sno").val();
	let samount = $("#samount").val();
	
	$.ajax({
		url : "stockupdate",
		data : {"sno" : sno, "samount" : samount},
		success : function(re){
			$("#modalclosebtn2").click();
			$("#mainbox").load("productlist.jsp");
		}
	});
}