


public class HourlyEmployee extends Employee {
    //instance variables
    private double wage;
    private double hours;

    //constuctor
    public HourlyEmployee( String firstName,
        String lastName, String SSN, Date birthDate,
        double wage, double hours) { super(firstName, lastName, SSN,birthDate);
        
        //range validation
        if (wage <= 0.0) {
            throw new IllegalArgumentException(
                String.format("Wage must be >= %.2f", 0.0));
        }
        if (hours < 0.0) {
            throw new IllegalArgumentException(
                String.format("hours must be > %.2f", 0.0));
        }
        this.wage = wage;
        this.hours = hours;
    }
    //accessors and modifiers
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage <= 0.0) {
            throw new IllegalArgumentException(
                String.format("Wage must be >= %.2f", 0.0));
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0) {
            throw new IllegalArgumentException(
                String.format("hours must be > %.2f", 0.0));
        }
        this.hours = hours;
    }

    //instance methods
    @Override
    public double earnings() {

         //returns wage, accounts for overtime if applicalble
        return (getHours() <= 40) ? getWage() * getHours():
               40 * getWage() + (getHours() - 40) * getWage() * 1.5;     
    }
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f%n%s: %,.2f",
            super.toString(),
            "Hourly wage",
            getWage(),
            "Hours worked",
            getHours());
    }

}