import java.util.Scanner;
	/*
	 * It includes player1 Information
	 */
public abstract class Players {
	
	Hacker hacker;
	SecurityDeveloper securityDV;
	
	Scanner playerInput = new Scanner(System.in);
	
	public Players(Hacker hacker, SecurityDeveloper security) {
		hacker = player1();
		security = player2();
	}
	
	/*
	 * It will Hacker's information(Player1)
	 */
	public Hacker player1() {
		return new Hacker(
				 hacker.getID(),
				 hacker.getName(),
				 hacker.getEmail());
		}
	
	/*
	 * It will SecurityDeveloper's information(Player2)
	 */
	public SecurityDeveloper player2() {
		return new SecurityDeveloper(
				securityDV.getID(),
				securityDV.getName(),
				hacker.getEmail());
		}
}
