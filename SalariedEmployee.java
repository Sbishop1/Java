


public class SalariedEmployee extends Employee {
    
    //instance variables
    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstName,String lastName, 
            String SSN,Date birthDate, double weeklySalary) { super(firstName, lastName, SSN, birthDate);
        
        //range validation
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
                String.format("Weekly salary must be >= %.2f", 0.0));
        }        
        this.weeklySalary = weeklySalary;
    }

    //accessors and modifires
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
               String.format("Weekly salary must be >= %.2f", 0.0));
        }
        this.weeklySalary = weeklySalary;
    }

    //instance methods
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
            super.toString(), "weekly salary", getWeeklySalary()
        );
    }





}