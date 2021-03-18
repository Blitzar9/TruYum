package com.cognizant.truyum.util;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateUtil {
	
	public static Date convertToDate(String date) {
		Date d = null;
		try {
			d = new SimpleDateFormat("dd.MM.yyyy").parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return d;
	}

}
