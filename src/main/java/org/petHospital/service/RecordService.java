package org.petHospital.service;
import java.util.List;

import org.petHospital.model.Record;


public interface RecordService {
    Integer saveRecord(Record record);

    List<Record> getAllRecord();

//    Record getRecord(String name);

    void deleteRecord(Integer id);

    void updateRecord(Record record);

}
