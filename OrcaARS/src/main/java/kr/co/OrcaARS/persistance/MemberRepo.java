package kr.co.OrcaARS.persistance;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import kr.co.OrcaARS.vo.MemberVo;

//@Repository
public interface MemberRepo extends JpaRepository<MemberVo, Integer> {

	
	
	//public int idCheck(MemberVo vo) throws Exception;
	
	
	MemberVo findByUid(String Uid);

	Optional<MemberVo> findByEmail(String email);


	



	
}
