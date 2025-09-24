public class Bird extends Animal {

    private String species;
    private boolean canFly;
    
    public Bird(String name, int age, String ownerName, String healthStatus, String species, boolean canFly) {
        super(name, age, ownerName, healthStatus);
        this.species = species;
        this.canFly = canFly;
    }
    
    // Getters
    public String getSpecies() {
        return species;
    }
    public boolean getCanFly() {
        return canFly;
    }
    
    // Setters
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bird");
        System.out.println("Species: " + species);
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}