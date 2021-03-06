package com.rentaroom.room.service;

import com.rentaroom.room.repository.RoomRepository;
import com.rentaroom.room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void save(Room room) {
        roomRepository.save(room);
    }

    @Override
    public Room findByRoomAddress(String address) {
        return roomRepository.findByAddress(address);
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }
}
