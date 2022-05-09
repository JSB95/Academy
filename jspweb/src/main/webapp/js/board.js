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