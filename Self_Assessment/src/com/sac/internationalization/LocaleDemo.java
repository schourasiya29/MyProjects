package com.sac.internationalization;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry() + "...." + l.getLanguage());
		System.out.println(l.getDisplayCountry() + "..." + l.getDisplayLanguage());
		Locale l1 = new Locale("pa", "IN");
		Locale.setDefault(l1);
		System.out.println(Locale.getDefault().getDisplayCountry()+"...."+Locale.getDefault().getDisplayLanguage());
		
		String[] s =Locale.getISOLanguages();
		for (String s1: s){
			System.out.println(s1);
		}
		
		String[] s2 =Locale.getISOCountries();
		for (String s3: s2){
			System.out.println(s3);
		}
		
		Locale[] l2 =Locale.getAvailableLocales();
		
		for(Locale l3 :l2){
			System.out.println(l3.getDisplayCountry()+"..."+l3.getDisplayLanguage());
		}
	}

}
