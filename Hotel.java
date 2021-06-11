package com.hotelreservationsystem;

public class Hotel 
{
	  public String name;
	  public int regularWeekDayRate;
	  public int regularWeekEndRate;
	  
	  /*
	   * Created a parameterize constructor of the class hotel .
	   */
	  public Hotel(String name, int regularWeekDayRate,int regularWeekEndRate) 
	  {
	        this.name = name;
	        this.regularWeekDayRate = regularWeekDayRate;
	        this.regularWeekEndRate = regularWeekEndRate;
	        
	  }

	  @Override
	  public String toString() 
	  {
	        return "Hotel Name: " + name + " " + "\nRegularWeekDayRate: " + regularWeekDayRate + "\nRegularWeekEndRate: " + regularWeekEndRate ;
	  }
}
