package org.petHospital.service.implement;

import java.util.List;

import org.petHospital.mapper.UserMapper;
import org.petHospital.model.User;
import org.petHospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public Integer addUser(int id, String username, String password, int usertype){
		return userMapper.insertUser(id, username, password, usertype);
	}
	
	public List<User> findAllUser(){
		return userMapper.findAllUser();
	}
	
	public Integer updateUser(String id, String password){
		return userMapper.updateById(id, password);
	}
	
	public int deleteUser(Integer id){
		return userMapper.deleteByPrimaryKey(id);
	}
	
	public List<User> findUserByNameAndPassword(String username, String password){
		return userMapper.findUserByNameAndPassword(username, password);
	}
	
	public Boolean checkUsername(String username){
		List<User>list =  userMapper.selectByUsername(username);
		if(list.size()>0){
			return true;
		} else{
			return false;
		}
	}

}
