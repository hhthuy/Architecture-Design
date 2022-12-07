package state;

public class OrderState implements PackageState{

	@Override
	public void previousState(Package packaged) {
		
		System.out.println("Order not previous state");
	}

	@Override
	public void nextState(Package packaged) {
		
		packaged.setState(new DeliveryState());
	}

	@Override
	public void printState() {
		
		System.out.println("== Order state");
	}
}
