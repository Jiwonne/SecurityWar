/*
 * This interface has some functions that make the program hard for both hackers and security developers
 * Around the beginning, The beginning Interface will make the program a little bit sophisticated
 * The hacker should try their best to hack the user's information
 * The security developer should try their best to protect user's information from the hacker.
 */
interface Beginning {
	
	void questionFormat(String question, String NO1, String NO2, String NO3, String NO4);
	
	boolean networkCommunication(); // host
	boolean networkMedia(); // fiber optic cable
	boolean intermediaryDevices(); // routers, switches
	
	boolean networkConnection(); // NIC
	boolean specializedPort(); // Interface
	/*
	 * Bonus time : explaining a basic concept
	 */
	boolean networkTopology(); // logical topology and physical topology
	
//	boolean networkInfrastructure1(); // LAN
//	boolean networkInfrastructure2(); // Extranet
//	boolean networkInfrastructure3(); // WAN

	

}
