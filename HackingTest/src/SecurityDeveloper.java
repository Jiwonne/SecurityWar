/*
 * I have to find a way to send an email to each player
 */
public class SecurityDeveloper extends Master_JiwonHwang {

	private String id;
	/*
	 *  it will be used in Hacker's class.
	 */
	private static String name;
	private String email;
	
	public SecurityDeveloper() {};
	
	/*
	 * Overloaded constructor with SecurityDeveloper(Player2) Info
	 */
	public SecurityDeveloper(String id, String name, String email) {
		this.id = id;
		this.name = name;
		if(email.equalsIgnoreCase("NO")) {
			setEmail(this.name + "@SecurityWar.com");
		} this.email = email;
	}

	/*
	 * Java convention: getter and then setter
	 */
	
	public String getID() {return id;}
	
	protected void setID(String id) {this.id = id;}
	
	// it will be used in Hacker's class.
	public static String getName() {return name;}
	
	protected void setName(String name) {this.name = name;}
	
	public String getEmail() {return email;}
	
	protected void setEmail(String email) {this.email = email;}
	
	// Here, I wanna run Beginning, Intermediate, Advanced Interface
	
	@Override
	public void gameMission() {
		System.out.println("I'm proud of" + getName());
		System.out.println(getName() + " are our junior security developer to protect the user's privacy from a hacker.");
		System.out.println("The game will be processed at 3 levels | Beginning, Intermediate, Advanced");
		System.out.println("It's time for " + getName() + " to show how professional you are.");
	}
	
}
;