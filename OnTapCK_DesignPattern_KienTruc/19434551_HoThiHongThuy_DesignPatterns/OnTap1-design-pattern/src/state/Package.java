package state;

public class Package {

	private PackageState packageState = new OrderState();

	public void previousState() {
	
		packageState.previousState(this);
	}

	public void nextState() {

		packageState.nextState(this);
	}

	public void printStatus() {

		packageState.printState();
	}

	public PackageState getState() {
		return packageState;
	}

	public void setState(PackageState packageState) {
		this.packageState = packageState;
	}

}
