package com.sewerina.booking_manager.test;

import com.sewerina.booking_manager.Hotel;
import com.sewerina.booking_manager.Room;
import org.junit.Assert;
import org.junit.Test;

public class HotelTest {

    @Test
    public void testConstructor() {
        try {
            new Hotel(null);
            Assert.fail();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGetRooms() {
        Hotel hotel = TestHelper.createTestHotel();
        Iterable<Room> rooms = hotel.getRooms();
        Assert.assertNotNull(rooms);
        Assert.assertTrue(rooms.iterator().hasNext());
    }

}
