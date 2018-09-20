package us.jsadi.dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

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

        // these result in warnings about deprecation, but the result is correct
        int years = today.getYear() - joshuaDate.getYear();
        int months = today.getMonth() - joshuaDate.getMonth();
        int days = today.getDate() - joshuaDate.getDate();
        System.out.println("Joshua Tree was released " + years + " years, " + months + " months, and " + days + " days ago");
    }
}