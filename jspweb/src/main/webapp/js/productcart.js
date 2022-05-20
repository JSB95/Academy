let jsonarray;
let sumprice = 0;
let deliverypay = 0;
let totalpay = 0;
let point = 0;

$(function(){
	getcart();
})

function getcart(){
	$.ajax({
		url : 'getcart',
		success : function(json){
			jsonarray = json;
			tableview();
		}
	})
}

function tableview(){
		let tr= '<tr>' +
			'<th width="60%">상품정보</th>' +
			'<th width="20%">수량</th>' +
			'<th width="20%">가격</th>' +
		'</tr>';
		
		sumprice = 0;
		deliverypay = 0;
		totalpay = 0;
		for (let i = 0; i < jsonarray.length; i++){
			
			sumprice += jsonarray[i]["totalprice"];
			
			tr += 
			'<tr>'+
'				<td>'+
'					<div class="row">'+
'					'+
'						<div class="col-sm-2">'+
'						'+
'							<img alt="" src="/jspweb/admin/productimg/' + jsonarray[i]["pimg"] +'"width="70%">'+
'						'+
'						</div>'+
'						'+
'						<div class="col-sm-10">'+
'						'+
'							<div class="pnamebox">'+ jsonarray[i]["pname"]+'</div>'+
'							'+
'							<div class="optionbox">'+ jsonarray[i]["scolor"]+ '/' + jsonarray[i]["ssize"] + '</div>'+
'						'+
'						</div>'+
'					'+
'					</div> <br>'+
'					'+
'				</td>'+
'				'+
'				<td class="align-middle">'+
'					'+
'					<div class="row g-0">'+
'					'+
'						<div class="col-sm-5 offset-3">'+
'						'+
'							<input readonly="readonly" id="" value="'+ jsonarray[i]["samount"]+'" type="text" class="form-control">'+
'						'+
'						</div>'+
'						'+
'						<div class="col-sm-2">'+
'						'+
'							<button class="amount_btn" onclick="amountincre(' + i +')">▲</button>'+
'							<button class="amount_btn" onclick="amountdecre(' + i +')">▼</button>'+
'						'+
'						</div>'+
'					'+
'					</div>'+
'					'+
'				</td>'+
'				'+
'				<td class="align-middle">'+
'				'+
'					<div class="row g-0">'+
'					'+
'						<div class="col-md-8 pricebox"> '+ jsonarray[i]["totalprice"].toLocaleString() +'원</div>'+
'						<div class="col-md-4 deletebox"> <button onclick="cancel(' + i +')">X</button></div>'+
'					'+
'					</div>'+
'					'+
'				</td>'+		
			'</tr>'
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
		
		totalpay = sumprice + deliverypay;
		
		point = parseInt(sumprice * 0.01);
		
		$("#sumprice").html( sumprice.toLocaleString()+'원' );
		if (deliverypay == 0){
			console.log(deliverypay + " : 0원");
			console.log(deliverypay.toLocaleString() + '원');
			$("#deliverypay").html(deliverypay.toLocaleString()+'원');
		} else {
			console.log(deliverypay + " : 2500원");
			console.log(deliverypay.toLocaleString() + '원');
			$("#deliverypay").html( deliverypay.toLocaleString()+'원' );	
		}
		
		$("#totalpay").html( totalpay.toLocaleString()+'원' );
		$("#point").html( point.toLocaleString() );
		$("#carttable").html( tr );
}


function cancel(i){
	if (i == -1){
		if (confirm('전체 삭제하시겠습니까?')){
			for (let j = 0; j < jsonarray.length; j++){
				deletecart(j);
			}
		}
		return;
	}
	
	
	deletecart(i);
}

function amountincre (i){
	
	$.ajax({
		url : "getamount",
		data : {"pno" : jsonarray[i]['pno'],
				"color" : jsonarray[i]['scolor'],
				"size" : jsonarray[i]['ssize'] },
		success : function(maxamount){
			if (jsonarray[i]['samount'] >= maxamount){
				alert("재고가 부족합니다.");
				return;
			}
			let price = parseInt((jsonarray[i]['totalprice'] / jsonarray[i]['samount']));
			jsonarray[i]['samount']++;
			jsonarray[i]['totalprice'] = price * jsonarray[i]['samount'];
			updatecart();
		}
	});
}

function amountdecre (i){
	if (jsonarray[i]["samount"] == 1){
		alert("최소수량입니다.");
		return;
	}
	let price = parseInt((jsonarray[i]['totalprice'] / jsonarray[i]['samount']));
	jsonarray[i]["samount"]--;
	jsonarray[i]['totalprice'] = price * jsonarray[i]['samount'];
	updatecart();
}

function updatecart(){
	$.ajax({
		url : 'updatecart',
		data : {"json" : JSON.stringify(jsonarray)},
		success : function (json){
			console.log(jsonarray.toString() + "업데이트");
			getcart();
		}
	})
}

function deletecart(i){
	$.ajax({
		url : 'deletecart',
		data : {"json" : jsonarray[i]["cartno"]},
		success : function (re){
			getcart();
		}
	})
}
