package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.StaffMapper;
import org.petHospital.model.Staff;
import org.petHospital.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveStaff(Staff staff) {
        try {
            return staffMapper.insert(staff);
        } catch (Exception e) {
            log.error("在saveStaff出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Staff> getAllStaff() {
        try {
            List list = staffMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllStaff出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public Staff getStaff(String name) {
        try {
            return staffMapper.getByName(name);
        } catch (Exception e) {
            log.error("在getStaff出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteStaff(Integer id) {
        try {
        	staffMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteStaff出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateStaff(Staff staff) {
        try {
        	staffMapper.updateByPrimaryKey(staff);
        } catch (Exception e) {
            log.error("在updateStaff出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
