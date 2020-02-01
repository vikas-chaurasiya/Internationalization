package com.av;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
	public static void main(String[] args) {
		double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY form is::"+nf.format(d));
		
	}

}
