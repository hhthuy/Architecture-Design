package state;

public interface PackageState {

	void previousState(Package packaged);

	void nextState(Package packaged);

	void printState();
}
