package Luong;

abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return firstName + " " + lastName + "\nSocial Security Number: " + ssn;
    }
}