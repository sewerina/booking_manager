package com.sewerina.booking_manager;

import com.sewerina.booking_manager.exceptions.AppException;

import java.util.ArrayList;

public class Hotel {

    final private Iterable<Room> rooms;

    public Hotel(Iterable<Room> rooms) throws AppException {
        if (rooms == null) {
            throw new AppException();
        }
        this.rooms = rooms;
    }

    public Iterable<Room> getRooms() {
        return rooms;
    }

}
