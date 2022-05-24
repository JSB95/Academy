let parentlist;
//let result;

$(function(){
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
})

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
			'<div class="row"> '+
				'<div class="col-sm-3">'+  /* 주문 정보 출력 구역 */
					'<span> '+parentlist[i][0]["orderno"]+' </span>'+
					'<span> '+parentlist[i][0]["orderdate"]+' </span>'+
				'</div>'+
				'<div class="col-sm-9"> '; 
				
		for( let j = 0 ; j<parentlist[i].length ; j++ ){ /* 주문상세 출력 구역 */ 
			let childlist = parentlist[i];	// 상위리스트에 하나씩 하위리스트 꺼내기
			html += 
				'<div class="row"> '+
						'<div class="col-sm-8">'+
							'<span> <img width="100%" alt="" src="/jspweb/admin/productimg/'+childlist[j]["pimg"]+'"></span>'+
							'<span> '+childlist[j]["pname"]+' </span>'+
							'<span> '+childlist[j]["scolor"]+'/'+childlist[j]["ssize"]+'</span>'+
						'</div>'+
						'<div class="col-sm-4">'+
							'<button> 배송조회 </button>'+
							'<button> 교환 , 반품 신청 , 취소 신청 </button>'+
							'<button> 리뷰 작성하기 </button>'+
						'</div>'+
					'</div>';
			console.table(childlist);
		}			
			html += 
				'</div>'+
			'</div>';
	}

		$("#orderbox").html(html);
		
		// <img alt="" src="/jspweb/admin/productimg/' + orderlist[i]["pimg"] + '">

}