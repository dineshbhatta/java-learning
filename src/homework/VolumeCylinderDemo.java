package homework;

import java.util.Scanner;

public class VolumeCylinderDemo {

	public static void main(String[] args) {
	double radius;
	double area;
	double length;
	double volume;
	int height = 5;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a cylinder:");
		radius = input.nextDouble();
		System.out.println("Enter the length of a cylinder:");
		length = input.nextDouble();
		
		
		volume = radius * radius * 3.1415 * length;
		System.out.println("The volume is " + volume);
		 
		
		System.out.println("Enter the height of cylinder");
		height = input.nextInt();
		area = 2 * 3.1415 * height;
		System.out.println("The area of cylinder is " + area);
		
		
	}

}
