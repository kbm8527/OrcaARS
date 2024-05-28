package kr.co.OrcaARS.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.OrcaARS.persistance.MemberRepo;
import kr.co.OrcaARS.persistance.TermsRepo;
import kr.co.OrcaARS.service.MemberService;

import kr.co.OrcaARS.vo.MemberVo;
import kr.co.OrcaARS.vo.TermsVo;

@Controller
public class MemberController {
	
	@Autowired
	private TermsRepo termsRepo;
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private MemberService service;

	
	private final PasswordEncoder passwordEncoder;

	 public MemberController( PasswordEncoder passwordEncoder) {
	    	this.passwordEncoder = passwordEncoder;
	    }


	
	/*
	 * 
	 * 	@GetMapping("/member/login")
	public String login(String success, Model model) {
		
		model.addAttribute("success", success);
		
		return "member/login";
	}
		
	 * 
	 * 
	 * 	@PostMapping("/member/login")
	public String login(MemberVo vo, HttpSession sess) {
		
		MemberVo member = service.selectMember(vo);
		
		if(member != null) {
			//로그인 성공
			sess.setAttribute("member", member);
			sess.setAttribute("type", member.getType());
			
			return "redirect:/";
			
		}else {
			
			//로그인 실패
			
			return "redirect:/member/login";

		}
		
		
		
		
	}
	
	 * 
	 * 
	 * */

	@GetMapping("/member/login")
	public String login() {
		
		return "member/login";
	}
		
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	@PostMapping("/member/login")
	public String login(MemberVo vo) {
		
		MemberVo member = service.selectMember(vo.getUid(),vo.getPass());
		
		if(member != null) {
			//로그인 성공
			
			
			
			return "index";
			
		}else {
			
			//로그인 실패
		
			return "member/login";

		}
	
	}
	@GetMapping("/member/term")
	public String term (String type, Model model) {
		
		TermsVo vo = termsRepo.findById(0).get();
		
		model.addAttribute("type", type);
		model.addAttribute(vo); // view와 공유
		
		
		return "member/term";
	}
	
	@GetMapping("/member/register")
	public String register() {
		
		return "member/register";
	}
	
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req, String pass, String passConfirm) {
		
		
			//사용자가 입력한 암호를 encode하여 저장
			String encodedPassword = passwordEncoder.encode(pass);
			
			//vo.setUid(uid);
			vo.setPass(encodedPassword);
			vo.setPassConfirm(encodedPassword);


			vo.setIp(req.getRemoteAddr());
			vo.setRdate(LocalDateTime.now().toString());
		
		memberRepo.save(vo);
		
		
		
		return "member/login";
				
		}
	
	/*
	 * 	
	
		

	dd
	 * 
	 * 
	 * 
	 * 
	 * */
	
	 @GetMapping("/member/logout")
	 public String logout(HttpServletRequest request, HttpServletResponse response) {

	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

	        if (authentication != null) {
	            new SecurityContextLogoutHandler().logout(request, response, authentication);
	        }

	        return "redirect:member/login";

	 }
	 
	 
	@ResponseBody //--> 자바 객체(Json)를 HTTP 응답 몸체로 전송함
	@GetMapping("/member/register/idCheck")
	public int idCheck(String uid) throws Exception {
		
		int result = 0;
		result = service.idCheck(uid);
		
		return result;
	}
	
	
	
	
	
}
