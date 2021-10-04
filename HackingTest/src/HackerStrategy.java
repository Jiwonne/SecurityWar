
public class HackerStrategy implements Beginning, Intermediate, Advanced {
	
	private String NO1;
	private String NO2;
	private String NO3;
	private String NO4;
	

	@Override
	public void questionFormat(String question, String NO1, String NO2, String NO3, String NO4, String userAnswer) {
		System.out.println(question + "?");
		this.NO1 = NO1;
		this.NO2 = NO2;
		this.NO3 = NO3;
		this.NO4 = NO4;
		System.out.println();
		System.out.println("Your answer is " + userAnswer);
		
	}

	// Begging
	@Override
	public boolean networkCommunication(String userAnswer) {
		
		questionFormat("Which of the following is the name for all computers connected to a network that participate directly in network communication",
					   "servers", "intermediary devices", "hosts", "media", userAnswer);
		if(NO3.equalsIgnoreCase(userAnswer)) {return true;} 
		else {
			System.out.println("Answer is " + NO3);
			return false;
		}
	}
	
	@Override
	public boolean networkMedia(String userAnswer) {
		
		questionFormat("When data is encoded as pulses of light, which media is being used to transmit the data?",
				       "wireless", "Fiber-optic cable", "just cable", "copper cable", userAnswer);
		
		if(NO2.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO2);
			return false;
		}
	}
	
	@Override
	public boolean intermediaryDevices(String userAnswer) {
		questionFormat("Which two devices are intermediary devices? (Choose two)",
				       "hosts and routers", "routers and switches,", "routers and servers", "servers and hub", userAnswer);
		if(NO2.equalsIgnoreCase(userAnswer)) {return true;}
		else {
			System.out.println("Answer is " + NO2);
			return false;
		}
	}
	
	
	
}
