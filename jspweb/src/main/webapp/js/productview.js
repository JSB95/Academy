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
		chk : chk
	}
	console.log(chk);
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
		html += 
			'<tr>'+
				'<td> <span>'+list[i].pname+'</span> <br>  <span class="pointbox">- '+list[i].color+'/'+list[i].size+'</span>'+
				'</td>'+
				'<td> <div class="row g-0">'+
						'<div class="col-md-7">'+
							'<input id="amount" value="1" type="text" class="form-control amount_input">'+
						'</div>'+
						'<div class="col-md-4">'+
							'<button class="amount_btn">▲</button>'+
							'<button class="amount_btn">▼</button>'+
						'</div>'+
						'<div class="col-md-1"> <button onclick="cancel(' + i + ')" class="cancel_btn">X</button>'+
						'</div>'+
					'</div>'+
				'</td>'+
				'<td>'+
					'<span class="pricebox">'+(list[i].amount * list[i].pprice)+'</span> <br>' +
					'<span class="pointbox">(적)'+(list[i].amount * list[i].pprice)*0.01+'</span>'+
				'</td>'+
			'</tr>'
	}
	
	$("#select_table").html(html);
		
}

function cancel(i){
	list.splice(i,1);
	choicelist();
}