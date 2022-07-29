package com.dateprograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	}
}
