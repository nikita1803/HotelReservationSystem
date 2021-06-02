package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome on Hotel Reservation System");
		
	}
	
	public static List<Hotel> hotel = new ArrayList<>();

	public boolean addHotel(String Name , int regularWeekDayRate)
	{
		Hotel hotel = new Hotel(Name , regularWeekDayRate);
		return true;
	}
}
