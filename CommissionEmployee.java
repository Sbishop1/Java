/*
FileName:   CommissionEmployee.java
Section:    CSIS 212  D03 Spring 2019
Purpose:    calculate monthy pay for diffent types of employees
Citations:  class adopted from:
Deitel, P. J., & Deitel, H. M. (2014). Java how to program: Late objects. Boston, Mass.: Prentice Hall. 
*/



public class CommissionEmployee extends Employee {
    
    //instance varibles
    private double commissionRate;
    private double grossSales;
    
    //constructor 
    public CommissionEmployee(String firstName, String lastName,
        String SSN,Date birthDate, double commissionRate, double grossSales) {
        super(firstName, lastName, SSN, birthDate);
        
        //range validation
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                String.format("sales must be >= $%.2f", 0.0)
            );
        }
        //range validation
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                String.format(
                    "Commission rate must be > %.2f and < %.2f ", 0.0, 1.0)
            );
        }

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    //accessors and modifires
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                String.format(
                    "Commission rate must be > %.2f and < %.2f ", 0.0, 1.0)
            );
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                String.format("sales must be >= $%.2f", 0.0)
            );
        }
        this.grossSales = grossSales;
    }

    //instance methods
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }





    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %n%s: %.2f",
            "commission employee",
            super.toString(),
            "Gross sales",
            grossSales,
            "Commission rate",
            commissionRate
        );
    }





}