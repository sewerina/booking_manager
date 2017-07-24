package com.sewerina.booking_manager.test;

import com.sewerina.booking_manager.Hotel;
import com.sewerina.booking_manager.Room;
import com.sewerina.booking_manager.exceptions.AppException;

import java.util.ArrayList;

public class TestHelper {
    static Hotel createTestHotel(){
        try {
            ArrayList<Room> rooms = new ArrayList<>();
            rooms.add(new Room());
            return new Hotel(rooms);
        } catch (AppException e){
            return null;
        }
    }
}
