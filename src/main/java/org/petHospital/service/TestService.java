package org.petHospital.service;

import java.util.List;

import org.petHospital.model.Test;
import org.springframework.web.bind.annotation.RequestParam;

public interface TestService {
	List<Test> getAllTest();
	
	/**
	 * 修改考试时间
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	int updateTime(String startTime, String endTime, int id);
	
	int addTest(String testName, String startTime, String endTime, int paperId);
	
	int deleteTest(int id);
	
}
