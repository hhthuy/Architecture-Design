package state;

public class ReceiverState implements PackageState {

	@Override
	public void previousState(Package packaged) {

		packaged.setState(new DeliveryState());
	}

	@Override
	public void nextState(Package packaged) {

		System.out.println("Receiver not next state");
	}

	@Override
	public void printState() {

		System.out.println("== Receiver state");
	}
}
