import java.util.Scanner;

public class SecurityWar extends Master_JiwonHwang{

	private static Master_JiwonHwang master;

	public static void main(String[] args) {
	
		Master_JiwonHwang master = new Master_JiwonHwang();
		Scanner playerInput = new Scanner(System.in);
		Hacker hacker = new Hacker();
		SecurityDeveloper securityDV = new SecurityDeveloper();
		Players players = new Players(hacker, securityDV);
		
		master.gameIntro();
		
		String acceptance = playerInput.nextLine();

		boolean gameAllowed = master.gameProcessed(acceptance);
		
		if(gameAllowed) {
			System.out.println();
			System.out.println("GAME ACCEPTED");
			System.out.println("---------- Hacker(Player1)    Information ----------");
			System.out.print("What ID you want to set? ");
			hacker.setID(players.playerInput.nextLine());
			System.out.print("What's your name? ");
			hacker.setName(players.playerInput.nextLine());;
			System.out.print("Enter your email address (if you dont, say \"no\") ");
			hacker.setEmail(players.playerInput.nextLine());
			
			System.out.println("---------- Developer(Player2) Information ----------");
			System.out.print("What ID you want to set? ");
			securityDV.setID(players.playerInput.nextLine());
			System.out.print("What's your name? ");
			securityDV.setName(players.playerInput.nextLine());
			System.out.print("Enter your email address (if you dont, say \"no\") ");
			securityDV.setEmail(players.playerInput.nextLine());
			System.out.println();
			System.out.println(hacker.toString());
			System.out.println(securityDV.toString());
		} else {
			System.out.println("The wrong number failed.)");
		}
	}
}
