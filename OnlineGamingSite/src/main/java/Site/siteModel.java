package Site;

public class siteModel {
    private int user_id;
    private String user_name;
    private String email;
    private String password_hash;
	private String created_date;
	
    public siteModel(int user_id, String user_name, String email, String password_hash, String created_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.password_hash = password_hash;
		this.created_date = created_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
    
}
