package com.hotelreservationsystem;

public class Hotel 
{
	  public String name;
	  public int regularWeekDayRate;
	  public int regularWeekEndRate;
	  public int rating;
	public int totalRegularRate;
	  
	  /*
	   * Created a parameterize constructor of the class hotel .
	   */
	  public Hotel(String name, int regularWeekDayRate,int regularWeekEndRate,int rating) 
	  {
	        this.name = name;
	        this.regularWeekDayRate = regularWeekDayRate;
	        this.regularWeekEndRate = regularWeekEndRate;
	        this.rating = rating;
	        
	  }

	  @Override
	  public String toString() 
	  {
	        return "Hotel Name: " + name + " " + "\nRegularWeekDayRate: " + regularWeekDayRate + "\nRegularWeekEndRate: " + regularWeekEndRate + "\nRating: " + rating ;
	  }
}
