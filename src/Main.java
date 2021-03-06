import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        /* DateActivity
         * Prior to JDK 1.1, the class Date had two additional functions.
         * It allowed the interpretation of dates as
         * year, month, day, hour, minute, and second values.
         * It also allowed the formatting and parsing of date strings.
         * Unfortunately, the API for these functions was not amenable to internationalization.
         * As of JDK 1.1, the Calendar class should be used to convert between
         * dates and time fields and the DateFormat class should be used to format and parse date strings.
         * The corresponding methods in Date are deprecated.
         */

        //Date is just a wrapper around a long milliseconds since 1970-01-01
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};

        int year;
        //create a Gregorian calendar with a particular date
        //Year must be a four digit integer
        //Month is an integer from 0 to 11
        //Day must be an integer from 1 to 31
        GregorianCalendar gc = new GregorianCalendar(2010,2,15);
        System.out.println("Month:" + gc.get(Calendar.MONTH));
        //show the month from the array
        System.out.println("Month:" + months[gc.get(Calendar.MONTH)]);
        System.out.println("Day:" + gc.get(Calendar.DATE));
        System.out.println("Year:" + gc.get(Calendar.YEAR));

        //the day of the week is a numeric value from 1 to 7
        System.out.print("Day of Week: ");
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        //display the time (you have to set the time above first)
        //GregorianCalendar gc = new GregorianCalendar(2010,2,15,15,30,0);
        System.out.print("Time: ");
        System.out.print(gc.get(Calendar.HOUR)+":");
        System.out.print(gc.get(Calendar.MINUTE) + ":");
        System.out.println(gc.get(Calendar.SECOND));

        //How many days ago was the date?
        //get the milliseconds and convert to the number of days
        long DateInMS = gc.getTimeInMillis();
        //you can also get this from the Date class
        //The Gregorian Calendar .getTime method returns a date object
        //A date object is the number of milliseconds
        //since January 1, 1970
        //The Date class allocates a Date object and initializes it so that it
        //represents the time at which it was allocated, measured to the nearest millisecond.
        Date myDate = gc.getTime();
        myDate.getTime();

        //once you know the number of milliseconds you can convert them to the number of days
        long millisecondsPerDay = (24*60*60*1000);
        float numberOfDays = DateInMS/millisecondsPerDay;

        System.out.print("Number of Days: ");
        System.out.println(numberOfDays);


    }
}
