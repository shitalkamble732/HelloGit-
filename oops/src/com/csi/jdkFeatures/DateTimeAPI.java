package com.csi.jdkFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;

public class DateTimeAPI {
	public static void main(String[] args) {
		
		System.out.println("\n Before JDK 1.8 the current date is : "+new Date());
		
		System.out.println("\n In JDK 1.8  the current Date is : "+LocalDate.now());
		
		System.out.println("\n In JDK 1.8  the current Date with Time is : "+LocalDateTime.now());

		System.out.println("\n In JDK 1.8  the current time is : "+LocalTime.now());
		
		Year year = Year.now();  
	    System.out.println("\n Year : "+year);
	    
	    

	}

}
