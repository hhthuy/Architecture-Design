package AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("ChatLieu")) {
			return new ChatLieuFactory();
		} else if (choice.equalsIgnoreCase("SanPham")) {
			return new SanPhamFactory();
		}
		return null;
	}
}
