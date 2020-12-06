import java.util.Scanner;
import java.lang.Math;

public class prob2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		
		int result  = 0;
		
		System.out.print("Enter value for A, B, C[Separated by space]: ");
		
		String in  = input.nextLine();
		
		String[] get_val = in.split(" ");
		
		int a = Integer.parseInt(get_val[0]);
		int b = Integer.parseInt(get_val[1]);
		int c = Integer.parseInt(get_val[2]);
		
		System.out.println("QE: "+a+"x^2 + "+b+ "x +"+ c);
		
		int discriminat = ((b*b)-(4*a*c));
		double root = Math.sqrt(discriminat);
		
		if(a == 0) {
			System.out.println("Not a valid quadratic equation");
			
		}else if(discriminat > 0) {
			double x1 = (-b+root)/(2*a);
			double x2 = (-b-root)/(2*a);
			System.out.print("x1 = " + x1 + " x2 = "+ x2);
		}
		
	}
		
}