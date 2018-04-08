package org.petHospital.service;

import java.util.List;

import org.petHospital.model.User;

public interface UserService {
	Integer addUser(int id, String username, String password, int usertype);
	List<User> findAllUser();
	Integer updateUser(String id, String password);
	int deleteUser(Integer id);
	List<User> findUserByNameAndPassword(String username, String password);
	Boolean checkUsername(String username);
}
