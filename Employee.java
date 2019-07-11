
public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String SSN;
    private final Date birthDate;

    //constructor
    public Employee(String firstName, String lastName, String SSN, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.birthDate = birthDate;
    }
    
    //accessors and modifires
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s%nSSN: %s%nDOB:%s",
                getFirstName(),
                getLastName(),
                getSSN(),
                getBirthDate());
    }

    public abstract double earnings();
}
