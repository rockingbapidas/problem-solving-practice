package oops;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeFinder {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        return simpleDateformat.format(cal.getTime()).toUpperCase();
    }
}
