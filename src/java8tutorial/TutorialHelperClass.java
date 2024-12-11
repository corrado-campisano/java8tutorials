package java8tutorial;


// not part of the original tutorial
// required by current tutorial code


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class TutorialHelperClass {

	static TimeZone zone = TimeZone.getDefault();
    static Locale locale = Locale.ITALIAN;
	
	static Calendar date = GregorianCalendar.getInstance(zone, locale);
	
	
	public static int getCurrentMonth() {
		int month = 0;
        
		// The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
        month = date.get(Calendar.MONTH)+1;
		
		return month;
	}

	public static int getCurrentYear() {
		int year = 0;
        
        year = date.get(Calendar.YEAR);
		
		return year;
	}
}
