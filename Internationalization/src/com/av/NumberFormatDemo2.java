package com.av;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo2 {
	public static void main(String[] args) {
		double d=123456.789;
		Locale india=new Locale("pa","IN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(india);
		System.out.println("India form is::"+nf.format(d));
		System.out.println("................................");
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US form is::"+nf1.format(d));
		System.out.println("................................");
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK form is::"+nf2.format(d));
		
		
	}

}
