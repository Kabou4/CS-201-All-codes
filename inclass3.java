/*In class exercuse 3 for CS201
Aboubacar D'Almeida
15 September 2025*/

public class inclass3
{
	public static void main(String[] args) {
		//input (no input here)
		//process + output
		System.out.println("Celsius" + "\t" + "Fahrenheit");
		int celsius = 0; //couter is the same as celsius value, therefore it is not needed here.
		for(; celsius <=20; celsius++){
		    double fahrenheit = (1.8) * celsius + 32;
		    System.out.printf("%d\t%.1f \n", celsius, fahrenheit);//%d is integer number, %.1f is flloating number
	    }
	}
}
