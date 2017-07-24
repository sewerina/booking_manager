package com.sewerina.booking_manager;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Hotel> hotels = new ArrayList<>();

    public boolean addHotel(Hotel hotel) {
        hotels.add(hotel);
        return true;
    }

    public Iterable<Hotel> getHotels() {
        return hotels;
    }

}
