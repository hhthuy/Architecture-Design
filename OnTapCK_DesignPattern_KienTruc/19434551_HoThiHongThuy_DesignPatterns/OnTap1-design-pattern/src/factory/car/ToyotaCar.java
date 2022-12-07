package factory.car;

public class ToyotaCar extends Car {

	private String name;
	private double price;
	private String type;

	public ToyotaCar(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.type = "Toyota";
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
		return "ToyotaCar [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}
