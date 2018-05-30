package model;

public class User {
	private String firstName;
	private String lastName;
	private String sex;
	private String email;
	private String username;
	private String password;

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getSex() { return sex; }
	public String getEmail() { return email; }
	public String getUsername() { return username; }
	public String getPassword() { return password; }
	
	
	public void setLastName(String ln){
		lastName = ln;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
}
