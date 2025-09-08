/*in class exercise 2 for CS201
Aboubacar D'Almeida
08-September-2025*/
import java.util.*;
public class Inclass2
{
	public static void main(String[] args) {
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = keyboard.nextInt();
		//Process
		boolean IsLeapYear = false;
		if(year % 4 == 0) {
		    IsLeapYear = true;
		    if(year % 100 == 0 && year % 400 !=0) {
		        IsLeapYear = false;
		    }
		} else {
		    IsLeapYear = false;
		}
        //output
        if(IsLeapYear == true)
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year");
	}
}
