/*
In class exercise 5 CS 201
Aboubacar D'Almeida
24-26 September 2025
*/
import java.util.*;

public class inclass5
{
	public static void main(String[] args) {
		instruction();
		while(true){
		    int choice = menu();
		    if(choice == 1 || choice == 2){
		        draw_shape(choice);
		    }
		    else{
		        System.out.println("Exiting program, goodbye!");
		        System.exit(0);
		    }
		    }
	}
	
	//1 - writing the instruction method
	public static void instruction(){
	    System.out.println("This program is designed to draw a diamond or triangle based on user input to determine the size and using a specific character on the keyboard!");
	}
	
	//2 - writing the menu method
	public static int menu(){
	    
	    //print the char based menu
	    System.out.println("Here are all the otions: \n 1) Triangle\n 2) Diamond\n 3) Quit!");
	    
	    //capture the user input
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Chose one of the options: ");
	    int choice = keyboard.nextInt();
	    
	    //input validation
	    while(choice != 1 && choice != 2 && choice != 3){
	        System.out.println("Invalid input!");
	        System.out.print("Enter a valid option: ");
	        choice = keyboard.nextInt();
	    }
	    //return choice
	    return choice;
	    }
    
    //3 - writing the draw_shape method
    public static void draw_shape(int choice){
        //get size
        int size = get_size();
        //get char
        char c = get_char();
        //draw shape
        if(choice == 1){
            System.out.println("Drawing a triangle");
            draw_triangle(size,c);
        }
        else{
            System.out.println("Drawing a diamond");
            draw_diamond(size,c);
        }
    }
    
    //4 - writing get_size method
    public static int get_size(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the desired size: ");
        int size = keyboard.nextInt();
        return size;
    }
    
    //5 - writing the get_char method
    public static char get_char(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the desired char: ");
        char c = keyboard.next().charAt(0);
        return c;
    }
    
    //6 - writing the draw_triangle method
    public static void draw_triangle(int size, char c){
        for(int i = 0; i < size; i++)//print the row number of the triangle
		{
		    for(int k = size - i - 1; k > 0; k--){//padding spaces to shift the traingle into an isoceles triangle from right triangle
		        System.out.print(" ");
		    }        
		    for(int j = 0; j < 2 * i + 1; j++){ //size decides how many * will be printed in each row
		        System.out.print(c);
		    }
            System.out.println();
        }
    }
    
    
    //7 - writing the draw_diamond method
    public static void draw_diamond(int size, char c){
        draw_triangle(size, c);
        draw_bottom(size, c);
    }
    
    //8 - writing the draw_bottom method
    public static void draw_bottom(int size, char c){
        for(int i = 0; i < size; i++)//print the row number of the triangle
		{
		    for(int k = 0; k < i + 1; k++){//padding spaces to shift the upside traingle into an isoceles triangle from right triangle
		        System.out.print(" ");
		    }        
		    for(int j = 0; j < 2 * (size - i - 1) - 1; j++){ //size decides how many * will be printed in each row
		        System.out.print(c);
		    }
            System.out.println();
        }
    }
}


