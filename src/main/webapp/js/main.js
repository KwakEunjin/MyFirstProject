/*메인페이지 서브메뉴 호버*/
$(".nav").children("ul").find("li").mouseover(function(){
		$(".submenu").show();
})
$(".nav").mouseleave(function(){
		$(".submenu").hide();
})
function goBoard(url){
	$.ajax({
		url : url,
		type : "GET",
		dataType : "html",
		success:function(data){
			$(".write").html(data);
		}
	})
}