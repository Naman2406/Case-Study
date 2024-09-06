public class Person {
 
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    // Method to check voting eligibility
    public boolean isEligibleToVote() {
        return age >= 18;
    }
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Alice", 20);

        // Display person's details
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Check voting eligibility
        if (person.isEligibleToVote()) {
            System.out.println(person.getName() + " is eligible to vote.");
        } else {
            System.out.println(person.getName() + " is not eligible to vote.");
        }

        // Modify person's age using setter
        person.setAge(16);

        // Display updated details
        System.out.println("Updated Age: " + person.getAge());

        // Check voting eligibility again
        if (person.isEligibleToVote()) {
            System.out.println(person.getName() + " is eligible to vote.");
        } else {
            System.out.println(person.getName() + " is not eligible to vote.");
        }
    }
}
