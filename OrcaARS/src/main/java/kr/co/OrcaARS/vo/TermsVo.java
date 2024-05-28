package kr.co.OrcaARS.vo;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_terms")
public class TermsVo {

	@Id
	private int seq;
	private String terms;
	private String privacy;
	private String location;
	private String thirdparty;
	private String marketing;
	
	
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public String getThirdparty() {
		return thirdparty;
	}
	public void setThirdparty(String thirdparty) {
		this.thirdparty = thirdparty;
	}
	
	public String getMarketing() {
		return marketing;
	}
	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}
}
