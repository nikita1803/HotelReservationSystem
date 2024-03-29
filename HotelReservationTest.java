package com.hotelreservationsystem;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest 
{
	/*
	 * Created a parameterized constructor of hotelReservation.
	 * UC-3 : added the weekend rates for the hotels 
	 * UC-5 : added ratings to each hotel
	 */
		HotelReservation hotelReservation = new HotelReservation();
	    Hotel lakewood = new Hotel("LakeWood", 110,90,3);
	    Hotel bridgewood = new Hotel("BridgeWood", 150,50,4);
	    Hotel ridgewood = new Hotel("RidgeWood", 220,150,5);

	    /*
	     * setup is a function through which i can add the value in the array list.
	     * by calling the addHotel function , adding the value in array list.
	     */
	    @Before
	    public void setUp() 
	    {
	    	HotelReservation hotelReservation = new HotelReservation();
	        hotelReservation.addHotel(lakewood);
	        hotelReservation.addHotel(bridgewood);
	        hotelReservation.addHotel(ridgewood);
	    }
	    
	    /*
	     *This test method is use to check , if the hotel is added the return true . 
	     */

	    @Test
	    public void givenHotel_ToAddInHotelReservation_ShouldReturnTrue() 
	    {
			Assert.assertTrue(HotelReservation.hotels.contains(lakewood));
	        Assert.assertTrue(HotelReservation.hotels.contains(bridgewood));
	        Assert.assertTrue(HotelReservation.hotels.contains(ridgewood));
	        HotelReservation.hotels.forEach(System.out::println);
	    }
	    
	    /*
	     * This method is used to check the cheapest hotel between the given data range .
	     */
	    @Test
	    public void givenDateRange_ShouldReturnCheapestHotel() {
	        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
	        LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
	        Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate);
	        Assert.assertEquals("LakeWood", cheapestHotel.name);
	    }
	    
	    /*
	     * This function is used to check the cheapest hotel along with weekend data set . 
	     */
	    @Test
	    public void givenDateRange_ShouldPrintCheapestHotelsForRegularCostomer() {
	        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
	        LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
	        hotelReservation.findCheapestRegularHotels(startDate, lastDate);
	    }

	    	 
}
