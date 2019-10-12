package homework;
import java.text.DecimalFormat;
import java.util.Scanner;

public class circlePerimeterDemo {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.print("Enter radius: ");
		float r = SC.nextFloat();
		double area =Math.PI*Math.pow(r,2);
		double per= 2*Math.PI*r;
		
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("Area : "+df.format(area));
		System.out.println("Peremeter : "+df.format(per));
		

	}

}
