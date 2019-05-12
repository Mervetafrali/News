function addNews(){
	var param = {
			date:$("#date").val(),
			type:$("#type").val(),
			content:$("#content").val(),
			title:$("#title").val(),
			image:$("#image").val()
			
	}
	
	var ser_data = JSON.stringify(param);
	
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'addNews',
		data: ser_data,
		success:function(data){
			alert(data);
		},error:function(data){
			alert(data);
		}
	});
}
