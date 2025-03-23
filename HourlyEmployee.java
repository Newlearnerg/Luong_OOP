package Luong;

class HourlyEmployee extends Employee {
    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, int hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return (hours <= 40) ? (wage * hours) : (40 * wage + (hours - 40) * wage * 1.5);
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() + "\nHourly Wage: " + wage + ", Hours Worked: " + hours;
    }
}
