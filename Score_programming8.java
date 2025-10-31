/*Aboubacar D'Almeida
CS 201, Dr. Li
10-31-25*/
import java.util.*;

public class programming8
{
	public static void main(String[] args) 
	{
		System.out.print("This program is designed to get a number of scores, analyze them and determine the average of each score, the highest score, and how far from the average the score is!\n");
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of scores: ");
		int i = keyboard.nextInt();
		double [] scores = new double[i];
		double max_score = 0;
		double Total = 0;
		for(int count = 0; count < scores.length; count++)
		{
		    System.out.print("Enter score " + (count + 1) + ": ");
		    scores[count] = keyboard.nextDouble();
		    if(scores[count] > max_score)
		        max_score = scores[count];
		    Total += scores[count];
		}    
	    double Average = (Total / i);
	    
	    //output
	    System.out.printf("%nThe average score is %.2f%n", Average);
	    System.out.printf("The highest score is %.0f%n%n", max_score);
	    
	    for(int count = 0; count < i; count++){
	        double difference = scores[count] - Average;
	        
	        if(difference > 0){
	            System.out.printf("%.2f is above average by %.2f%n", scores[count], difference);
            } else if(difference < 0) {
                System.out.printf("%.2f is below average by %.2f%n", scores[count], Math.abs(difference));
            } else {
                System.out.printf("%.2f is equal to the average!%n", scores[count]);
            }
        }
    }
}