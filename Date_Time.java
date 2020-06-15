/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {

	public static void main(String[] args) {
		// the current d 
	    LocalDate d = LocalDate.now(); 
	    System.out.println("Today's Date :  "+ d); 
	   
	    LocalTime t = LocalTime.now(); 
	    System.out.println("The time is :  "+ t); 
	       
	    LocalDateTime c = LocalDateTime.now(); 
	    System.out.println("The date and time is : "+ c); 
	   
	  
	    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
	    
	    String formatedDateTime = c.format(format);   
	     
	    System.out.println("In the formatted style "+ formatedDateTime); 
	   

	    Month mo = c.getMonth(); 
	    int day = c.getDayOfMonth(); 
	    int sec = c.getSecond(); 
	    System.out.println("Month : "+mo+" day : "+ day+" sec : "+sec); 
	   
	    // Will print the specific date
	    LocalDate dd = LocalDate.of(1947,8,15); 
	    System.out.println("Independence day of India :"+dd); 
	   
	    // Date along with time. 
	    LocalDateTime specificDate =  
	        c.withDayOfMonth(24).withYear(2016); 
	  
	    System.out.println("Particular Date" + " along with the time is "+specificDate); 

	}

}
