/*Aboubacar D'Almeida
In class exercise 9, November 3 2025
Dr. Li*/
//Entity class

public class Dog extends Pet {
    //data fields
    private String breed;
    private boolean booster_shot;
    
    //methods
	//default constructor
	public Dog(){
	    super(); //grabs default constructors from parent class
	    breed = "None";
	    booster_shot = false;
	}
	
	//non default constructor
	public Dog(String name, int age, double weight, String breed, boolean booster_shot){
	    super(name,age,weight);
	    this.breed = breed;
	    this.booster_shot = booster_shot;
	}
	
	public void setBreed(String breed){
	    this.breed = breed;
	}
	
	public void setbooster_shot(boolean booster_shot){
	    this.booster_shot = booster_shot;
	}
	
	public String getBreed(){
	    return breed;
	}
	
	public boolean getbooster_shot(){
	    return booster_shot;
	}
	
	//Override
	public void writeOutput(){
	    super.writeOutput();
	    System.out.println("Breed: " + breed);
	    System.out.print("Booster Shot: " + booster_shot);
	}
}
