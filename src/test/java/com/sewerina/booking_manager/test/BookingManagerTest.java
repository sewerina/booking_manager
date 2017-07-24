package com.sewerina.booking_manager.test;

import com.sewerina.booking_manager.BookingManager;
import com.sewerina.booking_manager.Hotel;
import org.junit.Assert;
import org.junit.Test;

public class BookingManagerTest {

    @Test
    public void testAddHotel() {
        BookingManager bm = new BookingManager();
        boolean res = bm.addHotel(TestHelper.createTestHotel());
        Assert.assertTrue(res);
    }

    @Test
    public void testGetHotel() {
        BookingManager bm = new BookingManager();
        bm.addHotel(TestHelper.createTestHotel());
        Iterable<Hotel> hotels = bm.getHotels();
        Assert.assertNotNull(hotels);
        Assert.assertTrue(hotels.iterator().hasNext());
    }



}
