import java.util.Scanner;

public class SecurityWar extends Master_JiwonHwang{

	Scanner playerInput = new Scanner(System.in);
	private Players players;
	private static Master_JiwonHwang master;

	public static void main(String[] args) {
	
		Hacker hacker = new Hacker();
		SecurityDeveloper securityDV = new SecurityDeveloper();
		Players players = new Players(hacker, securityDV);
		
		master.gameIntro();
		
		System.out.println("Do you want to go through the game?");
		System.out.println("YES = 65454 | NO = 15687");
		System.out.println(" * * * WARNING : ONLY A VALID NUMBER ACCEPTED * * *");
		
		int answer = master.userInput.nextInt();
		
		boolean gameAllowed = master.gameProcessed(answer);
		
		if(gameAllowed) {
			System.out.println("---------- Hacker's(Player1) Information ----------");
			System.out.println("What ID you want to set?");
			hacker.setID(players.playerInput.nextLine());
			System.out.print("What's your name? ");
			hacker.setName(players.playerInput.nextLine());;
			System.out.println("Enter your email address (if you dont, say \"no\"");
			hacker.setEmail(players.playerInput.nextLine());
			
			System.out.println("---------- Security Developer(Player2) Information ----------");
			System.out.println("What ID you want to set?");
			securityDV.setID(players.playerInput.nextLine());
			System.out.print("What's your name? ");
			securityDV.setName(players.playerInput.nextLine());
			System.out.println("Enter your email address (if you dont, say \"no\"");
			securityDV.setEmail(players.playerInput.nextLine());
			
			System.out.println(hacker.toString());
			System.out.println(securityDV.toString());
		}
	}

	@Override
	public void gameMission() {}

}
