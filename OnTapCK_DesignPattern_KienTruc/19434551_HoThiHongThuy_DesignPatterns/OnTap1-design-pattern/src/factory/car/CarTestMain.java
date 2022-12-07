package factory.car;

public class CarTestMain {

	public static void main(String[] args) {

		Car hondaCar = CarFactory.getCar("HONDA", "HondarCarName", 1000);
		System.out.println("HondarCar: " + hondaCar);
		Car nexusCar = CarFactory.getCar("NEXUS", "NexusCarName", 2000);
		System.out.println("NexusrCar: " + nexusCar);
	}
}
