package kr.co.OrcaARS.vo;




import org.springframework.security.core.userdetails.User;

import groovy.transform.builder.Builder;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "o_member")
public class MemberVo {

	private int type;
	
	@Id
	private String lastName;
	private String firstName;
	private String englishFname;
	private String englishLname;
	private int gender;
	private String country;
	private String uid;
	private String pass;
	private String passConfirm;
	private String hp;
	private String email;
	private String tel;
	private String zip;
	private String addr1;
	private String addr2;
	private String passportNum;
	private String ip;
	private String leaveDate;
	private String rdate;
	
	
	
	
	
	
	
	
	
	
	


	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEnglishFname() {
		return englishFname;
	}
	public void setEnglishFname(String englishFname) {
		this.englishFname = englishFname;
	}
	public String getEnglishLname() {
		return englishLname;
	}
	public void setEnglishLname(String englishLname) {
		this.englishLname = englishLname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	public String getUid() {
		return uid;
	}
	
	
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPassConfirm() {
		return passConfirm;
	}
	public void setPassConfirm(String passConfirm) {
		this.passConfirm = passConfirm;
	}	
	
	public String getHp() {	
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	    @Builder
	    private MemberVo( String uid, String pass, String email) {
	      
	        this.uid = uid;
	        this.pass = pass;
	       
	        this.email = email;
	   
	    }
		public static Object builder() {
			// TODO Auto-generated method stub
			return null;
		}
	


	//public MemberVo(String uid, String encodedPassword) {
		// TODO Auto-generated constructor stub
	//}
	
	
	
	
	
	/*
	 * 
	 *  public MemberVo(Object object, String uid, String encode, String string) {
	// TODO Auto-generated constructor stub
}

public static MemberVo createUser(String uid, String pass, PasswordEncoder passwordEncoder) {
	// TODO Auto-generated method stub
	return new MemberVo(null, uid, passwordEncoder.encode(pass), "MEMBER");
}
	
	
	
	 * 
	 * 
	 * */
	
	
   // public MemberVo(Object object, String uid, String encode, String string) {
		// TODO Auto-generated constructor stub
	//}

	//public static MemberVo createUser(String uid, String pass, PasswordEncoder passwordEncoder) {
	      //  return new MemberVo(null, uid, passwordEncoder.encode(pass), "MEMBER");
	   // }


	 
	
	
	
}
