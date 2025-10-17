/*Aboubacar D'Almeida
In class Exercise 6
CS 201, Dr. Li*/

import java.util.*;

public class Time {
	//data fields, every Time class has hour, minute, and second. This is encapsulation!
	public int hour;
	public int minute;
	public int second;

	//methods
	public void input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter hour: ");
		hour = keyboard.nextInt();
		System.out.print("Enter minute: ");
		minute = keyboard.nextInt();
		System.out.print("Enter seconds: ");
		second = keyboard.nextInt();
	}

	public void print() {
		System.out.println(hour + ":" + minute + ":" + second);
	}
}
