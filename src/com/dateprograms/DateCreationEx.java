package com.dateprograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateCreationEx {

	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate);

		LocalDate date1 = currentDate.toLocalDate();
		System.out.println("date1 : " + date1);

		Month month = currentDate.getMonth();
		int day = currentDate.getDayOfYear();
		int hour = currentDate.getHour();
		System.out.println(month + " ," + day + "," + hour);

		LocalDateTime currentDate2 = currentDate.withDayOfMonth(14).withYear(2022);
		System.out.println(currentDate2);

		LocalTime time = LocalTime.of(7, 35);
		System.out.println(time);
		
		LocalDate date=LocalDate.of(2022, 9, 12);
		System.out.println(date);

		
	}
}
