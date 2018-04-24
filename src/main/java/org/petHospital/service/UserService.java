package org.petHospital.service;

import java.util.List;

import org.petHospital.model.User;


public interface UserService {
    Integer saveUser(User user);

    List<User> getAllUser();

    User getUser(String name);

    void deleteUser(Integer id);

    void updateUser(User user);

}
