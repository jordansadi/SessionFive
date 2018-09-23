package us.jsadi.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * This is the driver class for this package.
 * It creates Dates for the releases of the two U2 albums and the current date.
 * It uses the Dates to calculate the time between the two U2 albuns and the date a new one would be released.
 * It then creates Calendars from today's date and the Joshua Tree release date, and uses the Calendars to calculate
 * the years, months, and says since Joshua Tree was released.
 * Created by jsadi on 9/19/2018
 * @author Jordan Sadi
 * @version 2018 0919 .3
 */
public class Main {
    public static void main(String[] args) {
        Date joshuaDate = new GregorianCalendar(1987, 2, 9).getTime();
        Date rattleDate = new GregorianCalendar(1988, 9, 10).getTime();
        Date today = new Date();
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        String dateOut;

        long betweenAlbums = rattleDate.getTime() - joshuaDate.getTime();
        Date releaseDate = new Date(today.getTime() + betweenAlbums);
        dateOut = dateFormatter.format(releaseDate);
        System.out.println("U2s next album would be released on " + dateOut);

        Calendar joshCal = Calendar.getInstance(), todayCal = Calendar.getInstance();
        joshCal.setTime(joshuaDate);
        todayCal.setTime(today);
        int years = todayCal.get(Calendar.YEAR) - joshCal.get(Calendar.YEAR);
        int months = todayCal.get(Calendar.MONTH) - joshCal.get(Calendar.MONTH);
        int days = todayCal.get(Calendar.DATE) - joshCal.get(Calendar.DATE);
        System.out.println("Joshua Tree was released " + years + " years, " + months + " months, and " + days + " days ago");
    }
}