/*
FileName:   business.java
Section:    CSIS 212  D03 Spring 2019
Purpose:   show hours for a created business
Citations:  N/A
*/



public class Business {


    public static enum days {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    };

    //instance array
    private final String[] hours;

    //constructor
    public Business(String sunday, String monday, String tuesday,
        String wednesday, String thursday, String friday, String saturday) {

        this.hours = new String[] {
            sunday,
            monday,
            tuesday,
            wednesday,
            thursday,
            friday,
            saturday
        };
    }

    //returns hours for a requested day
    public String getHours(days day) {
        switch (day) {
            case Sunday:    return String.format("%s Hours: %15s",
                                days.Sunday.toString(), hours[0]);
            case Monday:    return String.format("%s Hours: %20s",
                                days.Monday.toString(), hours[1]);
            case Tuesday:   return String.format("%s Hours: %19s",
                                days.Tuesday.toString(), hours[2]);
            case Wednesday: return String.format("%s Hours: %17s",
                                days.Wednesday.toString(), hours[3]);
            case Thursday:  return String.format("%s Hours: %18s",
                                days.Thursday.toString(), hours[4]);
            case Friday:    return String.format("%s Hours: %20s",
                                days.Friday.toString(), hours[5]);
            case Saturday:  return String.format("%s Hours: %19s",
                                days.Saturday.toString(), hours[6]);
            default:        return null;
        }
    }

    /*
    method getDay is a static methed that is used to 
    convert a user's String input to a day object when they
    inquire about a particular day's hours. their string input
    needs to be converted prior to calling getHours, which takes a
    day object as an argument. 
    */
    public static days getDay(String dayString) {

        days setDay = null; //triggor for throwing exeption

        //returns a day object that matches users input
        for (Business.days day: Business.days.values()) {
            if (day.toString().toLowerCase().equals(dayString.toLowerCase())) {
                setDay = day;
            }
        }
        //will throw an exeption if days is not assigned a new value
        if (setDay == null) {
            throw new IllegalArgumentException(
                String.format("%27s", "**Entry not a valid day**"));
        }
        return setDay;
    }
}