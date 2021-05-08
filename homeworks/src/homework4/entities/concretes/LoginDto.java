package homework4.entities.concretes;

import homework4.entities.abstracts.Dto;

public class LoginDto implements Dto {

	private String eMail;
	private String password;

	public LoginDto() {
		super();
	}

	public LoginDto(String eMail, String password) {
		super();
		this.eMail = eMail;
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
