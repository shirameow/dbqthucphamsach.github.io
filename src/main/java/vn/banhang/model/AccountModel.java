package vn.banhang.model;

public class AccountModel {
	private String username;
	private String password;
	private boolean member;
	public AccountModel(String username, String password, boolean member) {
		super();
		this.username = username;
		this.password = password;
		this.member = member;
	}
	public AccountModel() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "AccountModel [username=" + username + ", password=" + password + ", member=" + member + "]";
	}
	
}
