
public class User {
	
	private String id;
	private String name;
	// The purpose of this game is to figure it out.
	private String password;
	private String email;
	
	/*
	 * Java convention: getter and then setter
	 */
	
	public String getID() {return id;}
	
	private void setID(String id) {this.id = id;}
	
	public String getName() {return name;}
	
	private void setName(String name) {this.name = name;}
	
	public String getEmail() {return email;}
	
	private void setEmail(String email) {this.email = email;}
}
