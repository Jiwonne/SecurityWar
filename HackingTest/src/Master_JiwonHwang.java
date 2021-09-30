
/*
 * This class is only managed by Jiwon Hwang (The master of the game)
 */
public class Master_JiwonHwang implements GameRules {

	private SecurityDeveloper securityDeveloper;
	private Hacker hacker;
	private Players players;

	/*
	 *  The security value is only altered by Master Jiwon.
	 */
	final String SECURITY_NUMBER = "65454";
	
	public void gameIntro() {
		System.out.println("Welcome to Security War game");

		System.out.println("Created by Jiwon Hwang" + "\n");
		System.out.println("The field of cyber security is mandatory for all developers.");
		System.out.println("I want to let you know the importance of security by running the program");
		System.out.println();
		System.out.println("If you want to process the game, enter the security number");
		gameSecurityNumber();
		System.out.println(" * * * WARNING : ONLY A VALID NUMBER ACCEPTED * * *");
	}
	
	@Override
	public boolean gameProcessed(String number) {
		
		boolean validYes = number.equalsIgnoreCase(SECURITY_NUMBER);
		
		if(validYes) {
			return true;
		} return false;
	}
	
	private void gameSecurityNumber() {
		System.out.println("Security number : " + SECURITY_NUMBER);
	}
		

}
 