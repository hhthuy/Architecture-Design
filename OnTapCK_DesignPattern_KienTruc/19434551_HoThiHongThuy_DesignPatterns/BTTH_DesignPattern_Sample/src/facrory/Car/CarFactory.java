package facrory.Car;

public class CarFactory {
	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("HONDA")) {
			return new Honda();
		} else if (carType.equalsIgnoreCase("NEXUS")) {
			return new Nexus();
		} else if (carType.equalsIgnoreCase("TOYOTA")) {
			return new Toyota();
		}
		return null;
	}
}
