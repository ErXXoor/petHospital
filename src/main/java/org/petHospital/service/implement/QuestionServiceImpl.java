package org.petHospital.service.implement;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.QuestionsMapper;
import org.petHospital.model.Questions;
import org.petHospital.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionsMapper questionsRepository;
	
	private final Log log = LogFactory.getLog(getClass());
	@Override
	public Integer saveQuestions(Questions questions) {
		try {
            return questionsRepository.insert(questions);
        } catch (Exception e) {
            log.error("在saveQuestions出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
	}

	@Override
	public List<Questions> getAllQuestions() {
		try {
            List list = questionsRepository.selectAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllQuestions出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public Questions getQuestions(Integer id) {
		try {
            return questionsRepository.selectByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在getQuestions出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public void deleteQuestions(Integer id) {
		try {
			questionsRepository.deleteByPrimaryKey(id);
	        } catch (Exception e) {
	            log.error("在deleteQuestions出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void updateQuestions(Questions questions) {
		try {
			questionsRepository.updateByPrimaryKey(questions);
	        } catch (Exception e) {
	            log.error("在updateQuestions出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
		
	}

}
