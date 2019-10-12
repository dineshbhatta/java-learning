package homework;
import java.util.*; 
public class AreaCircleRectangleTriangle {
	public static double AreaOfCircle(double radius)
	{
		return 3.14* radius*radius;	
	}
	public static double AreaOfRectangle(double length, double width)
	{
		return  length*width;
		
	}public static double AreaOfTraingle(double basewidth, double height)
	
	{
		return basewidth * height/2;	
	}
	public static void main(String[] args) {	
	
		Scanner SC = new Scanner (System.in);
		System.out.print("Enter the radius of circle");
		double radius = SC.nextDouble();
		
		System.out.print("Enter the length of Rectangle");
		double length = SC.nextDouble();
		
		System.out.print("Enter the width of Rectangle");
		double width = SC.nextDouble();
		
		System.out.print("Enter the basewidth of Traingle");
		double basewidth = SC.nextDouble();
		
		System.out.print("Enter the height of Traingle");
		double height = SC.nextDouble();
		
		double AreaOfCircle = (radius);
		System.out.println("The area of circle is : " + AreaOfCircle);
		
		double AreaOfRectangle=AreaOfRectangle(length, width);
		System.out.println("The area of Rectangle is : " + AreaOfRectangle);
		
		double AreaOfTraingle =AreaOfTraingle(basewidth, height);
		System.out.println("The area of Traingle is : " + AreaOfTraingle);
		
		
		
		
		
	}

}
