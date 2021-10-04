import java.util.Scanner;

public class HackerMission implements Beginning, Intermediate, Advanced {
	
	Scanner user = new Scanner(System.in);
	
	private String userAnswer;
	private String NO1;
	private String NO2;
	private String NO3;
	private String NO4;
	

	@Override
	public void questionFormat(String question, String NO1, String NO2, String NO3, String NO4) {
		System.out.println("\n" + "Question: " + question + "?");
		this.NO1 = NO1;
		this.NO2 = NO2;
		this.NO3 = NO3;
		this.NO4 = NO4;
		System.out.println(NO1);
		System.out.println(NO2);
		System.out.println(NO3);
		System.out.println(NO4);
		userAnswer = user.nextLine();
		System.out.println();
		System.out.println("Your answer is " + userAnswer);
	}

	// Begging
	@Override
	public boolean networkCommunication() {
		
		questionFormat("Which of the following is the name for all computers connected to a network that participate directly in network communication",
					   "servers", "intermediary devices", "hosts", "media");

		if(NO3.equalsIgnoreCase(userAnswer)) {return true;} 
		else {
			System.out.println("Answer is " + NO3);
			return false;
		} 
	}
	
	@Override
	public boolean networkMedia() {
		
		questionFormat("When data is encoded as pulses of light, which media is being used to transmit the data?",
				       "wireless", "Fiber-optic cable", "just cable", "copper cable");
		
		if(NO2.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO2);
			return false;
		}
	}
	
	@Override
	public boolean intermediaryDevices() {
		questionFormat("Which two devices are intermediary devices? (Choose two)",
				       "hosts and routers", "routers and switches,", "routers and servers", "servers and hub");
	
		if(NO2.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO2);
			return false;
		}
	}
	
	@Override
	public boolean networkConnection() {
		questionFormat("Which connection physically connects the end device to the network",
				       "NIC", "Port", "Cable", "Interface");

		if(NO1.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO1);
			return false;
		}
	}
	
	@Override
	public boolean specializedPort() {
		
		questionFormat("Which connections are specialized ports on a networking device that connect to individual networks?",
				       "NIC", "Port", "Cable", "Interface");

		if(NO4.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO4);
			return false;
		}
	}
	
	@Override
	public boolean networkTopology() {
		System.out.println("So far So good!, I will organize some important concepts this time.");
		System.out.println("Please feel comfortable with CCNA");
		
		System.out.println("A NIC is a specialized port on a networking device that connects to individual networks.");
		System.out.println("An interface physically connects the end device to the network.");
		System.out.println("The logical topology lets you see which end devices are connected to which intermediary devices and what media is being used.");
		System.out.println("The physical topology lets you see the actual location of intermediary devices and cable installation.");
		
		System.out.println("Are you still confused with NIC and Interface?");
		System.out.println("NIC is related to 'Networking device'");
		
		return true; 

	}

	
}
