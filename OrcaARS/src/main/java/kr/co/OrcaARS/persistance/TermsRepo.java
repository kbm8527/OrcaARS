package kr.co.OrcaARS.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.OrcaARS.vo.TermsVo;

@Repository
public interface TermsRepo extends JpaRepository<TermsVo, Integer>  {

	
}
