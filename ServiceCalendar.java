package com.rts.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ServiceCalendar {

	public static void main(String[] args) throws ParseException {
		
	
		Calendar calendar = Calendar.getInstance();
		String startdate = "05/06/2024";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Date d = sdf.parse(startdate);
		calendar.setTime(d);
		int intervals = 12;
		System.out.println("Service dates for vehicle=");
		for(int i=0;i<intervals;i++) {
			calendar.add(Calendar.DAY_OF_MONTH,30);
			Date serviceDate = calendar.getTime();
			System.out.println(sdf.format(serviceDate));
			
		}
	}	
}

	