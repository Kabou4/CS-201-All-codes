/*In class exercise 4 for CS201
Aboubacar D'Almeida
17 September 2025*/
import java.util.*;
public class inclass4
{
	public static void main(String[] args) {
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter dimensions of triangle: ");
		int size = keyboard.nextInt();
		
		//Process + output
		for(int i = 0; i < size; i++)
		{
		    for(int j = 0; j < 2 * i + 1; j++) //size decides how many * will be printed
		        System.out.print("*");
        System.out.println();
		}
	}
}
