package org.petHospital.service.implement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.petHospital.mapper.TestMapper;
import org.petHospital.model.Test;
import org.petHospital.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService{
	@Autowired
	private TestMapper testMapper;
	
	public List<Test> getAllTest(){
		return testMapper.findAllTest();
	}
	
	public int updateTime(String startTime, String endTime, int id){
		return testMapper.updateTimeById(startTime, endTime, id);
	}
	
	public int addTest(String testName, String startTime, String endTime, int paperId){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		
		Test record = new Test();
		record.setName(testName);
		record.setPaperId(paperId);
		try{
		Date s_time = format.parse(startTime);
		record.setStartTime(s_time);
		Date e_time = format.parse(endTime);
		record.setEndTime(e_time);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return testMapper.insert(record);
	}
	
	public int deleteTest(int id){
		return testMapper.deleteByPrimaryKey(id);
	}

}
