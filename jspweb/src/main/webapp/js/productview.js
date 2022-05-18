$("#color_select").change(function(){
	
	let color = $("#color_select").val(); 
	let pno = $("#pno").val();
	console.log(pno);
	console.log(color);
	
	$.ajax({
		url : "getstocksize",
		data : {"pno" : pno, "color" : color},
		success : function(re){
			let list = re.replace("{","");
			console.log(list);
			list = list.replace("}","");
			console.log(list);

			
			let itemlist = list.split(",");
			let html = "";
			html += "<option value=''>[필수] 옵션 선택 </option>";
			
			for (let item of itemlist){
				let color = item.split("=")[0];
				let amount = item.split("=")[1];
				html += "<option value='"+color+"'>"+color+" - "+amount+"개</option>";
			}
			$("#size_select").html(html);
		}
	});
	
})

let list = [];

$("#size_select").change(function(){
	let pname = $("#pname").html();
	let color = $("#color_select").val();
	if (color == ""){
		return;
	}
	let size = $("#size_select").val();
	if (size == ""){
		return;
	}
	let amount = $("#amount").val();
	if( $("#amount").val() == null ) {
		amount = 1;	
	} 
	let pprice =  $("#pprice").val();
	
	let chk = color + size;
	
	let object = {
		pname : pname,
		color : color,
		size : size,
		amount : amount,
		pprice : pprice,
		totalprice : (pprice * amount),
		point : (pprice * amount) * 0.01,
		chk : chk
	}
	console.log("amount : " + list.amount);
	for (let i = 0; i < list.length; i++){
		if (list[i].chk == chk){
			alert("이미 선택한 옵션입니다.");
			return;
		}
	}  
	list.push(object);
	choicelist();
	
	
})



function choicelist(){
	
	let html = '<tr> <th width="60%"> 상품명 </th> <th width="25%"> 상품수 </th><th width="15%"> 가격 </th></tr>';
	
	for (let i = 0; i < list.length; i++){
		list[i].totalprice = list[i].pprice * list[i].amount;
		list[i].point = list[i].totalprice *  0.01;
		html += 
			'<tr>'+
				'<td> <span>'+list[i].pname+'</span> <span class="pointbox">- '+list[i].color+'/'+list[i].size+'</span>'+
				'</td>'+
				'<td> <div class="row g-0">'+
						'<div class="col-md-7">'+
							'<input id="amount'+i+'" value="'+ list[i].amount +'" type="text" class="form-control amount_input">'+
						'</div>'+
						'<div class="col-md-4">'+
							'<button class="amount_btn" onclick="amountincre(' + i + ')">▲</button>'+
							'<button class="amount_btn" onclick="amountdecre(' + i + ')">▼</button>'+
						'</div>'+
						'<div class="col-md-1"> <button onclick="cancel(' + i + ')" class="cancel_btn">X</button>'+
						'</div>'+
					'</div>'+
				'</td>'+
				'<td>'+
					'<span class="pricebox">'+(list[i].amount * list[i].pprice).toLocaleString('ko-KR',{maximumFractionDigits : 0})+'원</span> <br>' +
					'<span class="pointbox">(적)'+((list[i].amount * list[i].pprice)*0.01).toLocaleString('ko-KR',{maximumFractionDigits : 0})+'원</span>'+
				'</td>'+
			'</tr>'
	}
	
	$("#select_table").html(html);
	let total_price = 0;
	let total_amount = 0;
	for (let i = 0; i < list.length; i++){
		total_price += (list[i].amount * list[i].pprice);
		console.log(total_price);
		total_amount += list[i].amount * 1;
	}
	
	$("#total_price").html(total_price.toLocaleString('ko-KR',{maximumFractionDigits : 0}) + '원 (' + total_amount + '개)');

		
}

function cancel(i){
	list.splice(i,1);
	choicelist();
}

function amountincre(i){
	let pno = $("#pno").val();
	$.ajax({
		url : "getamount",
		data : {'pno' : pno, 'color' : list[i].color, 'size' : list[i].size},
		success : function (maxamount){
			console.log(maxamount + "1");
			
			if(list[i].amount >= maxamount){
				alert("재고가 부족합니다.");
				return;
			}
			
			list[i].amount++;
			choicelist();
		}
	});
	
	

}

function amountdecre(i){
	if (list[i].amount == 1){
		alert("최소수량입니다.").
		return;
	}
	list[i].amount--;
	choicelist();
}

function saveplike(mno){
	let pno = $("#pno").val();
	if (mno == null){
		alert("로그인이 필요합니다.");
		return;
	}
	console.log(mno);
	
	$.ajax({
		url : "saveplike",
		data : {"mno" : mno, "pno" : pno},
		success : function (re){
			console.log("saveplike 통신");
			if (re == 1){
				alert("관심상품 등록 완료");
			} else if (re == 2){
				alert("관심상품 취소 완료");
			} else {
				console.log("오류");
			}
			$("#btnbox").load(location.href + " #btnbox")
		}
	});
}

function savecart(mno){
	if (mno == 0){
		alert("로그인이 필요합니다.");
		return;
	}
	console.log(list.length);
	
	if(list.length == 0){
		alert("선택된 옵션이 없습니다.");
	}
	
	$.ajax({
		url : 'savecart',
		data : {'json' : JSON.stringify(list)},
		success : function(re){
			console.log("서블릿 통신");
		}
	})
}

