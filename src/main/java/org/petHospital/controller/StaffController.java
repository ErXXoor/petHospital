package org.petHospital.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.petHospital.model.Staff;
import org.petHospital.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    /**
     * 获得指定页码的人员信息
     *
     * @param page 人员申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/staff/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getStaff(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List staffs = staffService.getAllStaff();
        List<Staff> substaffs = null;
        int fromIndex = (pages - 1) * 10;
        int total = (staffs.size() - 1) / 10 + 1;
        if (staffs.size() >= fromIndex) {
            int toIndex = pages * 10;
            if (staffs.size() >= toIndex) {
                substaffs = staffs.subList(fromIndex, toIndex);
            } else {
                substaffs = staffs.subList(fromIndex, staffs.size());
            }
        }
        class templateInfo {
            Integer id;
            String staffName;
            String title;
            Integer roomId;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (Staff staff : substaffs) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.id = staff.getId();
            tempInfo.staffName = staff.getStaffName();
            tempInfo.title = staff.getTitle();
            tempInfo.roomId = staff.getRoomId();
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
     * 更新人员
     * @param staff 指定人员
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/staff",method = RequestMethod.PUT)
    @ResponseBody
    public String updateStaff(@RequestBody Staff staff){
        staffService.updateStaff(staff);
        return "{\"result\":true}";
    }

    /**
     * 增加人员
     * @param staff 指定人员
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/staff", method = RequestMethod.POST)
    @ResponseBody
    public String saveStaff(@RequestBody Staff staff) {
        staffService.saveStaff(staff);
        return "{\"result\":true}";
    }

    /**
     * 删除人员
     * @param staff 指定人员
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/staff",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStaff(@RequestBody Staff staff) {
        Integer id = staff.getId();
        staffService.deleteStaff(id);
        return "{\"result\":true}";
    }
}
