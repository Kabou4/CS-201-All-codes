/*Aboubacar D'Almeida
In class Exercise 6
CS 201, Dr. Li*/

import java.util.*;

public class Time {
	//data fields, every Time class has hour, minute, and second. This is encapsulation!
	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;
	public int second;

	//methods
	public void input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter year: ");
		year = keyboard.nextInt();
		System.out.print("Enter month: ");
		month = keyboard.nextInt();
		while(month > 12 || month < 0){
	        System.out.println("This is an invalid entry for month, try again!");
	        System.out.print("Enter month: ");
	        month = keyboard.nextInt();
		}
		System.out.print("Enter day: ");
		day = keyboard.nextInt();
		System.out.print("Enter hour: ");
		hour = keyboard.nextInt();
		while(hour > 23 || hour < 0){
	        System.out.println("This is an invalid entry for hour, try again!");
	        System.out.print("Enter hour: ");
	        hour = keyboard.nextInt();
		}
		System.out.print("Enter minute: ");
		minute = keyboard.nextInt();
		while(minute > 59 || minute < 0){
	        System.out.println("This is an invalid entry for minute, try again!");
	        System.out.print("Enter minute: ");
	        minute = keyboard.nextInt();
		}
		System.out.print("Enter seconds: ");
		second = keyboard.nextInt();
		while(second > 59 || second < 0){
	        System.out.println("This is an invalid entry for second, try again!");
	        System.out.print("Enter second: ");
	        second = keyboard.nextInt();
		}
    }
	public void PrintStandardTime() {
		String ampm = "AM";
		int sHour = hour;
		if(hour == 12){
		    ampm = "PM";
		}
		else if(hour == 0){
		    sHour = 12;
		}
		else if(hour > 12){
		   ampm = "PM";
		   sHour = hour - 12;
		}
		System.out.println("Based on your entry, the Standard time is " + month + "-" + day + "-" + year + ", " + sHour + ":" + minute + ":" + second + " " + ampm + ".");
	}
	
	public void PrintMilitaryTime() {
		System.out.println("Based on your entry, the Military time is " + day + "-" + month + "-" + year + ", " + hour + ":" + minute + ":" + second + ".");
	}
}