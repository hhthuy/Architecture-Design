package Factory.Car;


public class CarFactory {
	public Car getCar(String carType) {
		if(carType == null) {
			return null;
		}
		if(carType.equalsIgnoreCase("HONDA")){
			return new HonDa();
		}else if(carType.equalsIgnoreCase("NENUS")){
			return new Nexus();
		}else if(carType.equalsIgnoreCase("TOYOTA")) {
			return new Toyota();
		}
		return null;
	}
	
}
