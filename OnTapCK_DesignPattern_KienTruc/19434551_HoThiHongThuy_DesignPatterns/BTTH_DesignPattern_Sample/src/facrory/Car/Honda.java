package facrory.Car;

public class Honda implements Car{
	private String information;
	private String configure;
	private String producer;
	private String feature;
	
	public Honda() {
		super();
	}

	public Honda(String information, String configure, String producer, String feature) {
		super();
		this.information = information;
		this.configure = configure;
		this.producer = producer;
		this.feature = feature;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getConfigure() {
		return configure;
	}

	public void setConfigure(String configure) {
		this.configure = configure;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	@Override
	public String toString() {
		return "Honda [information=" + information + ", configure=" + configure + ", producer=" + producer
				+ ", feature=" + feature + "]";
	}

	@Override
	public void getInfo(String information, String configure, String producer, String feature) {
		this.information = information;
		this.configure = configure;
		this.producer = producer;
		this.feature = feature;
		System.out.println(toString());
	}
	
}
