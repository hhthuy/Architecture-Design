package state;

public class StateMain {

	public static void main(String[] args) {
		
		Package packaged = new Package();
		packaged.printStatus();
		
		// == 
		packaged.previousState();
		packaged.nextState();
		packaged.printStatus();
		// ==
		packaged.previousState();
		packaged.printStatus();
		// ==
		packaged.nextState();
		packaged.nextState();
		packaged.printStatus();
		packaged.nextState();
	}
}
