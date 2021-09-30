import java.util.Scanner;

/*
 * This class is only managed by Jiwon Hwang (The master of the game)
 */
abstract public class Master_JiwonHwang {
	
	Scanner userInput = new Scanner(System.in);
	private SecurityDeveloper securityDeveloper;
	private Hacker hacker;
	private Players players;

	/*
	 *  The YES and NO's value is only altered by Master Jiwon.
	 */
	final int YES = 65454;
	final int NO = 15687;
	
	public int getYES() {return YES;}
	
	public int getNO() {return NO;}
	
	public void gameIntro() {
		System.out.println("Welcome to Security War game");

		System.out.println("This game is created by Jiwon Hwang, a third-semester Computer Programming student at Algonquin College");
		System.out.println("The field of cyber security is mandatory for all developers.");
		System.out.println("I want to let you know the importance of security by running the program");
		System.out.println("Welcome to Security War game");
		System.out.println("The game is aggresive, if you want to give up, free to stop.");
	}
	
	public boolean gameProcessed(int allowanced) {

		System.out.println("Do you want to go through the game?");
		System.out.println("YES = 65454 | NO = 15687");
		System.out.println(" * * * WARNING : ONLY A VALID NUMBER ACCEPTED * * *");
		
//		int answer = userInput.nextInt();
		int answer = players.playerInput.nextInt();
		if(answer == getYES()) {
			return true;
		} else if(answer == getNO()) {
			return false;
		} return false;
	}
	
	/*
	 * Based on the role, the mission status is different.
	 */
	abstract public void gameMission();

}
