package org.petHospital.service.implement;

import java.util.List;

import org.petHospital.mapper.UserMapper;
import org.petHospital.model.User;
import org.petHospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public Integer addUser(String id, String username, String password){
		return userMapper.insertUser(id, username, password);
	}
	
	public List<User> getAllUser(){
		return userMapper.findAllUser();
	}
	
	public Integer updateUser(String id, String password){
		return userMapper.updateById(id, password);
	}
	
	public int deleteUser(Integer id){
		return userMapper.deleteByPrimaryKey(id);
	}

}
