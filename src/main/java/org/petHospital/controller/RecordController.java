package org.petHospital.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.petHospital.model.Record;
import org.petHospital.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;

    /**
     * 获得指定页码的档案信息
     *
     * @param page 档案申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/record/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getRecord(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List records = recordService.getAllRecord();
        List<Record> subrecords = null;
        int fromIndex = (pages - 1) * 10;
        int total = (records.size()-1)/10+1;
        if (records.size() >= fromIndex) {
            int toIndex = pages * 10;
            if (records.size() >= toIndex) {
                subrecords = records.subList(fromIndex, toIndex);
            } else {
                subrecords = records.subList(fromIndex, records.size());
            }
        }
        class templateInfo {
            Integer id;
            Date time;
            String patient;
            String petType;
            String description;
            Float price;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (Record record : subrecords) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.id = record.getId();
            tempInfo.time = record.getTime();
            tempInfo.patient = record.getPatient();
            tempInfo.petType = record.getPetType();
            tempInfo.description = record.getDescription();
            tempInfo.price = record.getPrice();
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
     * 增加档案
     * @param record 指定档案
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/record", method = RequestMethod.POST)
    @ResponseBody
    public String saveRecord(@RequestBody Record record) {
        recordService.saveRecord(record);
        return "{\"result\":true}";
    }

    /**
     * 删除档案
     * @param record 指定档案
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/record",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteRecord(@RequestBody Record record) {
        Integer id = record.getId();
        recordService.deleteRecord(id);
        return "{\"result\":true}";
    }
	
}
