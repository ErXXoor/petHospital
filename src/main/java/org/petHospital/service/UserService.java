package org.petHospital.service;

import java.util.List;

import org.petHospital.model.User;

public interface UserService {
	Integer addUser(String id, String username, String password);
	List<User> getAllUser();
	Integer updateUser(String id, String password);
	int deleteUser(Integer id);
}
