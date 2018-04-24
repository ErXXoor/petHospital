package org.petHospital.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.model.Examination;
import org.petHospital.model.Questions;
import org.petHospital.model.Test;
import org.petHospital.service.QuestionService;
import org.petHospital.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestController {
	@Autowired
	  private TestService testService;
	@Autowired
	private QuestionService questionService;
	private final Log log = LogFactory.getLog(getClass());
	  @RequestMapping(value = "admin/test/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
	  @ResponseBody
	  public String getTest(@PathVariable String page){
		  //Integer id = test.getId();
		  class templateInfo{
			  Integer id;
			  String content;
			  String option;
			  String answer;
		  }
				Test test = testService.getTest(1);
				//String aString = test.getQuestionId();
				//System.out.println(aString);
			String questionslist = test.getQuestionId();
			String temp[] = questionslist.split(",");
			int questionNumber[] = new int[temp.length];
			for(int i=0;i<temp.length;i++){
				questionNumber[i]= Integer.parseInt(temp[i]);
			}
			List<Questions> paper = new ArrayList();
			for(int i=0;i<questionNumber.length;i++){
				paper.add(questionService.getQuestions(questionNumber[i])) ;
			}
			List<templateInfo> result = new ArrayList<templateInfo>();
		  for(Questions questions : paper){
			  templateInfo tempInfo = new templateInfo();//必须放在循环内
			  tempInfo.id = questions.getId();
			  tempInfo.content = questions.getContent();
			  tempInfo.option = questions.getOption();
			  tempInfo.answer = questions.getAnswer();
			  result.add(tempInfo);
		  }
			
		  
		  
		  String json = null;
		  ObjectMapper objectMapper = new ObjectMapper();
	      objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
	      try {
	          json = objectMapper.writeValueAsString(result);
	      } catch (JsonProcessingException e) {
	          e.printStackTrace();
	      }
	      return "{\"data\":" + json +"}";
	  }
	
	
	
	
}
