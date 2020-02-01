package com.av;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3 {
	public static void main(String[] args) {
		DateFormat us=DateFormat.getDateTimeInstance(0,0, Locale.UK);
		System.out.println("US style is:: "+us.format(new Date()));
	}

}
