
public class BasePlusCommissionEmployee extends CommissionEmployee {

    //instance varibles
    private double baseSalary;

    //constructor
    public BasePlusCommissionEmployee(
        String firstName, String lastName, String SSN,Date birthDate,double baseSalary,double commissionRate, double grossSales) {
        super(firstName, lastName, SSN,birthDate, commissionRate, grossSales);
        
        //range validation
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                String.format("salary must be >= $%.2f", 0.0)
            );
        }
        this.baseSalary = baseSalary;
    }

    //accessors and modifires
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                String.format("salary must be >= $%.2f", 0.0)
            );
        }
        this.baseSalary = baseSalary;
    }
    
    //instance methods
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format(
            "%s: %s%n%s:  %.2f",
            "Base-Salaried",
            super.toString(),
            "Base Salary", getBaseSalary()
        );
    }
}
