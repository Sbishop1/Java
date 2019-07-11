
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Date{
    //class variable that returns the current month. 
    public static int currentMonth = new GregorianCalendar().get(Calendar.MONTH) +1 ;
    
    //instance variables
    private int month; 
    private int day;
    private int year;
    
    //represents the number of days in each month
    private static final int[] DAYS_PER_MONTH = {
    0,
    31,//jan
    28,//feb
    31,//mar
    30,//apr
    31,//may
    30,//jun
    31,//jul
    31,//aug
    30,//sep
    31,//oct
    30,//nov
    31//dec   
    };

    //constructor
    public Date(int month, int day, int year) {
        //month validation
        if(month <= 0 || month >12){
            throw new IllegalArgumentException(
                    String.format("month must be between 1-12")
            );
        }
        // day validation 
       if (day <= 0 ||(day > DAYS_PER_MONTH[month] 
             && !(month == 2 && day == 29))){
                throw new IllegalArgumentException(
                "day (" + day +") out-of-range for "
                        + "the specified month and year");
        }
        //day validation considering leep year
       if (month == 2 && day == 29 && !(year % 400 == 0 ||
	(year % 4 == 0 && year % 100 != 0))){
                throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");
       }
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    //accessors and modifiers 
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
         if(month <= 0 || month > 12){
            throw new IllegalArgumentException(
                    String.format("month must be between 1-12")
            );
         }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
         if (day <= 0 ||(day > DAYS_PER_MONTH[month] 
             && !(month == 2 && day == 29))){
                throw new IllegalArgumentException(
                "day (" + day +") out-of-range for "
                        + "the specified month and year");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //instance methods
    @Override
    public String toString() {
        return String.format("%d/%d/%d",getMonth(),getDay(),getYear());
    }
}
