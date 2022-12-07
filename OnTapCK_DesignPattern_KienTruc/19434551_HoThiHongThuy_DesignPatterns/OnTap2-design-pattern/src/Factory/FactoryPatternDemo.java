package Factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car1 = carFactory.getInfo("Honda");
		car1.getInfo("HonDa", "50PP", "ThanhPhat", "Chay");
		System.out.println(car1); 
		Car car2 = carFactory.getInfo("Nexus");
		car1.getInfo("Nexus", "50PP", "ThanhPhat", "Chay");
		System.out.println(car2); 
		Car car3 = carFactory.getInfo("Toyota");
		car1.getInfo("Toyota", "50PP", "ThanhPhat", "Chay");
		System.out.println(car3); 
}
}
