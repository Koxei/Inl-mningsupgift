import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinic clinic = new Clinic();
        
        System.out.println("===================================");
        System.out.println("      Welcome to the Clinic");
        System.out.println("===================================");
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getIntInput(scanner, "Enter your choice: ");
            
            switch (choice) {
                case 1:
                    addNewAnimal(scanner, clinic);
                    break;
                case 2:
                    searchByPetName(scanner, clinic);
                    break;
                case 3:
                    searchByOwnerName(scanner, clinic);
                    break;
                case 4:
                    clinic.displayAllAnimals();
                    break;
                case 5:
                    running = false;
                    System.out.println("\nThank you for using Animal Clinic System!");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Add New Animal");
        System.out.println("2. Search Animal by Pet Name");
        System.out.println("3. Search Animals by Owner Name");
        System.out.println("4. Display All Animals");
        System.out.println("5. Exit");
        System.out.println("====================");
    }
    
    private static void addNewAnimal(Scanner sc, Clinic clinic) {
        System.out.println("\n===== ADD NEW ANIMAL =====");
        System.out.println("Select animal type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        
        int animalType = getIntInput(sc, "Enter choice (1-3): ");
        
        sc.nextLine(); 
        System.out.print("Enter pet name: ");
        String name = sc.nextLine();
        
        int age = getIntInput(sc, "Enter age (in years): ");
        sc.nextLine(); 
        
        System.out.print("Enter owner name: ");
        String ownerName = sc.nextLine();
        
        System.out.print("Enter health status (e.g., Healthy, Sick, Under Treatment): ");
        String healthStatus = sc.nextLine();
        
        switch (animalType) {
            case 1: // Dog
                System.out.print("Enter breed: ");
                String breed = sc.nextLine();
                
                System.out.print("Enter vaccine status (e.g., Up-to-date, Pending): ");
                String vaccineStatus = sc.nextLine();
                
                Dog dog = new Dog(name, age, ownerName, healthStatus, breed, vaccineStatus);
                clinic.addAnimal(dog);
                break;
                
            case 2: // Cat
                System.out.print("Is it Indoor or Outdoor? ");
                String indoorOrOutdoor = sc.nextLine();
                
                Cat cat = new Cat(name, age, ownerName, healthStatus, indoorOrOutdoor);
                clinic.addAnimal(cat);
                break;
                
            case 3: // Bird
                System.out.print("Enter species: ");
                String species = sc.nextLine();
                
                System.out.print("Can it fly? (yes/no): ");
                String flyInput = sc.nextLine();
                boolean canFly = flyInput.equalsIgnoreCase("yes");
                
                Bird bird = new Bird(name, age, ownerName, healthStatus, species, canFly);
                clinic.addAnimal(bird);
                break;
                
            default:
                System.out.println("\nInvalid animal type!");
        }
    }
    
    private static void searchByPetName(Scanner sc, Clinic clinic) {
        System.out.println("\n===== SEARCH BY PET NAME =====");
        sc.nextLine(); 
        System.out.print("Enter pet name to search: ");
        String petName = sc.nextLine();
        
        Animal foundAnimal = clinic.searchByPetName(petName);
        
        if (foundAnimal != null) {
            System.out.println("\nAnimal found!");
            foundAnimal.displayInfo();
        } else {
            System.out.println("\nNo animal found with name: " + petName);
        }
    }
    
    
    private static void searchByOwnerName(Scanner sc, Clinic clinic) {
        System.out.println("\n===== SEARCH BY OWNER NAME =====");
        sc.nextLine(); 
        System.out.print("Enter owner name to search: ");
        String ownerName = sc.nextLine();
        
        ArrayList<Animal> foundAnimals = clinic.searchByOwnerName(ownerName);
        
        if (!foundAnimals.isEmpty()) {
            System.out.println("\nFound " + foundAnimals.size() + " animal(s) for owner: " + ownerName);
            
            for (int i = 0; i < foundAnimals.size(); i++) {
                System.out.println("\n--- Pet #" + (i + 1) + " ---");
                foundAnimals.get(i).displayInfo();
            }
        } else {
            System.out.println("\nNo animals found for owner: " + ownerName);
        }
    }
    
    // Try/Catch metod ifall man skriver in fel på .nextInt()
    private static int getIntInput(Scanner sc, String prompt) {
        while (true) { // Loopa tills vi får giltig Integer
            System.out.print(prompt);
            try {
                int input = sc.nextInt(); 
                return input; 
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                sc.next(); 
            }
        }
    }
}


