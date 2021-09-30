/*
 * I have to find a way to send an email to each player
 */
public class SecurityDeveloper implements GameRules {

	private String id;
	/*
	 *  it will be used in Hacker's class.
	 */
	private static String name;
	private String email;
	
	public SecurityDeveloper() {
		setID("156464");
		setName("SecurityDV1");
		setEmail(this.name + "@SecurityWar.com");
	};
	
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
	
	public String getEmail() {
		if(this.email.equalsIgnoreCase("NO")) {
			return getName() + "@SecurityWar.com";
		} return email;
	}
	
	protected void setEmail(String email) {this.email = email;}
	
	// Here, I wanna run Beginning, Intermediate, Advanced Interface
	
	@Override
	public boolean gameProcessed(String name) {
		name = getName();
		System.out.println("I'm proud of" + name);
		System.out.println(getName() + " are our junior security developer to protect the user's privacy from a hacker.");
		System.out.println("The game will be processed at 3 levels | Beginning, Intermediate, Advanced");
		System.out.println("It's time for " + getName() + " to show how professional you are.");
		return true;
	}
	
	@Override
	public String toString() {
		return 
				"---------- Developer(Player2) Information ----------" + "\n" +
				"Developer's name > " + getName() + "\n" +
				"Developer's ID > " + getID() + "\n" +
				"Developer's email > " + getEmail();		
	}
	
}
;