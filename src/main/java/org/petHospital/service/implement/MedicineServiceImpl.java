package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.MedicineMapper;
import org.petHospital.model.Medicine;
import org.petHospital.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveMedicine(Medicine medicine) {
        try {
            return medicineMapper.insert(medicine);
        } catch (Exception e) {
            log.error("在saveMedicine出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Medicine> getAllMedicine() {
        try {
            List list = medicineMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllMedicine出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public Medicine getMedicine(String name) {
        try {
            return medicineMapper.getByName(name);
        } catch (Exception e) {
            log.error("在getMedicine出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteMedicine(Integer id) {
        try {
        	medicineMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteMedicine出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateMedicine(Medicine medicine) {
        try {
        	medicineMapper.updateByPrimaryKey(medicine);
        } catch (Exception e) {
            log.error("在updateMedicine出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}