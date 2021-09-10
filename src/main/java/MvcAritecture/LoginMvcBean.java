package MvcAritecture;

public class LoginMvcBean {

	private String uname;
	private String upassword;

	public String getName() {
		return uname;
	}

	public void setName(String name) {
		this.uname = name;
	}

	public String getPassword() {
		return upassword;
	}

	public void setPassword(String password) {
		this.upassword = password;
	}
	public boolean validate()
	{
		if(upassword.equals("login"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
