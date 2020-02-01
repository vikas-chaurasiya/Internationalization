package com.av;

import java.util.Locale;

public class LocaleDemo1 {
	public static void main(String[] args) {
		Locale l1=Locale.getDefault();
		System.out.println(l1.getCountry()+"......"+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+"......"+l1.getDisplayLanguage());
		System.out.println("....................................");
		Locale l2=new Locale("pa","IN");
		Locale.setDefault(l2);
		System.out.println(Locale.getDefault().getDisplayLanguage());
		System.out.println("....................................");
		String[] s3=Locale.getISOLanguages();
		for(String s4:s3) 
		{
			System.out.println(s4);
		}
		System.out.println("....................................");
		String [] s5=Locale.getISOCountries();
		for(String s6:s5) 
		{
			System.out.println(s6);
		}
		System.out.println("....................................");
		Locale[] l=Locale.getAvailableLocales();
		for(Locale ll:l) 
		{
			System.out.println(ll.getDisplayCountry()+"......"+ll.getDisplayLanguage());
		}
	}

}
