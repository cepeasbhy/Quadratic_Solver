import java.util.Scanner;
import java.lang.Math;

public class prob2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		
		System.out.println("Enter number of inputs to be processed: ");
		int run  = input.nextInt();
		input.nextLine();
		
		for(int i = 1; i<=run; i++) {
			
			System.out.println("Input"+i);
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
				
				System.out.println("x1 = " + String.format("%.2f", x1) + " x2 = "+ String.format("%.2f", x2));
				
			}else if(discriminat == 0) {
				double result = -b/(2*a);
				System.out.println("x = "+ String.format("%.2f", result));
				
			}else{
				System.out.println("x = IMAGINARY");
				
			}
			
		}
		
	}
		
}