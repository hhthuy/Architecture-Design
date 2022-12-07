package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.SanPham.SanPham;

public class MainDemo {
	public static void main(String[] args) {
		AbstractFactory chatlieuFactory = FactoryProducer.getFactory("ChatLieu");
		AbstractFactory sanphamFactory = FactoryProducer.getFactory("SanPham");
		
		ChatLieu cl = chatlieuFactory.getChatLieu("Go","Nhat Ban");
		System.out.println(cl.getInfo());
		
		SanPham sp = sanphamFactory.getSanPham("Ban","Hoc");
		System.out.println(sp.getInfo());
	}
}
