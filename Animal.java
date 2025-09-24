public class Animal {

    protected String name;
    protected int age;
    protected String ownerName;
    protected String healthStatus;
    
    public Animal(String name, int age, String ownerName, String healthStatus) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.healthStatus = healthStatus;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getHealthStatus() {
        return healthStatus;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    public void displayInfo() {
        System.out.println("\n--- Animal Information ---");
        System.out.println("Pet Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Health Status: " + healthStatus);
    }
}