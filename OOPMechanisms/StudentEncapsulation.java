package OOPMechanisms;

// Encapsulation is a programming principle that involves bundling data (attributes) and methods (functions) 
// that operate on that data into a single unit (class), while controlling access to the data through well-defined interfaces.

public class Student {
    
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) { // Constructor
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return ("Student name is " + this.getName() + ", age is " + this.getAge() + ", address is " + this.getAddress());
    }
}
