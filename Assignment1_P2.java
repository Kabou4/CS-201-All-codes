/* Assignment 1 Part 2 CS201
Aboubacar D'Almeida
05-September-2025 */

import java.util.*;
public class Assignment1_P2 {
    public static void main(String[] args) {
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the male student number: ");
        int male = keyboard.nextInt();
        System.out.print("Enter the female student number: ");
        int female = keyboard.nextInt();
        //Process
        double male_percent = ((double)male / (male + female)) * 100; //calculates male percentage, because the percentage is to be a floating number, one of the numbers must be a floating number
        double female_percent = ((double)female / (male + female)) * 100; //calculates female percentage, same reason as the male percentage
        //output
        System.out.printf("Male student percentage is %.2f%% \n", male_percent); //\n is used to create a new line after the male percentage is created
        System.out.printf("Female student percentage is %.2f%%", female_percent);
        //close of program
        keyboard.close();
        
    }
}