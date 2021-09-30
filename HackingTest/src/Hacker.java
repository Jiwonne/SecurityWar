
/*
 * I have to find a way to send an email to each player
 */
public class Hacker extends  Master_JiwonHwang {
	
	private String id;	
	/*
	 *  it will be called in SecurityDeveloper's class.
	 */
	private static String name;
	private String email;

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
	
	private void setID(String id) {this.id = id;}
	
	// it will be called in SecurityDeveloper's class.
	public static String getName() {return name;}
	
	private void setName(String name) {this.name = name;}
	
	public String getEmail() {return email;}
	
	private void setEmail(String email) {this.email = email;}

	@Override
	public void gameMission() {
		System.out.println("I'm proud of" + getName());
		System.out.println(getName() + " are our junior black hacker to invade the user's privacy.");
		System.out.println("The game will be processed at 3 levels | Beginning, Intermediate, Advanced");
		System.out.println("It's time for " + getName() + " to show how professional you are.");
	}
	
	// Here, I wanna run Beginning, Intermediate, Advanced Interface
	
}
