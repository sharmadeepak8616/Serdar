package Class2.DateJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTopic {
    public static void main(String[] args) {


        Date now = new Date();
        System.out.println(now);

        // format Date object
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy, hh:mm:ss:SS a z");
        System.out.println(df.format(now));

        /**
         * Current Date -> 5 -> "d" -> 5
         * Current Date -> 10 -> "d" -> 10
         *
         * Current Date -> 5 -> "dd" -> 05
         * Current Date -> 10 -> "dd" -> 10
         *
         */

        /**
         * MMMM - Full Month Name
         * MMM - Month abbreviation
         * MM - Month in number
         *
         * EEEE - Full name of the day
         * EEE - Day name abbreviation
         */

        /**
         * if the current date is 15 or less, print "first half"
         * else print "second half"
         */
        SimpleDateFormat df1 = new SimpleDateFormat("d");
        String date = df1.format(now);
        int dateInt = Integer.valueOf(date);
        if (dateInt <= 15) {
            System.out.println("First half");
        } else {
            System.out.println("Second half");
        }

        /*
            Convert String into Date
                OR
            Create Date object using String value
         */
        String myDate = "October 5 2020, 16.10.00";
        SimpleDateFormat df2 = new SimpleDateFormat("MMMM d yyyy, HH.mm.ss");
        try {
            Date date1 = df2.parse(myDate);
            System.out.println("Converted date: " + date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date datObj = null;
        String articleDate = "Mar 31, 2020";
        SimpleDateFormat df3 = new SimpleDateFormat("MMM dd, yyyy");
        try {
            datObj = df3.parse(articleDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(datObj);
        // verify if date is from the past (datObj came before than present)
        Date currentDate = new Date();

        System.out.println("Current date appears after dateObj in calendar:" + currentDate.after(datObj));
            // after method --> currentDate comes after the datObj
        System.out.println("Current date appears before dateObj in calendar:" + currentDate.before(datObj));
        // after method --> currentDate comes before the datObj
        System.out.println("Current date equals to dateObj in calendar:" + currentDate.equals(datObj));
        // after method --> currentDate equal to the datObj

    }
}
