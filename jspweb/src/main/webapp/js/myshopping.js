let parentlist;
//let result;

$(function(){
	getorder();
})

function getorder(){
	$.ajax({
		url : "../product/getorder",
		success : function(result){
			parentlist = result;
			console.table(parentlist);
			//result = _.uniq(jsonarray, 'orderno');
			//console.table(result);
			view();
		}
	})
}

let viewcount = 2;

$(window).scroll(function(){
	if($(window).scrollTop() == $(document).height() - $(window).height() ){
		viewcount++;
		view();
	}
})


function view(){
	
	let html = "";
	
	for( let i = 0 ; i<parentlist.length ; i++ ){	// count 개수만큼 제품 수 출력
		if( i == viewcount ) break; // 만약에 i가 화면에 표시할 주문수와 동일하면 출력 금지 
		html += 
			'<div class="orderinfo"> '+
					'<span>주문</span><span> '+parentlist[i][0]["orderno"]+' </span>'+
					'<span> '+parentlist[i][0]["orderdate"]+' </span>'+
					'<a href="#"><span>주문상세보기</span></a>'
				'</div>'+
				'<div class="orderdetailbox col-sm-9"> '; 
				
		for( let j = 0 ; j<parentlist[i].length ; j++ ){ /* 주문상세 출력 구역 */ 
			let childlist = parentlist[i];	// 상위리스트에 하나씩 하위리스트 꺼내기
			
			let active;
			
			if (childlist[j]["orderdetailactive"] == 0){
				active = "상품준비중";
			} else if (childlist[j]["orderdetailactive"] == 1){
				active = "배송중";
			} else if (childlist[j]["orderdetailactive"] == 2){
				active = "배송완료";
			} else if (childlist[j]["orderdetailactive"] == 3){
				active = "구매확정";
			} else if (childlist[j]["orderdetailactive"] == 4){
				active = "취소요청";
			} else if (childlist[j]["orderdetailactive"] == 5){
				active = "취소완료";
			}
			
			html += 
				'<div class="row orderdetailbox mx-3"> '+
						'<div class="col-sm-2">'+
							'<img width="100%" alt="" src="/jspweb/admin/productimg/'+childlist[j]["pimg"]+'" width="100%">'+
						'</div>' +
							'<div class="col-sm-7 my-4">' +
								'<div class="row">' +
								'<div class="pname">' + childlist[j]["pname"] + '</div>' +
								'<div class="poption">' + childlist[j]["scolor"]+'/'+childlist[j]["ssize"] + ' · ' + childlist[j]["samount"] + '개 </div>' +
								'<div class="orderbuttonbox">' +
									'<button onclick=""> 배송조회 </button>' +
									'<button onclick="cancelbtn(' + childlist[j]["orderdetailno"] + ')" data-bs-toggle="modal" data-bs-target="#cancelmodal"> 취소신청 </button>' + 
									'<button onclick=""> 리뷰작성 </button>' +
								'</div>' +  
							'</div>' + 
						'</div>' +
						'<div class="col-sm-3">'+
							'<div class="activetitle"> 주문 상태 </div>' +
							'<div class="activecontent"> ' + active + ' </div>' +
						'</div>'+
					'</div>';
		}			
			html += 
			'</div>';
	}

		$("#orderbox").html(html);
		
}

let orderdetailno = -1;

function cancelbtn(no) {
	orderdetailno = no;
}

function cancel(){
	$.ajax({
		url : "/jspweb/product/updateorderdetail",
		data : {"orderdetailno" : orderdetailno, "active" : 4},
		success : function(re){
			if (re == "1"){
				alert("취소요청 성공");
				$("#modalclose").click();
				$("cancelconfirm").val();
				getorder();
			} else {
				alert("취소요청 실패")
			}
			
		}
	})
}