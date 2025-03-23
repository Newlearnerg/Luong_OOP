package Luong;

public class KiemThuEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("John", "Doe", "111-11-1111", 800.00),
            new HourlyEmployee("Jane", "Smith", "222-22-2222", 16.75, 42),
            new CommissionEmployee("Jim", "Brown", "333-33-3333", 5000, 0.06),
            new BasePlusCommissionEmployee("Jake", "White", "444-44-4444", 3000, 0.04, 1000),
            new SalariedEmployee("Parky", "Cali", "30-04-1975", 900.00)
        };
        
        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("Earnings: " + e.earnings());
            System.out.println("-------------------------");
        }
    }
}
