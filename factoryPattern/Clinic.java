package factoryPattern;
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
       
        //Loop starts
        boolean looper = true;
        while(looper) {
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number or exit: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");
                break;
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                break;
            // Case for terminating
            case 3:
                looper = false;
                System.out.println("System terminated. Thank you"); 
                break;  
        }
        // Allow to display if not terminated
        if(looper) {
        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
            // Display dog breed
            if(choice == 1) {
                System.out.println("The dog's breed is: " + ((Dog) petFile.getPet()).getBreed());
            }
            // Display cat's no. of lives
            else if(choice == 2) {
                System.out.println("The cat's number of lives is: " + ((Cat) petFile.getPet()).getNoOfLives());
            }
            else {}   
            } 
        }  
        input.close();   
    }
}
