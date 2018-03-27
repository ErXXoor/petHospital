package org.petHospital.service.implement;

import org.petHospital.mapper.UserMapper;
import org.petHospital.model.User;
import org.petHospital.model.UserEntity;
import org.petHospital.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryServiceImp implements QueryService{
	@Autowired
	private UserMapper userMapper;
	
	public User getOne(String id) {
		// TODO Auto-generated method stub
		int temp = Integer.parseInt(id);
		return userMapper.selectByPrimaryKey(temp);
	}
	
}
