
/*
 * I have to find a way to send an email to each player
 */
public class Hacker implements GameRules {
	
	private String id;	
	/*
	 *  it will be called in SecurityDeveloper's class.
	 */
	private static String name;
	private String email;
	
	public Hacker() {
		setID("464546");
		setName("Hacker1");
		setEmail(this.name + "@SecurityWar.com");
	};

	/*
	 * Overloaded constructor with Hacker(Player1) Info
	 */
	
	public Hacker(String id, String name, String email) {
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
	
	// it will be called in SecurityDeveloper's class.
	public static String getName() {return name;}
	
	protected void setName(String name) {this.name = name;}
	
	public String getEmail() {
		if(this.email.equalsIgnoreCase("NO")) {
			return getName() + "@SecurityWar.com";
		} return email;
	}
	
	protected void setEmail(String email) {this.email = email;}

	@Override
	public boolean gameProcessed(String name) {
		name = getName();
		System.out.println("I'm proud of" + name);
		System.out.println(name + " are our junior black hacker to invade the user's privacy.");
		System.out.println("The game will be processed at 3 levels | Beginning, Intermediate, Advanced");
		System.out.println("It's time for " + name + " to show how professional you are.");
		return true;
	}
	
	@Override
	public String toString() {
		return 
				"---------- Hacker(Player1)    Information ----------" + "\n" +
				"Hacker's name > " + getName() + "\n"+
				"Hacker's ID > " + getID() + "\n" +
				"Hacker's email > " + getEmail();		
	}
	
	// Here, I wanna run Beginning, Intermediate, Advanced Interface
	
}
