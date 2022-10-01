import java.util.Scanner;

/**
 * This program it calculate the Fibonacci of a number iteratively and recursively 
 * @author Baataoui Youssef
 *
 */

public class Fibonacci {
	
	/**
	 * 
	 * @param args the command line arguments - unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// The scanner to read the user input
		
		System.out.println("Enter the number of Fibonacci series: "); // Ask the user to input a number
        int l = sc.nextInt(); // assign the input value to variable l

        // Test Iterative Function
        long startTime = System.nanoTime(); // Start time

        for(int i = 0 ; i <= l; i++) {
        	System.out.println(IterativeFibonacci(i)); // print numbers of the Fibonacci function
        }

        long endTime = System.nanoTime(); //end time
        long timeSpent = endTime - startTime;// calculate the runtime of the function
        System.out.println("Time to calculate Fibonacci of "+ l+ " iterative is " + timeSpent + "\n");

        // Test Recursive Function 
        long startTime1 = System.nanoTime(); // Start time

        for(int i = 0 ; i <= l; i++) {
        	System.out.println(IterativeFibonacci(i));
        }

        long endTime1 = System.nanoTime(); // End Time
        long timeSpent1 = endTime1 - startTime1; // calculate the runtime of the function
   
        System.out.println("Time to calculate Fibonacci of "+ l+ " recursive is " + timeSpent1);
        
	}
 
	/**
	 * Fibonacci function that calculate numbers iteratively
	 * @param n The number we want to calculate it's Fibonacci 
	 * @return The Fibonacci result of n
	 */
	public static int IterativeFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = 0;

        if(n == 0) return 0; //return 0 the number is 0
        if(n == 1) return 1; //return 1 if the number is 1

        for(int i = 2; i <= n; i++) { // for loop that start from the third number and loop until it reaches the n number.
            
            result = firstNumber + secondNumber; // calculate result
            firstNumber = secondNumber; // assign the secondNumber value to the firstNumber.
            secondNumber = result; // assign the value of result to the secondNumber

        }

        return result;

    }
 
	/**
	 * Fibonacci funtion that calculate numbers recursively
	 * @param n The number we want to calculate it's Fibonacci
	 * @return The Fibonacci result of n
	 */
    public static int RecursiveFibonacci(int n) {
        
        if(n == 0) return 0; //return 0 if the number is 0
        if(n == 1) return 1; //return 1 if the number is 1

        return RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);
    }



}
