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
			players.info();
		} else {
			System.out.println("The wrong number failed.)");
		}
	}
}
