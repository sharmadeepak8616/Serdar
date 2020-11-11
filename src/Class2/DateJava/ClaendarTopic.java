package Class2.DateJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaendarTopic {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        // getTime -> convert cal into the Date obj
        Date date = cal.getTime();
        System.out.println(date);

        // Add-subtract days/month etc
        cal.add(Calendar.DATE, 5);
        cal.add(Calendar.MONTH, -2);

        System.out.println(cal.getTime());  // Sept 15


        Date datObj = null;
        String articleDate = "Mar 31, 2020";
        SimpleDateFormat df3 = new SimpleDateFormat("MMM dd, yyyy");
        try {
            datObj = df3.parse(articleDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("datObj: " + datObj);

        // setTime() - Create Calendar instance using Date object
        cal.setTime(datObj);

        System.out.println(cal.getTime());



    }
}
