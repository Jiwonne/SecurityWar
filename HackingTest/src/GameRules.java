import java.util.Scanner;

public interface GameRules {
	
	Scanner input = new Scanner(System.in);
	
	boolean gameProcessed(String parameter);
}
