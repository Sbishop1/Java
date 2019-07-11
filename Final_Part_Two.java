/*
FileName:   Final_Part_Two.java
Section:    CSIS 212  D03 Spring 2019
Purpose:   show hours for a created business
Citations:  N/A
*/


import java.util.Scanner;

public class Final_Part_Two {

    public static void main(String[] args) {
        System.out.println("Steven Bishop - Final Part 2 Module 8 \n\n");

        //create new business, establish hours
        Business bigBiz = new Business(
            "Closed", //Sunday Hours
            "7:00 AM - 5:00 PM", //Monday Hours
            "7:00 AM - 3:00 PM", //Tuesday Hours
            "7:00 AM - 4:30 PM", //Wednesday Hours
            "8:00 AM - 7:00 PM", //Thursday Hours
            "6:00 AM - 4:00 PM", //Friday Hours
            "6:00 AM - 12:00 PM"); //Saturday Hours


        boolean programRunning = true;

        while (programRunning) {

            //display menu
            int userSelection = showMenu();

            // routes menu selection to appropriate method
            switch (userSelection) {
                case 1: displayDaysOnly();
                        break;
                case 2: displayHoursByDay(bigBiz);
                        break;
                case 3: displayAllDaysAllhours(bigBiz);
                        break;
                case 4: System.out.println("----------------------------");
                        System.out.printf("%25S%n", "Program is now exiting");
                        System.out.println("----------------------------");
                        programRunning = false;
                        break;
                default:System.out.printf("%27s%n", "**Not A valid menu Entry**");
            }

        }

    }

    public static int showMenu() {
        Scanner input = new Scanner(System.in);


        //menu
        System.out.println("----------------------------");
        System.out.printf("%17S%n", "menu");
        System.out.println("----------------------------");
        System.out.println("Display days only: 1");
        System.out.println("Display hours by day: 2");
        System.out.println("Display all days with hours: 3");
        System.out.println("Exit program: 4");
        System.out.print("User Selection: ");
        //System.out.println("\n-------------------------");

        //validate menu selection input
        try {
            return input.nextInt();
        } catch (Exception e) {
            return -1;
        }
    }

    public static void displayDaysOnly() {

        System.out.println("----------------------------");
        System.out.printf("%25S%n", "Displaying all Weekdays");
        System.out.println("----------------------------");
        for (Business.days eachDay: Business.days.values()) {
            System.out.println(eachDay);
        }
    }

    public static void displayHoursByDay(Business bigBiz) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.printf("%25S%n", "Displaying hours by day");
        System.out.println("----------------------------");
        System.out.print("Select a day to See hours: ");

        //validate that a real day was typed by user
        try {
            System.out.println(bigBiz.getHours(Business.getDay(input.next())));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void displayAllDaysAllhours(Business bigBiz) {

        System.out.println("----------------------------");
        System.out.printf("%25S%n", "Displaying weekly hours");
        System.out.println("----------------------------");
        for (Business.days eachDay: Business.days.values()) {
            System.out.println(bigBiz.getHours(eachDay));
        }
    }

}