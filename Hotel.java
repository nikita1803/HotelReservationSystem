package com.hotelreservationsystem;

public class Hotel 
{
	  public String name;
	  public int regularWeekDayRate;
	  
	  /*
	   * Created a parameterize constructor of the class hotel .
	   */
	  public Hotel(String name, int regularWeekDayRate) 
	  {
	        this.name = name;
	        this.regularWeekDayRate = regularWeekDayRate;
	        
	  }

	  @Override
	  public String toString() 
	  {
	        return "Hotel Name: " + name + " " + "\nRegularWeekDayRate: " + regularWeekDayRate ;
	  }
}
