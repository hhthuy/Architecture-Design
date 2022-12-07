package Factory.Car;

import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		//String maxe, cauHinh = null, nhaSX, tinhNang;
		CarFactory carFactory= new CarFactory();
		Car carToyota = carFactory.getCar("TOYOTA");
		carToyota.getInfo("1", "TO-TA", "KG", "Chay Dua");
//		System.out.println("TOYOTA: " + carToyota);
		
		Car carNenus= carFactory.getCar("NENUS");
		carNenus.getInfo("2", "NE-NUS", "AM", "Chay");
//		System.out.println("NENUS: " + carNenus);
		
		
		
//----------------------------------------------
//		String maxe, cauHinh, nhaSX, tinhNang;
//		
//		Scanner scannerChon = new Scanner(System.in);
//		Scanner scannerNhap = new Scanner(System.in);
//		CarFactory carFactory= new CarFactory();
//		
//		System.out.println("1. Honda");
//		System.out.println("2. Nexus");
//		System.out.println("3. Toyoda");
//		System.out.println("Chon va thuong hieu xe");
//		int choose = scannerChon.nextInt();
//		System.out.println("Nhap ma xe");
//		maxe = scannerNhap.nextLine();
//		System.out.println("Nhap cau hinh");
//		cauHinh = scannerNhap.nextLine();
//		System.out.println("Nhap NSX");
//		nhaSX = scannerNhap.nextLine();
//		System.out.println("Nhap Tinh nang");
//		tinhNang = scannerNhap.nextLine();
//		
//		switch (choose) {
//		case 1: {
//			
//			Car car = carFactory.getCar("HONDA");
//			car.getInfo(maxe, cauHinh, nhaSX, tinhNang);
//			break;
//		}
//		case 2: {
//			Car car = carFactory.getCar("NEXUS");
//			car.getInfo(maxe, cauHinh, nhaSX, tinhNang);
//			break;
//		}
//		case 3: {
//			Car car = carFactory.getCar("TOYOTA");
//			car.getInfo(maxe, cauHinh, nhaSX, tinhNang);
//			break;
//		}
//		default:
//			System.out.println("Invalid input!");
//		}
	}

}
