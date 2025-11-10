public class exercise9{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.writeOutput();
        
        d1.setName("Koda");
        d1.setAge(12);
        d1.setWeight(25.5);
        d1.setBreed("Schnauzer");
        d1.setbooster_shot(true);
        
        d1.writeOutput();
        
        Dog d2 = new Dog("Penny", 1, 8.0 ,"Golden Retriever", true);
        d2.writeOutput();
        
        System.out.println("Breed: " + d2.getBreed());
        System.out.println("Booster Shot: " + d2.getbooster_shot());
    }
}
