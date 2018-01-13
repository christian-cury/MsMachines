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
	
	public static String convertSecondsToString(int seconds) {
		String hours = twoDigitString(seconds / 3600);
		String minutes = twoDigitString(seconds % 3600 / 60);
		String secs = twoDigitString(seconds % 60);
		String Final = "";
		if (!hours.equals("00")) Final += hours + "h ";
		if (!minutes.equals("00")) Final += minutes + "m ";
		Final += secs + "s";
		return Final;
	}
	
	private static String twoDigitString(int number) {
		if (number <= 0) {
			return "00";
		}
		if (number / 10 == 0) {
			return "0" + String.valueOf(number);
		}
		return String.valueOf(number);
	}
}
