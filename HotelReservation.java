package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation 
{
	/*
	 * Created a array list name as hotels.
	 */
	public static List<Hotel> hotels = new ArrayList<>();
	/*
	 * Created a method addHotel to add the hotels in the array list.
	 */
	public void addHotel(Hotel  hotel) 
	{
		 hotels.add(hotel);
	}
}
