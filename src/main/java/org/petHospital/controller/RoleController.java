package org.petHospital.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;

import org.petHospital.model.Role;
import org.petHospital.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 获得指定页码的角色信息
     *
     * @param page 角色申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/role/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getRole(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List roles = roleService.getAllRole();
        List<Role> subroles = null;
        int total = (roles.size()-1)/10+1;
        int fromIndex = (pages - 1) * 10;
        if (roles.size() >= fromIndex) {
            int toIndex = pages * 10;
            if (roles.size() >= toIndex) {
                subroles = roles.subList(fromIndex, toIndex);
            } else {
                subroles = roles.subList(fromIndex, roles.size());
            }
        }
        class templateInfo {
            Integer id;
            List <Integer> roomAccess= new ArrayList<Integer>();
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (Role role : subroles) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.id = role.getId();


            String [] arr_roomAccess = role.getRoomAccess().split(" ");
            for(String temp :arr_roomAccess){
                tempInfo.roomAccess.add(Integer.valueOf(temp));
            }
            result.add(tempInfo);
        }
        String json = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            json = objectMapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"data\":" + json + ",\"pages\":" + total + "}";
    }



    /**
     * 更新角色
     * @param role 指定角色
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/role",method = RequestMethod.PUT)
    @ResponseBody
    public String updateRole(@RequestBody Role role){
        roleService.updateRole(role);
        return "{\"result\":true}";
    }

    /**
     * 增加角色
     * @param role 指定角色
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/role", method = RequestMethod.POST)
    @ResponseBody
    public String saveRole(@RequestBody Role role) {
        roleService.saveRole(role);
        return "{\"result\":true}";
    }

    /**
     * 删除角色
     * @param role 指定角色
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/role",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteRole(@RequestBody Role role) {
        Integer id = role.getId();
        roleService.deleteRole(id);
        return "{\"result\":true}";
    }
}
