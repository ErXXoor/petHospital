package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.RecordMapper;
import org.petHospital.model.Record;
import org.petHospital.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveRecord(Record record) {
        try {
            return recordMapper.insert(record);
        } catch (Exception e) {
            log.error("在saveRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Record> getAllRecord() {
        try {
            List list = recordMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

//    public Record getRecord(String name){
//        return recordRepository.getByName(name);
//    }

    public void deleteRecord(Integer id) {
        try {
        	recordMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateRecord(Record record) {
        try {
        	recordMapper.updateByPrimaryKey(record);
        } catch (Exception e) {
            log.error("在updateRecord出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
