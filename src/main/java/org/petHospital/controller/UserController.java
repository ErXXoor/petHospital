package org.petHospital.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.petHospital.mapper.UserMapper;
import org.petHospital.model.UserEntity;
import org.petHospital.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private QueryService queryService;
//	private UserMapper userMapper;
//	  @RequestMapping(value="/index")
//	    public String index() {
//	        return "index";
//	    }

    @RequestMapping(value="/getUser")
    //@ResponseBody
    public UserEntity getUser(String id) {
      UserEntity user=queryService.getOne(id);
    		//UserEntity user=userMapper.getOne(id);
    		return user;
    }
     
    
}