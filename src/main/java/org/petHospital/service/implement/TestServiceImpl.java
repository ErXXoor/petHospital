package org.petHospital.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.TestMapper;
import org.petHospital.model.Questions;
import org.petHospital.model.Test;
import org.petHospital.service.QuestionService;
import org.petHospital.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
    private TestMapper testRepository;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());
	@Override
	public Integer saveTest(Test test) {
		try {
            return testRepository.insert(test);
        } catch (Exception e) {
            log.error("在saveTest出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
	}

	@Override
	public List<Test> getAllTest() {
		try {
            List list = testRepository.selectAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllTest出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public Test getTest(Integer id) {
		try {
            return testRepository.selectByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在getTest出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public void deleteTest(Integer id) {
		 try {
			 testRepository.deleteByPrimaryKey(id);
	        } catch (Exception e) {
	            log.error("在deleteTest出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void updateTest(Test test) {
		 try {
			 testRepository.updateByPrimaryKey(test);
	        } catch (Exception e) {
	            log.error("在updateTest出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
		
	}


}
