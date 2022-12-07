package facrory.Car;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String information, configure, producer, feature;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		CarFactory carFactory= new CarFactory();
		System.out.println("Choose Car Brand:");
		System.out.println("1. Honda");
		System.out.println("2. Nexus");
		System.out.println("3. Honda");
		int choose = scanner.nextInt();
		System.out.println("Input information: ");
		information = scanner1.nextLine();
		System.out.println("Input configure: ");
		configure = scanner1.nextLine();
		System.out.println("Input producer: ");
		producer = scanner1.nextLine();
		System.out.println("Input feature: ");
		feature = scanner1.nextLine();
		switch (choose) {
		case 1: {
			
			Car car = carFactory.getCar("HONDA");
			car.getInfo(information,configure,producer,feature);
			break;
		}
		case 2: {
			Car car = carFactory.getCar("NEXUS");
			car.getInfo(information,configure,producer,feature);
			break;
		}
		case 3: {
			Car car = carFactory.getCar("TOYOTA");
			car.getInfo(information,configure,producer,feature);
			break;
		}
		default:
			System.out.println("Invalid input!");
		}
	}
	
}
