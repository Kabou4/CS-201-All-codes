/*in class exercise 1 for CS201
Aboubacar D'Almeida
29-August-2025*/

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Celsius temperature: ");
        double celsius = keyboard.nextDouble();
        //process
        double fahrenheit = 32 + celsius * 9 / 5; //because celsius is a floating number so answer will be floating
        //output
        System.out.printf("%.2f Celsius is %.2f fahrenheit", celsius, fahrenheit);
        //closing of program
        keyboard.close();
    }
}