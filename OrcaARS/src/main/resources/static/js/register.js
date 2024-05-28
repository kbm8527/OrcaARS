$(function() {
                //버튼 클릭 중복 방지 off추가
        $(document).one("click","#country", function(){
                           
            var countryAb = ['KR','GH','GA','GY','GM','GP','GT','GU','GD','GR','GL','GN','GW','NA','NR','NG','NI','AQ','ZA','NL','AN','NP','NO','NF','NZ','NC','NU','NE','TW','DK','DM','DO','DE','TL','LA','LR','LV'
                                ,'RU','LB','LS','RE','RO','LU','RW','LY','LT','LI','MG','MQ','MH','YT','MQ','MK','MW','MY','ML','MX'
                                ,'MC','MA','MU','MR','MZ','MS','MD','MV','MT','MN','US','UM','VI','MM','FM','VU','BH','BB','VA','BS','BD','BM','BJ','VE','VN','BE','BY','BZ','BA','BW','BO','BI','BF','BV','BT','MP','KP','BG','BR','BN','WS'
                                ,'SA','GS','CY','SM','ST','PM','EH','SN','RS','SC','LC','VC','KN','SH','SO','SB','SD','SR','LK','SJ','SZ','SE','CH','ES','SK','SI','SY','SL','SG','AE','AW','AM','AR','AS','IS','HT'
                                ,'IE','AZ','AF','AD','AI','AG','AL','DZ','AO','ER','EE','EC','ET','SV','GB','IO','VG','YE','OM','AT','HN','WF','JO','UG','UY','UZ','UA','IQ','IR','IL','EG','IT','IN','ID','JP','JM','ZM','GQ','GE','CF','CH','DJ','GI','ZW','TD','CZ'
                                ,'CL','CM','KZ','QA','CV','KH','CA','KE','KY','KM','CR','CC','CI','CO','CG','CD','CU','KW','CK','HR','CX','KG','KI','TJ','TZ','TH','TR','TC','TG','TK','TO','TM'
                                ,'TV','TN','TT','PA','PY','FO','PK','PF','PW','PS','PE','PT','FK','PL','PR','FR','GF','TF','PF','FJ','FI','PH','PN','HM','HU','AU','HK'
                                ];
            var country = ['대한민국','가나','가봉','가이아나','감비아','과들루프','과테말라','괌','그레나다','그리스','그린랜드','기니','기니 비사우','나미비아','나우루','나이지리아','나카라과','남극대륙','남아프리카공화국'
                                ,'네덜란드','네덜란드령 안틸레스','네팔','노르웨이','노르퍽','뉴질랜드','뉴칼레도니아','니우에섬','니제르','대만','덴마크','도미니카','도미니카 공화국','독일','동티모르','라오스','라이베리아','라트비아','러시아','레바논','레소토','레위니옹','루마니아','룩셈부르크'
                                ,'르완다','리비아','리투아니아','리히텐슈타인','마다가스카르','마르티니크','마셜제도','마요트','마카오','마케도이나','말라위','말레이시아','말리','멕시코','모나코','모로코','모리셔스','모리타니아','모잠비크','몬테세라트','몰도바','몰디브','몰타','몽골'
                                ,'미국','미국령 군소 제도','미국령버진군도','미얀마','미크로네시아 연방','바누아투','바레인','바베이도즈','바티칸시티','바하마','방글라데시','버뮤다 제도','베냉','베네수엘라','베트남','벨기에','벨라루스','벨리즈','보스니아 헤르체고비나','보츠나와','볼리비아','부룬디'
                                ,'부르키나 파소','부베 섬','부탄','묵마리아나 제도','북한','불가리아','브라질','브루나이','사모아','사우디아라비아','사우스조지아&사우스샌드위치섬','사이프러스','산마리노','상투메 프린시페','생피에르 미클롱','서사하라','세네갈','세르비아','세이셸','세인트루이사'
                                ,'세인트빈센트 그레나딘','세인트키츠 네비스','세인트헬레나','소말리아','솔로몬제도','수단','수리남','스리랑카','스발바르 얀마옌 제도','스와질란드','스웨덴','스위스','스페인','슬로바키아','슬로베니아','시리아','시에라리온','싱가포르','아랍에미리트','아루바','아르메니아','아르헨티나','아메리칸 사모아','아이슬란드','아이티'
                                ,'아일랜드','아제르바이잔','아프가니스탄','안도라','안퀄라','안티가 바부다','알바니아','알제리','앙골라','에리트레아','에스토니아','에콰도르','에티오피아','엘살바도르','영국','영국령 인도양 지역','영국령버진군도','예멘','오만','오스트리아','온두라스','왈리스 퓌튀나','요르단','우간다','우르과이','우즈베키스탄','우크라이나','이라크','이란','이스라엘','이집트','이탈리아','인도','인도네시아','일본','자마이카','잠비아','적도기니','조지아','중국','중앙아프리카','지부티','지브롤터','짐바브웨'
                                ,'차드','체코','칠레','카메룬','카자흐스탄','카타르','카푸버데','캄보디아','캐나다','케냐','케이맨','코모로','코스타리카','코코스제도','코트 디브아르','콜롬비아','콩고','콩고콩고민주공화국','쿠바','쿠웨이트','쿡제도','크로아티아','크리스마스섬','키르기스탄','키리바시','타지키스탄 공화국','탄자니아','태국','터키','턱스케이코스 제도','토고','토켈라우','통가','투르크메니스탄','투발루','튀니지','트리니다드 토바고','파나마','파라과이','파뢰제도','파키스탄','파푸아 뉴기니','팔라우','팔레스타인 영토','페루','포르투갈','포클랜드제도','폴란드','푸에르토리코','프랑스','프랑스령 기아나','프랑스령 남방 및 남극','프랑스령 폴리네시아','피지','핀란드','필리핀'
                                ,'핏케언 제도','허드 맥도널드 제도','헝가리','호주','홍콩'    
                                ];
                       
                            
                    for(i=0 , j = 0; i < countryAb.length, j < country.length; i++, j++) {
                 
                        $("#country").append("<option value='"+ countryAb[i] +"'>" + country[j] + "</option>");
                         
                    }
                        
                    $(function() {
          
                        $("#country").on("change", function(){            
        
                            $("#error_residentCountry").show();

    
                        })
                    })              
            
        })

    })
    
    function select_country() {
        
        var selectCountry = document.getElementById("country");
                    value = selectCountry.options[selectCountry.selectedIndex].value;
                    text  =  selectCountry.options[selectCountry.selectedIndex].text;

                    $(document).off("click","#btn_changeResidentCountry").on("click","#btn_changeResidentCountry", function(){
                            
                        $("#error_residentCountry").hide();

                            alert('거주지역이 ' + text + ' (으)로 변경됐습니다.');
                        
                        })

    }

    function help() {
        $(".layer_tooltip").show();
    }

    function help_close() {
        $(".layer_tooltip").hide();
    }

    function idCheck_open() {
        $(".layer_wrap").show();
        
        var uid = document.getElementById("uid");
        
        var uid = uid.value;
				
				$("#inputId").val(uid);		
 
        
    }
    

   function idCheck() {
	   
	   
	   
	   	//var uid =$("#inputId").val();
			    //var json = {"uid": uid};
				
				$.ajax({
				
					type:'GET',
					url:"/OrcaARS/member/register/idCheck",
					data: {"uid" : $("#inputId").val()},
					dataType : "json",
					success:function(result){
					
					var idRule = document.getElementById("p_idRule");
					var idInfo = document.getElementById("p_info");
					const idUse = document.getElementById("idUse");	
						
						if(result >= 1 ){ //중복 아이디가 있으면
								
								idRule.style.display = "block";
								idInfo.style.display = "none";
							
								idUse.disabled = true;
							
						}else { // 중복 아이디가 없으면
							
						
								idInfo.style.display = "block";
								idRule.style.display = "none";
						
							
							   
								var inputId = document.getElementById("inputId");
        						var inputId = inputId.value;
        							$("#checkUid").val(inputId);
        						
								idUse.disabled = false;
							
						}
						
					}
					
					
					})
			  
	   
   	}
  	
  	function idUse() {
		  
		var inputId = document.getElementById("inputId");    
        var inputId = inputId.value;
		
		
		$("#uid").val(inputId);		
 
        
        $(".layer_wrap").hide();
		  
		  
	  }		
	   
    

    function idCheck_close() {
        $(".layer_wrap").hide();
        
    } 