/*Programming Assignment 4 CS201
Aboubacar D'Almeida
26-September-2025*/
import java.util.*;
public class programming4
{
	public static void main(String[] args) {
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers you would like displayed: ");
		int n = keyboard.nextInt();
		while (n < 0)
		{
		    System.out.println("Invalid input, please enter a non-negative integer: ");
		    n = keyboard.nextInt();
		}
		//Process + output
		int count = 1;
		
		int k = 0;
		String string = ""; 
		for(; count <= n; k++){
		    if(isprime(k)){
		        if(count % 100 >= 11 && count % 100 <= 13)
		        {
		            string = "th";
		        }
		        else if(count % 10 == 1)
		        {
		            string = "st";
		        }
		        else if(count % 10 == 2)
		        {
		            string = "nd";
		        } 
		        else if(count % 10 == 3)
		        {
		            string = "rd";
		        }
		        else
		        {
		            string = "th";
		        }
		        System.out.println("The " + count + string + " prime number is " + k);
	            count++;
		    }
		}
		
	}
	
	public static boolean isprime(int n){
        if(n == 0 || n == 1) 
            return false; // this if statement is for the exceptions
        for(int m = 2; m < n; m++)// using m to do the divisble test
        {
            if(n % m == 0) //if this number == 0 at any point, the test will fail 
                return false;
        }
        return true; //the loop finished, all test past, therefore everything is good.
    }
}