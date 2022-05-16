$(function getcategory(){
	$.ajax({
		url : "getcategory",
		data : {"type" : "option"},
		success : function(re){
			if (re == ""){
				$("#categorybox").html("없음");	
			} else {
				$("#categorybox").html(re);	
			}
			
		}
		
	});
});

$("#categorybox").change(function(){
	let cno = $("#categorybox").val();
	$.ajax({
		url : "getproduct",
		data : {"type" : "option", "cno" : cno},
		success : function(re){
			
			if (re == ""){
				alert("해당카테고리의 제품이 없습니다.");
				$("#productbox").html("");
				document.getElementById('stockaddform').attr('display' ,'none');
			} else {
				$("#productbox").html(re);	
				$("#stockaddform").css('display' ,'block');
			}
			
		}
	});
})

function stockadd(){
	let pno = $("#productbox").val();
	let scolor = $("#scolor").val();
	let ssize = $("#ssize").val();
	let samount = $("#samount").val();
	
	$.ajax({
		url : "stockadd",
		data : {"pno" : pno, "scolor" : scolor, "ssize" : ssize, "samount" : samount},
		success : function(re){
			if (re == 1){
				alert("재고등록 성공");
				$("#mainbox").load('productstock.jsp');
			} else {
				alert("재고등록 실패");
			}
		}
	});
}

$("#productbox").change(function(){
	getstock();
})

function getstock(){
	let pno = $("#productbox").val();
	$.ajax({
		url : "getstock",
		data : {"pno" : pno},
		success : function (re){
			$("#stocklistbox").html(re);
		}
	});
}
