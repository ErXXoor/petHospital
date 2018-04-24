package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.RoomMapper;
import org.petHospital.model.Room;
import org.petHospital.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveRoom(Room room) {
        try {
            return roomMapper.insert(room);
        } catch (Exception e) {
            log.error("在saveRoom出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Room> getAllRoom() {
        try {
            List list = roomMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllRoom出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public Room getRoom(String name) {
        try {
            return roomMapper.getByName(name);
        } catch (Exception e) {
            log.error("在getRoom出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteRoom(Integer id) {
        try {
        	roomMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteRoom出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateRoom(Room room) {
        try {
        	roomMapper.updateByPrimaryKey(room);
        } catch (Exception e) {
            log.error("在updateRoom出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
