let jsonarray;

let sumprice = 0;
let deliverypay = 0;
let totalpay = 0;
let point = 0;

let mpoint = 0;
let member;

let pay_method;

$( function(){  // $(document).ready( function(){});  // 문서내에서 대기상태 이벤트
	
	$.ajax({
		url : "../member/getmember",
		success : function (json){
				member = json;
				getcart();
			}
	});
		
	$("#checkbox").change( function(){	
		// 체크박스가 변경 되었을때 이벤트 
		if( $("#checkbox").is(":checked") ){
			
			$("#ordername").val(member['mname']);
			$("#orderphone").val(member['mphone']);
			$("#maddress1").val(member['maddress'].split('_')[0]);
			$("#maddress2").val(member['maddress'].split('_')[1]);
			$("#maddress3").val(member['maddress'].split('_')[2]);
			$("#maddress4").val(member['maddress'].split('_')[3]);

		} else {
			
			$("#ordername").val("");
			$("#orderphone").val("");
			$("#maddress1").val("");
			$("#maddress2").val("");
			$("#maddress3").val("");
			$("#maddress4").val("");

			
		}
	});
	
});


function getcart(){
	$.ajax({
		url : 'getcart',
		success : function(json){
			jsonarray = json;
			cartview();
		}
	});
}

function cartview(){
	
	sumprice = 0;
	deliverypay = 0;
	totalpay = 0;
	
		let tr= '<tr>' +
			'<th width="60%">상품정보</th>' +
			'<th width="20%">수량</th>' +
			'<th width="20%">가격</th>' +	
		'</tr>';
		

		for( let i = 0 ; i<jsonarray.length; i++ ){
				
				sumprice += jsonarray[i]["totalprice"]; // 누적합계
				
				tr += 
				'<tr>'+
'					<td> <!--  상품정보 열 -->'+
'						<div class="row"> <!-- row(b) : 하위 태그를 가로배치   -->'+
'							<div class="col-sm-2"> <!-- col-sm-2(b) : 12그리드 중 2그리드 사용 -->'+
'								<img alt="" src="/jspweb/admin/productimg/'+jsonarray[i]["pimg"]+'" width="70%"> '+
'							</div>'+
'							<div class="col-sm-10">'+
'								<div class="pnamebox"> '+jsonarray[i]["pname"]+' </div>'+
'								<div class="optionbox">'+jsonarray[i]["scolor"]+' / '+jsonarray[i]["ssize"]+'</div>'+
'							</div>'+
'						</div>   '+
'						<br>'+
'					</td> '+
'					<td class="align-middle">'+
'						<div class="row g-0"> '+
'							<div class="col-sm-5 offset-3">'+ jsonarray[i]["samount"] +' 개 </div>'+
'						</div>'+
'					</td>'+
'					<td class="align-middle">'+
'						<div class="row g-0">'+
'							<div class="col-md-8 pricebox">'+jsonarray[i]["totalprice"].toLocaleString()+'원</div>'+
'						</div>'+
'					</td>'+
'				</tr>';
			}
		if (sumprice >= 70000){
			deliverypay = 0;
		} else {
			deliverypay = 2500;
		}
		
		
		if (jsonarray.length == 0){
			tr += '<td style="text-align: center" colspan="3">' +
				'상품이 없습니다. ' +
				'</td>';
			deliverypay = 0;
		}
		
		totalpay = sumprice + deliverypay - mpoint;
		
		point = parseInt(sumprice * 0.01);
	
		$("#carttable").html( tr );
		$("#mpoint").html(member["mpoint"]);
		$("#pointbox").html(mpoint);
		$("#totalpay").html(totalpay);
		$("#sumprice").html(sumprice);
		$("#deliverypay").html(deliverypay);
}

function paymethod(method){
	$("#paymethod").html(method);
	pay_method = method;
}


function payment() {
	
	if (pay_method == null){
		alert("결제 수단을 선택해주세요.");
		return;
	}
      // IMP.request_pay(param, callback) 결제창 호출
    var IMP = window.IMP; // 생략 가능
	IMP.init("imp24891880");
    IMP.request_pay({ // param
          pg: "html5_inicis",
          pay_method: pay_method,
          merchant_uid: "ORD20180131-0000011",
          name: "EZEN SHOP",
          amount: totalpay,
          buyer_email: member["memail"],
          buyer_name: member["mname"],
          buyer_tel: member["mphone"],
          buyer_addr: member["maddress"],
          buyer_postcode: member["maddress"].split("_")[0]
      }, function (rsp) { // callback
      
          if (rsp.success) {
              
          } else {
              saveorder();
          }
      });

}

function saveorder(){
	
	let ordername = $("#ordername").val();
	let orderphone = $("#orderphone").val();
	let orderaddress = $("#maddress1").val() + "_" + $("#maddress2").val() + "_" + $("#maddress3").val() + "_" + $("#maddress4").val();
	let ordertotalpay = totalpay;
	let orderrequest = $("#orderrequest").val();
	
	let orderjson = {
		ordername : ordername,
		orderphone : orderphone,
		orderaddress : orderaddress,
		ordertotalpay : ordertotalpay,
		orderrequest : orderrequest
		
	} 
	
	console.log(orderjson);
			
	$.ajax({
		url : "saveorder",
		data : {'orderjson' : JSON.stringify(orderjson)},
		success : function(re){			
			if(re == "true"){
				location.href="/jspweb/product/ordersuccess.jsp";
			} else {
				alert("오류");
			}
		}
	})
}

function sample4_execDaumPostcode() {
	new daum.Postcode({
    	oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
			// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }
            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("maddress1").value = data.zonecode;
            document.getElementById("maddress2").value = roadAddr;
            document.getElementById("maddress3").value = data.jibunAddress;
                
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
//            if(roadAddr !== ''){
//                document.getElementById("maddress5").value = extraRoadAddr;
//            } else {
//                document.getElementById("maddress5").value = '';
//            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
	            var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
    	        guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}

function pointbtn(){
	mpoint = $("#pointinput").val();
	
	if (mpoint == 0){
		mpoint = 0;
	} else if (mpoint < 5000){
		alert('최소 5000포인트부터 사용이 가능합니다.');
		mpoint = 0;
		$("#pointinput").val(0);
		return;
	} else if (mpoint > member["mpoint"]){
		alert("포인트가 부족합니다.");
		mpoint = 0;
		$("#pointinput").val(0);
		return;
	}
	
	cartview();
}