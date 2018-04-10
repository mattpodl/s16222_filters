package domain;


public class UserAccount {

	private String username;
	private String email;
	private String password;
	private String premium;


	public String getUsername() {
		return username;
	}
	public void setUsername(String surname) {
		this.username = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	private String premiumToString() {
		if (this.getPremium().equals("true")) {
			return "jest uzytkownikiem premium";
		} else {
			return "nie jest uzytkownikiem premium";
		}
	}

	public String toString() {
		return "\nusername: " + this.getUsername()
		+ "\ne-mail: " + this.getEmail()
		+ "\n" + premiumToString();

	}


}
