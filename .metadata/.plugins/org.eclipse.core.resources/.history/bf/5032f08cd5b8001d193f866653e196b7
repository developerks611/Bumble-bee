package com.web.bumble.bee.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Convertor {
	
 public LocalDate covertdate(String date_input) throws ParseException {
	 
	 	
	    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy");
	    LocalDate date=LocalDate.parse(date_input,formatter);
		return date;
}
 
 public String coverttostring(LocalDate date) {
	 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy");
	 String date_bday=date.format(formatter);
	 return date_bday;
	 
	 
 }
	
}
