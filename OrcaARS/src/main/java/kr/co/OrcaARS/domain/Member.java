package kr.co.OrcaARS.domain;


import lombok.Getter;

@Getter
public enum Member {

	  	ADMIN("ROLE_ADMIN"),
	    USER("ROLE_USER");

	   Member(String value) {
		   this.value = value;
	   }


		private String value;


		public String getValue() {
			// TODO Auto-generated method stub
			return null;
		}


	
    
    /*
     * 
     * 
     * 
     *  public Member(Object object, String uid, String encode, String string) {
		// TODO Auto-generated constructor stub
	}

	public static Member createUser(String uid, String pass, PasswordEncoder passwordEncoder) {
	        return new Member(null, uid, passwordEncoder.encode(pass), "MEMBER");
	    }
   
     * 
     * 
     * 
     * 
     * 
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    

    @Column(unique = true)
    private String uid;
    private String pass;


	private Member(String uid, String pass) {
       
        this.uid = uid;
        this.pass = pass;
    
    }

    protected Member() {}

   public Member(Object object, String uid, String encode, String string) {
		// TODO Auto-generated constructor stub
	}

	public static Member createUser(String uid, String pass, PasswordEncoder passwordEncoder) {
        return new Member(null, uid, passwordEncoder.encode(pass), "MEMBER");
    }

    public String getUid() {
        return uid;
    }

    public String getPass() {
        return pass;
    }

  
}
     * 
     * 
     * */
}