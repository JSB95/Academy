$(document).ready(function(){
	$('#summernote').summernote({
        placeholder: '내용 입력',
        tabsize: 2,
        height: 100
	});	
});

function filedelete(bno){
	alert("파일만삭제");
	$.ajax({
		url : "filedelete",
		data : {"bno" : bno},
		success : function(result){
			if(result == 1){
				alert("첨부파일 삭제 성공");
				location.reload();
			} else {
				alert("첨부파일 삭제 실패");
			}
		}
	});
}

function replywrite(bno){
	let rcontent = $("#rcontent").val();
	
	$.ajax({
		url: "replywrite",
		data: {"bno" : bno, "rcontent" : rcontent},
		success: function(result){
			if (result == 1){
				alert("댓글작성완료");
				$("#rcontent").val("");
				$("#replytable").load(location.href + " #replytable");
			} else {
				alert("댓글작성실패");
			}
		}
	});
}

function rereplyview(rno, bno, mid){
	
	if (mid == "null"){
		alert("로그인 후 작성이 가능합니다");
		return;
	}
	
	$("#"+rno).html(
		'<div class="row">' + 
			'<div class="col-md-10">' +
				'<textarea id="rrcontent" class="form-control" rows=3></textarea>' +
			'</div>'+ 
			'<div class="col-md-2">' +
				'<button class="form-control py-4 my-1" onclick="rereplywrite(' + rno + ',' + bno + ')">대댓글등록</button>' +
			'</div>' +
		'</div>'
		
	);
}

function rereplywrite(rno, bno){
	let rrcontent = $("#rrcontent").val();
	$.ajax({
		url: "rereplywrite",
		data: {"rno" : rno, "bno" : bno, "rrcontent" : rrcontent},
		success: function(result){
			if (result == 1){
				alert("대댓글 작성 완료");
				$("#rrcontent").val("");
				$("#replytable").load( location.href+" #replytable");
			} else {
				alert("대댓글 작성 실패");
			}
		}
	});
}

function replydelete( rno ){
	$.ajax({
		url : "replydelete" , 
		data : { "rno" : rno } , 
		success : function( result ){
			if( result == 1 ){
				alert("댓글이 삭제 되었습니다.");
				$("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("삭제 실패(관리자에게 문의)"); } 
		}
	});
}

function replyupdateview(rno){
	$("#"+rno).html(
		'<form action="../board/replyupdate" method="post" enctype="multipart/form-data">' +
			'<div class="row">' +
				'<div class="col-md-10">'+
					'<textarea id="rcontent" class="form-control" rows=1></textarea>'+
				'</div>'+
				'<div class="col-md-2">'+
					'<button class="form-control py-4 my-1" onclick="replyupdate(<%=reply.getRno()%>)">수정</button>'+
				'</div>'+
			'</div>' +
		'</form>'
	);
}

function replyupdate(rno){
	
	alert(rno);
	
 	/*$.ajax({
		url: "replyupdate",
		data: {"rno" : rno},
		success: function(result){
			if (result == 1){
				alert("댓글수정완료");
				$("#rcontent").val("");				
				$("#replytable").load(location.href + " #replytable");
			} else {
				alert("댓글작성실패");
			}
		}
	}); */
}
