package state;

public class DeliveryState implements PackageState{

	@Override
	public void previousState(Package packaged) {
	
		packaged.setState(new OrderState());
	}

	@Override
	public void nextState(Package packaged) {
		
		packaged.setState(new ReceiverState());
	}

	@Override
	public void printState() {
		
		System.out.println("== Delivery state");
	}	
}
