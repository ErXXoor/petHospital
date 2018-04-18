package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.RoleMapper;
import org.petHospital.model.Role;
import org.petHospital.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveRole(Role role) {
        try {
            return roleMapper.insert(role);
        } catch (Exception e) {
            log.error("在saveRole出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Role> getAllRole() {
        try {
            List list = roleMapper.findAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllRole出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

//    public Role getRole(String name){
//        return roleRepository.getByName(name);
//    }

    public void deleteRole(Integer id) {
        try {
        	roleMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteRole出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateRole(Role role) {
        try {
        	roleMapper.updateByPrimaryKey(role);
        } catch (Exception e) {
            log.error("在updateRole出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
