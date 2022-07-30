package com.dateprograms;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToInstant {
public static void main(String[] args) {
	String date="2022-08-12T15:23:01z";
	Instant instant=Instant.parse(date);
	System.out.println("Instant : "+instant);
	
	//gate date time only
	LocalDateTime localDateTime=LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
	//local date
	System.out.println("Local Date : "+localDateTime.toLocalDate());
	
	//get date time plus time zone
	ZonedDateTime zoneDateTime=instant.atZone(ZoneId.of("Asia/Tokyo"));
	System.out.println(zoneDateTime);
	
	
	String date1 = "2016-08-16T10:15:30+08:00";
    ZonedDateTime result = ZonedDateTime.parse(date1, DateTimeFormatter.ISO_DATE_TIME);
    System.out.println("ZonedDateTime : " + result);
    System.out.println("TimeZone : " + result.getZone());
    LocalDate localDate = result.toLocalDate();
    System.out.println("LocalDate : " + localDate);
    
   }
}
