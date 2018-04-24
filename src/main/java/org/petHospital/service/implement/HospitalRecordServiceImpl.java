package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.HospitalRecordMapper;
import org.petHospital.model.HospitalRecord;
import org.petHospital.service.HospitalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalRecordServiceImpl implements HospitalRecordService {

    @Autowired
    private HospitalRecordMapper hospitalRecordRepository;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveHospitalRecord(HospitalRecord hospitalRecord) {
        try {
            return hospitalRecordRepository.insert(hospitalRecord);
        } catch (Exception e) {
            log.error("在saveHospitalRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<HospitalRecord> getAllHospitalRecord() {
        try {
            List list = hospitalRecordRepository.selectAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllHospitalRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

//    public HospitalRecord getHospitalRecord(String name){
//        return hospitalRecordRepository.getByName(name);
//    }

    public void deleteHospitalRecord(Integer id) {
        try {
            hospitalRecordRepository.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteHospitalRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateHospitalRecord(HospitalRecord hospitalRecord) {
        try {
            hospitalRecordRepository.updateByPrimaryKey(hospitalRecord);
        } catch (Exception e) {
            log.error("在updateHospitalRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
