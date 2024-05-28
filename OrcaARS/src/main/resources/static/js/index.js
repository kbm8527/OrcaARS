 //네비게이션 서브 메뉴 기능
 
 		$(function(){
            $(".nav-main_wrap li").hover(function(){
                $("ul:first",this).show();
            }, function(){
                $("ul:first",this).hide();
            });
            $(".nav-main_wrap>li:has(ul)>a").each(function(){
                $(this).html($(this).html()+' &or;');
            });
            $(".nav-main_wrap ul li:has(ul)").find("a:first").append("<p style='float:right;margin:-3px'>&#9656;</p>");
       
       	
       	// 인덱스 페이지 탭 메뉴		
		
		for (let i = 0; i < $(".booking_widget_item").length; i++) {
			
			$(".booking_widget_item").eq(i).on("click", function(){
				
				$(".booking_widget_item").removeClass("active");
				$(".booking_widget_panel").removeClass("show");
				$(".booking_widget_item").eq(i).addClass("active");
				$(".booking_widget_panel").eq(i).addClass("show")
			})		
		}
		
		 for (let j = 0; j < $(".dialog1").length; j++) {
			
			$(".dialog1").eq(j).on("click", function(){
				
				$(".dialog1").removeClass("active1");
				$(".departure_city").removeClass("show1");
				$(".dialog1").eq(j).addClass("active1");
				$(".departure_city").eq(j).addClass("show1")
			})		
		   
 

            }   
		
			$(".dialog_close").click(function(){
             
            	$(".dialog_contents").hide();
             
			  })
		
			$(".dialog1").click(function(){
             
            	$(".dialog_contents").show();
             
			  })
		
        })

         
	