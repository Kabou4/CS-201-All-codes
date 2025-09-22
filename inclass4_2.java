/*In class exercise 4 for CS201
Aboubacar D'Almeida
22 September 2025*/
import java.util.*;
public class inclass4_2
{
	public static void main(String[] args) {
	    //input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a non-negative integer: ");
		int n = keyboard.nextInt();
		while(n < 0)
		{
		System.out.println("Invalid input, please enter a non-negative integer: ");
		n = keyboard.nextInt();
		}
		//process + output
		if ( isprime(n) == true) // == true is redundant because isprime(n) is a boolean function
		{
		    System.out.println(n + " is a prime number!");
		}
		else
		{
		    System.out.println(n + " is not a prime number!");
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
