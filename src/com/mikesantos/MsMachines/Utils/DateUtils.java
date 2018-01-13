package com.mikesantos.MsMachines.Utils;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {
	
	public static Date addTimeInDate(Date date, int calendarType, int value){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendarType, value);
		return calendar.getTime();
	}
	
	public static Date getCurrentDate() {
		return new Date();
	}
	
	public static long getSecondsBetween2Dates(Date startDate, Date endDate) {
	    long diffInMillies = endDate.getTime() - startDate.getTime();
	    return TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
}
