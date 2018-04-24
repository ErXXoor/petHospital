package org.petHospital.service;

import java.util.List;

import org.petHospital.model.HospitalRecord;

public interface HospitalRecordService {
	  Integer saveHospitalRecord(HospitalRecord hospitalRecord);

	    List<HospitalRecord> getAllHospitalRecord();

//	    HospitalRecord getHospitalRecord(String name);

	    void deleteHospitalRecord(Integer id);

	    void updateHospitalRecord(HospitalRecord hospitalRecord);
}
