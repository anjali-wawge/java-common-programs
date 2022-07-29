package com.dateprograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringToDateFormatter {
	public static void main(String[] args) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date="16/09/2022";
		//convert String to LocalDate
		LocalDate localDate=LocalDate.parse(date, formatter);
		System.out.println(localDate);
		
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date1="2022-09-16";
		LocalDate localDate2=LocalDate.parse(date1, formatter2);
		System.out.println(localDate2);
		
		DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yyyy MMM dd");
		String date2="2022 Mar 12";
		LocalDate localDate3=LocalDate.parse(date2, formatter3);
		System.out.println(localDate3);
		System.out.println(formatter3.format(localDate3));
		
		DateTimeFormatter formatter4=DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		String date3="Tue,Aug 16 2022";
		LocalDate localDate4=LocalDate.parse(date3, formatter4);
		System.out.println(formatter4.format(localDate4));
		
		DateTimeFormatter formatter5=DateTimeFormatter.ofPattern("EEEE,MMM dd yyyy");
		String date4="Tuesday,Aug 16 2022";
		LocalDate localDate5=LocalDate.parse(date4, formatter5);
		System.out.println(formatter5.format(localDate5));
		
		DateTimeFormatter formatter6=DateTimeFormatter.ofPattern("EEEE,yyyy MMM, dd hh:mm:ss a",Locale.US);
		String date5="Tuesday,2022 Aug, 16 11:10:55 PM";
		LocalDateTime localDate6=LocalDateTime.parse(date5, formatter6);
		System.out.println(formatter6.format(localDate6));
		
		
	}
}
