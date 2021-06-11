package com.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelReservation 
{
	/*
	 * Created a array list name as hotels.
	 */
	public static List<Hotel> hotels = new ArrayList<>();
	Map<String, Integer> minRateInRegular = new HashMap<>();
	 Hotel result1;
	
	/*
	 * Created a method addHotel to add the hotels in the array list.
	 */
	public void addHotel(Hotel  hotel) 
	{
		 hotels.add(hotel);
	}
	
	/*
	 * Created a method to get the cheapest hotel according to the start date and last date .
	 * ChronoUnit is used to calculate the days between start and last date .
	 * Comparator is used to compare the regular rate of the hotels and then stored in the collection.
	 */
	public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate) 
	{
	    long daysBetween = ChronoUnit.DAYS.between(startDate, lastDate);
	    int cheapRate;
	    Hotel cheapest = Collections.min(hotels, Comparator.comparing(hotel -> hotel.regularWeekDayRate));
	    cheapRate = (int) ((daysBetween + 1) * cheapest.regularWeekDayRate);
	    System.out.println("Cheapest Hotel Name: " + cheapest.name + "\nTotal Rate: " + cheapRate);
	    return cheapest;
	}
	
	/*
	 *weekEndData is a method through which calculate the cheapest hotel for weekends also. 
	 *dateList is use to store the date in the form of list
	 *traverse the datelist using advance for loop.
	 *day of week is use to calculate the day at that particular date.
	 */
	 public void weekEndData(LocalDate startDate, LocalDate lastDate) 
	 {
	     List<LocalDate> dateList = startDate.datesUntil(lastDate).collect(Collectors.toList());
	     dateList.add(lastDate);

	     for (LocalDate localDate : dateList) 
	     {
	         DayOfWeek dayOfWeek2 = DayOfWeek.from(localDate);
	         if (dayOfWeek2.equals(DayOfWeek.SATURDAY) || dayOfWeek2.equals(DayOfWeek.SUNDAY)) 
	         {
	             for (Hotel hotel : hotels) 
	             {
	                  hotel.totalRegularRate += hotel.regularWeekEndRate;
	             }
	         } 
	         else 
	         {
	            for (Hotel hotel : hotels) 
	            {
	                hotel.totalRegularRate += hotel.regularWeekDayRate;
	            }
	         }
	     }
	        result1 = hotels.get(0);
	        for (Hotel hotel : hotels) 
	        {
	            if (result1.totalRegularRate > hotel.totalRegularRate) 
	            {
	                result1 = hotel;
	                minRateInRegular.put(hotel.name, hotel.totalRegularRate);
	            }
	        }
	        minRateInRegular.put(result1.name, result1.totalRegularRate);
	        for (Hotel hotel : hotels) 
	        {
	            if (hotel.totalRegularRate == result1.totalRegularRate) 
	            {
	                minRateInRegular.put(hotel.name, hotel.totalRegularRate);  
	            }
	        }    
	    }

	 /*
	  * this function is use to find the cheapest hotel.
	  */
	    public void findCheapestRegularHotels(LocalDate startDate, LocalDate lastDate) 
	    {
	        weekEndData(startDate, lastDate);
	        System.out.println("Min Rate Hotels");
	        minRateInRegular.forEach((key, value) -> System.out.println("Hotel Name: " + key + "\nTotal Rate: " + value));
	    }
}
