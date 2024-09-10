package FactoryDesign;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vehicle vehicle = null;
		
		
		
		
		System.out.println("What do you want to drive: ");
		String type =scanner.nextLine();
		
		if(type.equalsIgnoreCase("car")) {
			vehicle = new Car();
		}
		else {
			vehicle = new Bike();
		}
		
		vehicle.drive();
		scanner.close();
	}

}
