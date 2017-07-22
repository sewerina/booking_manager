package com.sewerina.booking_manager.test;

import com.sewerina.booking_manager.BookingManager;
import com.sewerina.booking_manager.Hotel;
import org.junit.Assert;
import org.junit.Test;

public class BookingManagerTest {

    @Test
    public void testConstructor() {
        BookingManager bm = new BookingManager();

    }

    @Test
    public void testAddHotel() {
        BookingManager bm = new BookingManager();
        boolean res = bm.addHotel(new Hotel());
        Assert.assertTrue(res);
    }

}
