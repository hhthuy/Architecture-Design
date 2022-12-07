package state_pattern;

//import javax.naming.Context;

public class StopState implements State {
	public void doAction1(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

	@Override
	public void doAction(state_pattern.Context context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doAction(javax.naming.Context context) {
		// TODO Auto-generated method stub
		
	}
}
