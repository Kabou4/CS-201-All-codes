/*Aboubacar D'Almeida
CS 201, Dr. Li
29 October 2025*/
import java.util.*;

public class Triangle {
    //data field
	private double side1;
	private double side2;
	private double side3;
	
	//methods
	//default constructor
	public Triangle(){
	    side1 = 0;
	    side2 = 0;
	    side3 = 0;
	}

	//non default constructor
	public Triangle(double side1, double side2, double side3){
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	}
	
	public void input(){
	    Scanner keyboard = new Scanner(System.in);
	    boolean isTriangle = false;
	    
	    while(!isTriangle){
	    System.out.print("Enter side 1: ");
	    side1 = keyboard.nextDouble();
	    System.out.print("Enter side 2: ");
	    side2 = keyboard.nextDouble();
	    System.out.print("Enter side 3: ");
	    side3 = keyboard.nextDouble();
	    
	    if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
	        isTriangle = true;
	    } else{
	        System.out.println("Invalid triangle, enter dimensions again!");
	        }
	    }
	}
	//perimeter method
	public double perimeter(){
	    return side1 + side2 + side3;
	}
	
	//check if equilateral
	public boolean isEquilateral(){
	   if(side1 == side2 && side2 == side3){
	        return true;
	   } else{
	        return false;
	   }
	}
	
	//area method
	
	public double area(){
	    
	    double semi = perimeter() / 2;
	    return Math.sqrt(semi*((semi - side1)*(semi - side2)*(semi - side3)));
	}
		
	public void output(){
	    System.out.println("The three sides that you entered are: " + side1 + " " + side2 + " and " + side3);
	    
	    System.out.println("The perimeter of the triangle is: " + perimeter());
	    
	    if(isEquilateral())
	        System.out.println("This triangle IS equilateral");
	    else
	        System.out.println("This triangle IS NOT equilateral");
	    System.out.printf("The area of the triangle is: %.2f%n", area());
	}
}
