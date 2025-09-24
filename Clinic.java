// System för Kliniken
import java.util.ArrayList;

public class Clinic {
    // ArrayList to store all animals in the clinic
    private ArrayList<Animal> animals;
    
    // Constructor
    public Clinic() {
        animals = new ArrayList<>();
    }
    
    // Method to add an animal to the clinic
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("\n Animal added successfully to the clinic!");
    }
    
    // Linear search algorithm to find animal by pet name
    public Animal searchByPetName(String petName) {
        // Linear search through all animals
        for (int i = 0; i < animals.size(); i++) {
            Animal currentAnimal = animals.get(i);
            // Check if the current animal's name matches (case-insensitive)
            if (currentAnimal.getName().equalsIgnoreCase(petName)) {
                return currentAnimal; // Found the animal
            }
        }
        return null; // Animal not found
    }
    
    // Linear search algorithm to find animals by owner name
    public ArrayList<Animal> searchByOwnerName(String ownerName) {
        ArrayList<Animal> foundAnimals = new ArrayList<>();
        
        // Linear search through all animals
        for (int i = 0; i < animals.size(); i++) {
            Animal currentAnimal = animals.get(i);
            // Check if the current animal's owner matches (case-insensitive)
            if (currentAnimal.getOwnerName().equalsIgnoreCase(ownerName)) {
                foundAnimals.add(currentAnimal); // Add to results
            }
        }
        return foundAnimals; // Return all animals found (might be empty)
    }
    
    // Method to display all animals in the clinic
    public void displayAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("\nNo animals registered in the clinic yet.");
            return;
        }
        
        System.out.println("\n===== All Animals in Clinic =====");
        System.out.println("Total animals: " + animals.size());
        
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("\n--- Animal #" + (i + 1) + " ---");
            animals.get(i).displayInfo();
        }
    }
    
    // Method to get the number of animals in the clinic
    public int getAnimalCount() {
        return animals.size();
    }
}