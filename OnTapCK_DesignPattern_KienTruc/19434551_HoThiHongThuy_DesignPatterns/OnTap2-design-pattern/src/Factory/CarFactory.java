package Factory;

public class CarFactory {
	public Car getInfo(String carType) {
		if(carType == null)
			return null;
		if(carType.equalsIgnoreCase("Honda"))
			return new Honda();
		else if(carType.equalsIgnoreCase("Nexus"))
			return new Nexus();
		else if(carType.equalsIgnoreCase("Toyota"))
		return new Toyota();
	return null;
	}
}
