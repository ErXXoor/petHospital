package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.UserMapper;
import org.petHospital.model.User;
import org.petHospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveUser(User user) {
        try {
            return userMapper.insert(user);
        } catch (Exception e) {
            log.error("在saveUser出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<User> getAllUser(){
        try {
            List list = userMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllUser出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public User getUser(String name){
        try {
            return userMapper.getByName(name);
        } catch (Exception e) {
            log.error("在getUser出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteUser(Integer id){
        try {
        	userMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteUser出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateUser(User user){
        try {
        	userMapper.updateByPrimaryKey(user);
        } catch (Exception e) {
            log.error("在updateUser出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
