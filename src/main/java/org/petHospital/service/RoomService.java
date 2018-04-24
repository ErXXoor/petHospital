package org.petHospital.service;


import java.util.List;

import org.petHospital.model.Room;


public interface RoomService {
    Integer saveRoom(Room room);

    List<Room> getAllRoom();

    Room getRoom(String name);

    void deleteRoom(Integer id);

    void updateRoom(Room room);

}
