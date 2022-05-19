$(function(){
	$.ajax({
		url : "getcart",
		success : function(jsonarray){
			let tr=""
			for (let i = 0; i < jsonarray.length; i++){
				tr += 
				'<tr>'+
					'<td width="5%"><img width="100%" alt="" src="../admin/productimg/'+jsonarray[i]['pimg']+'"></td>'+
					'<td> '+jsonarray[i]['pname']+' <br>'+jsonarray[i]['scolor']+'/'+jsonarray[i]['ssize']+'</td>'+
					'<td> '+jsonarray[i]['totalprice']+'  </td>'+
					'<td> <button>X</button> </td>'+
				'</tr>'
			}
			$("#carttable").html( tr );
		}
	});
}); 