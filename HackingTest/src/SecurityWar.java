import java.net.URI;
import java.util.Scanner;

public class SecurityWar extends Master_JiwonHwang{

	private static Master_JiwonHwang master;

	public static void main(String[] args) {
		HackerMission mission = new HackerMission();
	
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
			System.out.println();
			System.out.println(mission.networkCommunication());
			System.out.println(mission.networkConnection());
			System.out.println(mission.networkMedia());
			System.out.println(mission.intermediaryDevices());
			System.out.println(mission.networkTopology());
		} else {
			System.out.println("The wrong number failed.)");
		}
	}
}
