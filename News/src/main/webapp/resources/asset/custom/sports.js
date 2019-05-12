$(document).ready(function(){
	
	getNews();
	
	//setInterval(function(){ getNotes(); }, 3000);
	
});

function getSports(){
	$.ajax({
		type:"POST",
		url:'sports',
		success:function(data){
			var list = "";		
			$(data).each(function(i,val){
				
				list = list 
				
				+'<div class="col-md-6 col-lg-4">'
				+'<a href="blog/'+val.kkk+'" class="a-block d-flex align-items-center height-md" style="background-image: url('+val.image+'); "> '
				+'<div class="text">'
				+'	<div class="post-meta">'
				+'<span class="category">'+val.type+'</span> '
				+'<span class="mr-2">'+val.date+'</span> '
				+'	&bullet;'
				+'</div> '
				+'<h3>'+val.title+'</h3>'
				+'	</div>'
				+'</a>'
				+'</div>'
				
			});
			$("#list").html(list);
			
		},error:function(data){
			alert(data);
		}
	});
	
}