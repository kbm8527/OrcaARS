
      	window.onload = function() {
			  
			  buildCalendar();
			  
			  
    /**
     *  캘린더 오픈
     *  날짜 값을 받아 캘린더 폼을 생성하고, 날짜값을 채워넣는다.
     */
        function buildCalendar() {

            let doMonth = new Date(today.getFullYear(), today.getMonth(), 1);
            let lastDate = new Date(today.getFullYear(), today.getMonth() + 1, 0);

            let tbCalendar = document.querySelector(".datepicker_cal > tbody");
        
            document.getElementById("datepicker_year").innerText = today.getFullYear();   // YYYY월
            document.getElementById("datepicker_month").innerText = autoLeftPad((today.getMonth() + 1), 2);   // MM월
        
        


            // 이전 캘린더의 출력결과가 남아있다면, 이전 캘린더를 삭제한다.
            while(tbCalendar.rows.length > 0) {
                tbCalendar.deleteRow(tbCalendar.rows.length - 1);
            }


            // 첫번째 개행
            let row = tbCalendar.insertRow();



            // 날짜가 표기될 열의 증가값
            let dom = 1;

            // 시작일의 요일값( doMonth.getDay() ) + 해당월의 전체일( lastDate.getDate())을  더해준 값에서
            //               7로 나눈값을 올림( Math.ceil() )하고 다시 시작일의 요일값( doMonth.getDay() )을 빼준다.
            let daysLength = (Math.ceil((doMonth.getDay() + lastDate.getDate()) / 7) * 7) - doMonth.getDay();

            // 달력 출력
            // 시작값은 1일을 직접 지정하고 요일값( doMonth.getDay() )를 빼서 마이너스( - )로 for문을 시작한다.
            for(let day = 1 - doMonth.getDay(); daysLength >= day; day++) {

                let column = row.insertCell();

            //  평일( 전월일과 익월일의 데이터 제외 )
                if(Math.sign(day) == 1 && lastDate.getDate() >= day) {


                    // 평일 날짜 데이터 삽입

                    column.innerText = autoLeftPad(day, 2);


                    // 일요일인 경우
                    if(dom % 7 == 1) {
                        column.style.color = "#FF4D4D";
                    }

                    // 토요일인 경우
                    if(dom % 7 == 0) {
                        column.style.color = "#4D4DFF";
                        row = tbCalendar.insertRow();   //  토요일이 지나면 다시 가로 행을 한줄 추가한다.
                    }

                }

                // 평일 전월일과 익월일의 데이터 날짜변경
                else {
                    let exceptDay = new Date(doMonth.getFullYear(), doMonth.getMonth(), day);
                    column.innerText = autoLeftPad(exceptDay.getDate(), 2);
                    column.style.color = "#A9A9A9";
                }

                // 전월, 명월 음영처리
                // 현재년과 선택 년도가 같은경우
                if(today.getFullYear() == date.getFullYear()) {

                // 현재월과 선택월이 같은경우
                if(today.getMonth() == date.getMonth()) {

                    // 현재일보다 이전인 경우이면서 현재월에 포함되는 일인경우
                    if(date.getDate() > day && Math.sign(day) == 1) {
                        column.style.backgroundColor = "#E5E5E5";
                    }

                    // 현재일보다 이후이면서 현재월에 포함되는 일인경우
                    else if(date.getDate() < day && lastDate.getDate() >= day) {
                        column.style.backgroundColor = "#FFFFFF";
                        column.style.cursor = "pointer";
                        column.onclick = function(){ calendarChoiceDay(this); }
                    }

                    // 현재일인 경우
                    else if(date.getDate() == day) {
                        column.style.backgroundColor = "#FFFFE6";
                        column.style.cursor = "pointer";
                        column.onclick = function(){ calendarChoiceDay(this); }
                    }

                // 현재월보다 이전인경우
                } else if(today.getMonth() < date.getMonth()) {
                    if(Math.sign(day) == 1 && day <= lastDate.getDate()) {
                        column.style.backgroundColor = "#E5E5E5";
                    }
                }

                // 현재월보다 이후인경우
                else {
                    if(Math.sign(day) == 1 && day <= lastDate.getDate()) {
                        column.style.backgroundColor = "#FFFFFF";
                        column.style.cursor = "pointer";
                        column.onclick = function(){ calendarChoiceDay(this); }
                    }
                }
            }

            // 선택한년도가 현재년도보다 작은경우
            else if(today.getFullYear() < date.getFullYear()) {
                if(Math.sign(day) == 1 && day <= lastDate.getDate()) {
                    column.style.backgroundColor = "#E5E5E5";
                }
            }

            // 선택한년도가 현재년도보다 큰경우
            else {
                if(Math.sign(day) == 1 && day <= lastDate.getDate()) {
                    column.style.backgroundColor = "#FFFFFF";
                    column.style.cursor = "pointer";
                    column.onclick = function(){ calendarChoiceDay(this); }
                }
            }


            dom++;

        }
    }
			  
			  
			  
			  
			  
		  }
      
          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      //탭 메뉴 기능(아이디, 회원번호)
   
       $(function($) {
          
        $(".tab_cont > div").last().hide();
            var radioCont = $(".tab_cont > div");
          $("input[type='radio']").click(function(){
            radioCont.hide();

            radioCont.eq($("input[type='radio']").index(this)).show();
          })
      })

    
    
        //탭 메뉴 기능(로그인, 비로그인)
        $(function($) {
          
            $(".tab_head li").click(function(){
                var idx2 = $(this).index();
                $(".tab_head li").removeClass("on");
                $(".tab_head li").eq(idx2).addClass("on");
                $(".tab_content > div").hide();
                $(".tab_content > div").eq(idx2).show();
            
            })
        })

       
  
         //가는 날 선택 달력 구현      

        document.addEventListener("DOMContentLoaded", function() {
        
        
        sel_year();
       
        
        
        
           
        
        
        
        
        
  
        
        
        });

        var today = new Date(); // 전역 변수, 오늘 날짜 / 내 컴퓨터 로컬을 기준으로 today에 Date 객체를 넣어줌
        var date = new Date();  // 전역 변수, today의 Date를 세어주는 역할

        // 이전달 버튼 클릭
        function datepicker_prev() {
            this.today = new Date(today.getFullYear(), today.getMonth() - 1, today.getDate());
            buildCalendar();    // 전월 캘린더 출력 요청
        }

        // 다음달 버튼 클릭
        function datepicker_next() {
            this.today = new Date(today.getFullYear(), today.getMonth() + 1, today.getDate());
            buildCalendar();    // 명월 캘린더 출력 요청

        }

        // 달력 select 년,월 출력
        function sel_year() {
            var now = new Date();
            var now_year = now.getFullYear();
            var now_month = now.getMonth() + 1;
            
            for(var i = now_year; i <= 2024; i++)  {

                for(var j = now_month; j <= 12; j++ ) {
                          
                        $("#sel_yearmonth").append("<option value='"+ i +"'>" + i +"." + j + " </option>");

                }     
                
                if(i = 2024) {
                    
                    for(j = 1; j < 6; j++) {
                        $("#sel_yearmonth").append("<option value='"+ i +"'>" + i +"." + j + " </option>");

                    }
                    
                }
                
            }

           
        }

        function refresh() {
            
            $(".datepicker_cal > tbody > th > td ").load(window.location.href + ".datepicker_cal > tbody > th > td ");
            
            buildCalendar();
            
            today = new Date(today.getFullYear(), today.getMonth() , today.getDate());
            
            today.setMonth(4); 

        
        }

        function open_cal() {
            $(".calendar_layer").show();
            
        }
       
        function close_cal() {
            $(".calendar_layer").hide();
        }
 



        /**
         * 날짜 선택
        * 사용자가 선택한 날짜에 체크표시를 남긴다.
        */
        function calendarChoiceDay(column) {

        // 기존 선택일이 존재하는 경우 기존 선택일의 표시형식을 초기화 한다.
        if(document.getElementsByClassName("choiceDay")[0]) {
            document.getElementsByClassName("choiceDay")[0].style.backgroundColor = "#FFFFFF";
            document.getElementsByClassName("choiceDay")[0].classList.remove("choiceDay");
        }

        //선택일 체크 표시
        column.style.backgroundColor = "#FF9999";


        // 선택일 클래스명 변경
        column.classList.add("choiceDay");
        

    }


    /**
     * 숫자 두자릿수( 00 ) 변경
     * 자릿수가 한자리인 ( 1, 2, 3등 )의 값을 10, 11, 12등과 같은 두자리수 형식으로 맞추기위해 0을 붙인다.
     *  num   앞에 0을 붙일 숫자 값
     *  digit  글자의 자릿수를 지정 ( 2자릿수인 경우 00, 3자릿수인 경우 000 … )
     */
    function autoLeftPad(num, digit) {
        if(String(num).length < digit) {
            num = new Array(digit - String(num).length + 1).join("0") + num;
        }
        return num;
    }


	
    /**
	 * 
	 * 	var success = [[${success}]]
      	if(success == 'fail') {
			  alert('로그인에 실패했습니다. 아이디, 비밀번호를 다시 확인하십시오.');
		  }else {
			  alert('로그인에 성공했습니다.');
		  }   
      
      
	 * 
	 */
        
