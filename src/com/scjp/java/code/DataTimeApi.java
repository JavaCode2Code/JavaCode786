package com.scjp.java.code;

/*How will you get the current date and time using Java 8 Date and Time API?
 * */

public class DataTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Current local date "+java.time.LocalDate.now());
System.out.println("Current local time "+java.time.LocalTime.now());
System.out.println("Currnet Local dateTime "+java.time.LocalDateTime.now());
	}

}
