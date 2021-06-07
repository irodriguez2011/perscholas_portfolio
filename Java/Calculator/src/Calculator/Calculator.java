package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void addNums(int a , int b) {
        System.out.println(a+b);
    }
    public static void subtractNums(int a , int b) {
        System.out.println(a-b);
    }
    public static void multiplyNums(int a , int b) {
        System.out.println(a*b);
    }
    static double divideNums(int a , int b) {
        double c = a/b;
        return c;
    }
    
    public static int exit() {
    	return 0;
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
			

        System.out.println("Enter numbers 1-5");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Options: Type 1 to add, 2 to subtract,"
        		+ "3 to multiple, 4 to divide, and 5 to exit");
        int chooseOperator = scan.nextInt();
      
        scan.close();
		
		
		
		switch (chooseOperator) {
        case 1:
            System.out.println("The sum of " + num1 + " and " + num2 + "  is:");
            addNums(num1, num2);
            break;
        case 2:
            System.out.println("The deficit of " + num1 + " and " + num2 + "  is:");
            subtractNums(num1, num2);
            break;
        case 3:
            System.out.println("The product of " + num1 + " and " + num2 + "  is:");
            multiplyNums(num1, num2);
            break;
        case 4:
            System.out.println("The quotient of " + num1 + " and " + num2 + "  is:");
            System.out.println(divideNums(num1, num2));
            break;
        case 5:
        	exit();
        	break;
        default:
            System.out.println("Please enter a valid number.");
    }
		
		
		
		

	}

}
