/*Programming 2 for CS201
Aboubacar D'Almeida
12-September-2025*/

import java.util.*;

public class assignment2 {
    public static void main(String[] args) {
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of package(s): ");
		int packages = keyboard.nextInt();
		double discount = 0.00;
		double amount = 99.00;
		//Process
		if(packages >= 100) {
		    discount = 0.40;
	}   else if(packages >= 50){
	        discount = 0.30;
	}   else if(packages >= 20){
	        discount = 0.20;
	}
	    else if(packages >= 10){
	        discount = 0.10;
	}   else{
	        discount = 0;
	}
	double og_price = amount * packages;
	double off_amount = og_price * discount;
	double new_price = og_price - off_amount;
	//output
	System.out.printf("Discount amout is %.2f\n", off_amount);
	System.out.printf("Total amount after discount is %.2f", new_price);
}
}
