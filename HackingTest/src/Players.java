import java.util.Scanner;
	/*
	 * It includes player1 Information
	 */
public class Players {
	
	static Hacker hacker = new Hacker();
	static SecurityDeveloper securityDV = new SecurityDeveloper();
	
	static Scanner playerInput = new Scanner(System.in);
	
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
	
	public static void info() {
		System.out.println("GAME ACCEPTED");
		System.out.println("---------- Hacker(Player1)    Information ----------");
		System.out.print("What ID you want to set? ");
		hacker.setID(playerInput.nextLine());
		System.out.print("What's your name? ");
		hacker.setName(playerInput.nextLine());;
		System.out.print("Enter your email address (if you dont, say \"no\") ");
		hacker.setEmail(playerInput.nextLine());
		
		System.out.println("---------- Developer(Player2) Information ----------");
		System.out.print("What ID you want to set? ");
		securityDV.setID(playerInput.nextLine());
		System.out.print("What's your name? ");
		securityDV.setName(playerInput.nextLine());
		System.out.print("Enter your email address (if you dont, say \"no\") ");
		securityDV.setEmail(playerInput.nextLine());
		System.out.println();
		System.out.println(hacker.toString());
		System.out.println(securityDV.toString());
	}
}
