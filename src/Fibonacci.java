import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Fibonacci series: ");
        int l = sc.nextInt();

        // Test Iterative Function
        long startTime = System.nanoTime(); // Start time

        for(int i = 0 ; i <= l; i++) {
        	System.out.println(IterativeFibonacci(i)); // print numbers of the Fibonacci function
        }

        long endTime = System.nanoTime(); //end time
        long timeSpent = endTime - startTime;
        System.out.println("Time to calculate Fibonacci of "+ l+ " iterative is " + timeSpent + "\n");

        // Test Recursive Function 
        long startTime1 = System.nanoTime();

        for(int i = 0 ; i <= l; i++) {
        	System.out.println(IterativeFibonacci(i));
        }

        long endTime1 = System.nanoTime();
        long timeSpent1 = endTime1 - startTime1;
   
        System.out.println("Time to calculate Fibonacci of "+ l+ " recursive is " + timeSpent1);
        
	}
	
	// Fibonacci funtion that calculate numbers iterative
	public static int IterativeFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = 0;

        if(n == 0) return 0; //return 0 the number is 0
        if(n == 1) return 1; //return 1 if the number is 1

        for(int i = 2; i <= n; i++) {
            
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;

        }

        return result;

    }
	
	// Fibonacci funtion that calculate numbers recursive
    public static int RecursiveFibonacci(int n) {
        
        if(n == 0) return 0; //return 0 the number is 0
        if(n == 1) return 1; //return 1 if the number is 1

        return RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);
    }



}
