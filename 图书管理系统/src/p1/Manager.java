package p1;

public class Manager {
	private String username;
	private String password;
	
	public Manager(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Manager() {
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

	public static void add(String nameString,String password) {
			
	}
	public String toString() {
		return "Manager [username=" + username + ", password="
				+ "���벻�����㣡]";
	}
}
