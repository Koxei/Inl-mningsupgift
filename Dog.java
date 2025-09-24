// Dog.java - Subclass of Animal
public class Dog extends Animal {
    // Unique fields for Dog
    private String breed;
    private String vaccineStatus;
    
    // Constructor
    public Dog(String name, int age, String ownerName, String healthStatus, 
               String breed, String vaccineStatus) {
        // Call superclass constructor
        super(name, age, ownerName, healthStatus);
        this.breed = breed;
        this.vaccineStatus = vaccineStatus;
    }
    
    // Getter methods for Dog-specific fields
    public String getBreed() {
        return breed;
    }
    
    public String getVaccineStatus() {
        return vaccineStatus;
    }
    
    // Setter methods for Dog-specific fields
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setVaccineStatus(String vaccineStatus) {
        this.vaccineStatus = vaccineStatus;
    }
    
    // Override displayInfo to include Dog-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo first
        System.out.println("Type: Dog");
        System.out.println("Breed: " + breed);
        System.out.println("Vaccine Status: " + vaccineStatus);
    }
}