package org.petHospital.service;

import java.util.List;

import org.petHospital.model.Questions;
import org.petHospital.model.Test;

public interface TestService {
	Integer saveTest(Test test);
	List<Test> getAllTest();

	Test getTest(Integer id);

    void deleteTest(Integer id);

    void updateTest(Test test);
}
