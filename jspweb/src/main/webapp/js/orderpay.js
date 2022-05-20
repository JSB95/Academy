let jsonarray;
let totalpay = 0;
$(function(){
	getcart();
})

function order(){
	alert("결제");
}

function getcart(){
	$.ajax({
		url : 'getcart',
		success : function(json){
			jsonarray = json;
			
			for (let i = 0; i < jsonarray.length; i++){
				totalpay += jsonarray[i]['totalprice'];
			}
			console.log(totalpay);
			
		}
	})
}


function payment() {
      // IMP.request_pay(param, callback) 결제창 호출
    var IMP = window.IMP; // 생략 가능
	IMP.init("imp24891880");
    IMP.request_pay({ // param
          pg: "html5_inicis",
          pay_method: "card",
          merchant_uid: "ORD20180131-0000011",
          name: "EZEN SHOP",
          amount: totalpay,
          buyer_email: "gildong@gmail.com",
          buyer_name: "홍길동",
          buyer_tel: "010-4242-4242",
          buyer_addr: "서울특별시 강남구 신사동",
          buyer_postcode: "01181"
      }, function (rsp) { // callback
      
          if (rsp.success) {
              
          } else {
              saveorder();
          }
      });

}

function saveorder(){
	alert("DB처리");
	$.ajax({
		url : "saveorder",
		success : function(re){
			alert("DB처리 성공");
		}
	})
}