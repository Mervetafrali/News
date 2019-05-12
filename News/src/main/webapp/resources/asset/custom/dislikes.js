$(document).ready(function(){
	
	getNews();
	
	//setInterval(function(){ getNotes(); }, 3000);
	
});

function getNews(){
	$.ajax({
		type:"POST",
		url:'dislikes/'+val.kkk+'',
		contentType:'text/plain',
		data:$("#NewsId").val()+"",
		success:function(data){
			$("#title").val(data.title);
			$("#type").val(data.type);
			$("#date").val(data.date);
			$("#content").val(data.content);
			$("#image").val(data.image);
			$("#likes").val(data.likes);
			$("#dislikes").val(data.dislikes);
			$("#views").val(data.views);
		},error:function(data){
			alert(data);
		}
		
	});
	
}
function likes(){
	var param = {

			likes:$("#likes").val()
			
			
	}
	
	var ser_data = JSON.stringify(param);
	
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'likes',
		data: ser_data,
		success:function(data){
			alert(data);
		},error:function(data){
			alert(data);
		}
	});
}
function dislikes(){
	var param = {
			dislikes:$("#dislikes").val()
			
	}
	
	var ser_data = JSON.stringify(param);
	
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'dislikes',
		data: ser_data,
		success:function(data){
			alert(data);
		},error:function(data){
			alert(data);
		}
	});
}
