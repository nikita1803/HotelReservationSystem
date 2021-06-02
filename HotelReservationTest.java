package com.hotelreservationsystem;

//import com.hotelreservationsystem.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest 
{
	HotelReservation hotelReservation = new HotelReservation();
    @Test
    public void whenNewHotelIsAdded_ShouldReturnTrue()
    {
    	boolean add1 =hotelReservation.addHotel("LakeWood", 110);
    	boolean add2 =hotelReservation.addHotel("BridgeWood", 160);
    	boolean add3 =hotelReservation.addHotel("RidgeWood", 110);
    	Assert.assertEquals(true, add1);
    	Assert.assertEquals(true, add2);
    	Assert.assertEquals(true, add3);
    }
}
