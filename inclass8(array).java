/*Aboubacar D'Almeida
In class exercise 8
Dr. Li*/
import java.util.*;

public class inclass8
{
	public static void main(String[] args) {
	    //input
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter 10 integer number: ");
	    int [] numbers = new int[10];
	    int count = 0;
	    while(count < numbers.length)//capture the 10 integers
	    {
	        numbers[count] = keyboard.nextInt();
	        count++;
	    }
	    
	    //print the array
	    //for(int i = 0; i < numbers.length; i++)
	    //System.out.print(numbers[i] + " ");
	    
	    //process + output
	    System.out.println("The maximum value is: " + max(numbers));
	    System.out.print("The sorted numbers from smallest to biggest is: ");
	    int[] result = sort(numbers);
	    for(int i = 0; i < result.length; i++)
	        System.out.print(result[i] + " ");
	        
	    /*System.out.println("\nThe minimum value is: " + min(numbers));
	    System.out.print("The sorted numbers from biggest to smallest is: ");
	    int[] result_min = sort_1(numbers);
	    for(int i = 0; i < result_min.length; i++)
	        System.out.print(result_min[i] + " ");*/
	}
	
	public static int max(int[] a){ //linear search algorithm
	    int largest_so_far = Integer.MIN_VALUE;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] > largest_so_far)
	        largest_so_far = a[i]; //find new largest value, and update it into it
	    }
	    return largest_so_far;
	}
	
	public static int min(int[] a){
		int smallest_so_far = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++){
		    if(a[i] < smallest_so_far)
		    smallest_so_far = a[i];
	    }
	    
	   return smallest_so_far;
    }
    
    public static int[] sort(int[] a){ //sorting algorithm
        int[] result = new int[a.length]; //array result will hold the sorted array
        
        for(int k = 0; k < result.length; k++){ //used to fill each element in result
            //find the next smallest value
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for(int i = 0; i < a.length; i++){
		        if(a[i] < smallest) //found a new smallest value, update it
		        { 
		        smallest = a[i];
		        index = i; //to keep track of where the smallest value was found
		        }
            }
            //put it in result
            result[k] = smallest;
            a[index] = Integer.MAX_VALUE; //overwrite the number so it will not impact next rounf
        }
        return result;
    }
    
        /*public static int[] sort_1(int[] a){ //sorting algorithm
        int[] result_min = new int[a.length]; //array result will hold the sorted array
        
        for(int k = 0; k < result_min.length; k++){ //used to fill each element in result
            //find the next biggest value
            int biggest = Integer.MIN_VALUE;
            int index = 0;
            for(int i = 0; i < a.length; i++){
		        if(a[i] > biggest) //found a new biggest value, update it
		        { 
		        biggest = a[i];
		        index = i; //to keep track of where the biggest value was found
		        }
            }
            //put it in result
            result_min[k] = biggest;
            a[index] = Integer.MIN_VALUE; //overwrite the number so it will not impact next rounf
        }
        return result_min;
    }*/
}