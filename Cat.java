// Cat.java - Subclass of Animal
public class Cat extends Animal {
    // Unique field for Cat
    private String indoorOrOutdoor;
    
    // Constructor
    public Cat(String name, int age, String ownerName, String healthStatus, 
               String indoorOrOutdoor) {
        // Call superclass constructor
        super(name, age, ownerName, healthStatus);
        this.indoorOrOutdoor = indoorOrOutdoor;
    }
    
    // Getter method for Cat-specific field
    public String getIndoorOrOutdoor() {return indoorOrOutdoor;}
    
    // Setter method for Cat-specific field
    public void setIndoorOrOutdoor(String indoorOrOutdoor) {
        this.indoorOrOutdoor = indoorOrOutdoor;
    }
    
    // Override displayInfo to include Cat-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo first
        System.out.println("Type: Cat");
        System.out.println("Living Environment: " + indoorOrOutdoor);
    }
}