package factory.car;

public class CarFactory {

	public static Car getCar(String type, String name, double price) {

		if ("HONDA".equalsIgnoreCase(type))
			return new HondaCar(name, price);
		if ("NEXUS".equalsIgnoreCase(type))
			return new NexusCar(name, price);
		if ("TOYOTA".equalsIgnoreCase(type))
			return new ToyotaCar(name, price);

		return null;
	}
}
