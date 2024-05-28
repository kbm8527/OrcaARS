package kr.co.OrcaARS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.OrcaARS.vo.MemberVo;
import kr.co.OrcaARS.vo.RegisterMemberService;





@RestController
@RequestMapping
public class MemberRestController {

	
	//@RequestMapping(value = "/member/register/idCheck", method = RequestMethod.POST)
	

    /**
     * 	private final RegisterMemberService registerMemberService;

    public MemberRestController(RegisterMemberService registerMemberService) {
        this.registerMemberService = registerMemberService;
    }
     *   @PostMapping("/member/register")
    public ResponseEntity<String> register(@RequestParam MemberVo vo) {
        try {
            registerMemberService.register(vo.getUid(), vo.getPass());
            return ResponseEntity.ok("join success");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

     * 
     * **/
  
			
		
		
}
