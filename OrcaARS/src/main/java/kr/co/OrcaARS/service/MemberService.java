package kr.co.OrcaARS.service;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import kr.co.OrcaARS.dao.MemberDao;

import kr.co.OrcaARS.persistance.MemberRepo;
import kr.co.OrcaARS.vo.MemberVo;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class MemberService implements UserDetailsService   {

	@Autowired
	private MemberDao dao;
	
	//public ResultVo selectCountUid(String uid) {
		//return dao.selectCountUid(uid);
	//}
	
	
	/*
	 * 	public int idCheck(String uid) throws Exception{
		
		return dao.idCheck(uid);
	}
 
	public MemberVo selectMember(MemberVo vo) {
		
		return dao.selectMember(vo);
	}
	 * 
	 * 
	 * */

		//@Autowired
	    private final MemberRepo memberRepo;
		
	    private final PasswordEncoder passwordEncoder;
	    
	    
		//@Autowired
	    public MemberService(MemberRepo memberRepo, PasswordEncoder passwordEncoder) {

	    	this.memberRepo = memberRepo;
			this.passwordEncoder = passwordEncoder;
	    
	    }

	    @Override
	    public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
	         MemberVo member = memberRepo.findByUid(uid);
	        
	        if(member == null) {
	        	throw new UsernameNotFoundException("사용자를 찾을수 없습니다.");
	
	        }
	        	return null;
	    }
		 	
		        /*

		         *  
		         *   	@Override
		    public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
		        Optional<MemberVo> member = memberRepo.findByUid(uid);
		        
		        if(member.isEmpty()) {
		        	throw new UsernameNotFoundException("사용자를 찾을수 없습니다.");
		   
		        }
		   
		        MemberVo memberVo = member.get();
		        List<GrantedAuthority> authorities = new ArrayList<>();
		        
		        if ("admin".equals(uid)) {
		            authorities.add(new SimpleGrantedAuthority(Member.ADMIN.getValue()));
		        } else {
		            authorities.add(new SimpleGrantedAuthority(Member.USER.getValue()));
		        }
		        return new User(memberVo.getUid(), memberVo.getPass(), authorities);
		    }
		        
		         *  
		         *  
		         *  
		         *  
		  
		             if (member.isEmpty()) {
		            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
		   
		        }
		         * 
		         * 
		         * 
		         * MemberVo memberVo = member.get();
		        List<GrantedAuthority> authorities = new ArrayList<>();
		        
		        if ("admin".equals(uid)) {
		            authorities.add(new SimpleGrantedAuthority(Member.ADMIN.getValue()));
		        } else {
		            authorities.add(new SimpleGrantedAuthority(Member.USER.getValue()));
		        }
		        return new User(memberVo.getUid(), memberVo.getPass(), authorities);
		    }
		
		         * */
		        
		        

	  
	   
	    //public Optional<MemberVo> findOne(String uid) {
	        
	    	//return null; 
	        		//(Optional<MemberVo>) memberRepo.findByUid(uid);
	  // }
	
	


	public int idCheck(String uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public MemberVo selectMember(String uid, String pass) {
		// TODO Auto-generated method stub
		return dao.selectMember(uid, pass);
	}


	//public MemberVo selectMember(MemberVo vo) {
		
		//return null;
	//}




	//public MemberVo selectMember(String uid, String pass) {
		
		//return dao.selectMember(uid, pass);


	

	
	//}


	
	
	
	
	
	
}
