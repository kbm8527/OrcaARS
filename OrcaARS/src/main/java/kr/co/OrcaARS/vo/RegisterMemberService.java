package kr.co.OrcaARS.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.OrcaARS.domain.Member;
import kr.co.OrcaARS.persistance.MemberRepo;

@Service
public class RegisterMemberService {
   
	
	
	private final PasswordEncoder passwordEncoder;
    private final MemberRepo repository;

    @Autowired
    public RegisterMemberService(PasswordEncoder passwordEncoder, MemberRepo repository) {
        this.passwordEncoder = passwordEncoder;
        this.repository = repository;
    }

  
    
    /*
     * 
     * 
     * 
     *   public String register(String uid, String pass) {
        MemberVo member = MemberVo.createUser(uid, pass, passwordEncoder);
        validateDuplicateMember(member);
        repository.save(member);

        return member.getUid();
    }

    private void validateDuplicateMember(MemberVo member) {
        repository.findByUid(member.getUid())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }
     * 
     * 
     * 
     * */
    
    
}
