package org.petHospital.service;

import java.util.List;

import org.petHospital.model.Role;

/**
 * Created by Jimmy on 2017/3/11.
 */
public interface RoleService {
    Integer saveRole(Role role);

    List<Role> getAllRole();

//    Role getRole(String name);

    void deleteRole(Integer id);

    void updateRole(Role role);

}
