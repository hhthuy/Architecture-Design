package factory.car;

public class NexusCar extends Car {

	private String name;
	private double price;
	private String type;

	public NexusCar(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.type = "NEXUS";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String toString() {
		return "NexusCar [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}
