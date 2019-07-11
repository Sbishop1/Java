


public class TestEmployee {

    public static void main(String[] args) {
        System.out.println("Steven Bishop - Assignment_8.1 Module 7 \n\n");

        /*
        ************constructor needs*************
        Employee: firstName,lastName,SSN,DOB
        Salaried Employee: weeklySalary
        Hourly Employee: wage, hours
        Commission Employee: commissionRate,grossSales
        Base plus Commission: Employee: Salary,commissionRate,grossSales
        */



        //create employee types, add to employee collection array


        try {
            Employee employeeCollection[] = {
                new SalariedEmployee(
                    "Grant", //first Name
                    "Fowler", // last name
                    "205-84-6335", //SSN
                    new Date(7, 26, 1998), //DOB
                    1442.30), //weekly salary

                new HourlyEmployee(
                    "Carla", //first Name
                    "Byrd", // last name
                    "510-38-4354", //SSN
                    new Date(5, 2, 1976), //DOB
                    23.5, //wage
                    45.0), //hours

                new CommissionEmployee(
                    "Don", //first Name
                    "Scott", // last name
                    "217-80-4771", //SSN
                    new Date(12, 25, 1981), //DOB
                    0.06, //commission Rate
                    25000), //gross sales

                new BasePlusCommissionEmployee(
                    "Becky", //first Name
                    "Vargas", // last name
                    "431-64-4890", //SSN
                    new Date(7, 13, 1988), //DOB
                    950.50, //weekly salary
                    0.04, //commission Rate
                    15000), //gross sales
            };

            //display the employee's monthly payout
            for (Employee employee: employeeCollection) {
                displayMonthlyEarnings(employee);
            }


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    static void displayMonthlyEarnings(Employee employee) {

        double bonus = 100;
        //weekly earnings * 52 weeks / 12 months = monthy payout
        double monthlyEarnings = employee.earnings() * 52 / 12;

        // determins and displays if employee earns a birthday bonus.
        //displays monthly payout accordingly
        System.out.print(
            (employee.getBirthDate().getMonth() == Date.currentMonth) ?
            String.format(
                "%s %nBirthday Bonus: $%.2f%n" +
                "Monthly Earnings: $%,.2f%n",
                employee,
                bonus,
                monthlyEarnings + bonus) :
            String.format(
                "%s %nMonthly Earnings: $%,.2f%n",
                employee,
                monthlyEarnings));
        System.out.println("***************************\n");

    }


}