package kr.co.OrcaARS.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.OrcaARS.vo.MemberVo;


@Repository
public interface MemberDao {

	@Autowired
	public MemberVo selectMember(MemberVo vo);
	

	
	public int idCheck(String uid) throws Exception;



	public MemberVo selectMember(String uid, String pass);
	 
	
 

}
