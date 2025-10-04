/*Programming 5 CS201
Aboubacar D'Almeida
03 October 2025*/
import java.util.*;

public class programming5
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = keyboard.nextDouble();
		
		System.out.print("Enter annual interest rate (e.g., 9 for 9%): ");
		double annualInterestRate = keyboard.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 100 / 12;
		System.out.println("Years" + "\t" + "Future Value");
		int years = 1;
		for(; years <=30; years++){
		    double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);//investment value
		    System.out.printf("%d\t%.2f \n", years, futureValue);//%d is integer number, %.2f is floating number
	    }
	}
	
	//1 method to calculate the future investment value
	public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years){
	    return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
