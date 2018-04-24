package org.petHospital.controller;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.petHospital.model.HospitalRecord;
import org.petHospital.service.HospitalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller

public class HospitalRecordController {

  @Autowired
  private HospitalRecordService hospitalRecordService;

  /**
   * 获得指定页码的住院条目信息
   *
   * @param page 住院条目申请的页码
   * @return json数据信息
   */
  @RequestMapping(value = "admin/hospitalRecord/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
  @ResponseBody
  public String getHospitalRecords(@PathVariable String page) {
      int pages = Integer.parseInt(page);
      List hospitalRecords = hospitalRecordService.getAllHospitalRecord();
      List<HospitalRecord> subhospitalRecords = null;
      int total = (hospitalRecords.size()-1)/10+1;
      int fromIndex = (pages - 1) * 10;
      if (hospitalRecords.size() >= fromIndex) {
          int toIndex = pages * 10;
          if (hospitalRecords.size() >= toIndex) {
              subhospitalRecords = hospitalRecords.subList(fromIndex, toIndex);
          } else {
              subhospitalRecords = hospitalRecords.subList(fromIndex, hospitalRecords.size());
          }
      }
      class templateInfo {
          Integer id;
          String patient;
          java.util.Date startTime;
          java.util.Date endTime;
          String description;
      }
      List<templateInfo> result = new ArrayList<templateInfo>();
      for (HospitalRecord hospitalRecord : subhospitalRecords) {
          templateInfo tempInfo = new templateInfo();//必须放在循环内
          tempInfo.id = hospitalRecord.getId();
          tempInfo.patient = hospitalRecord.getPatient();
          tempInfo.startTime = hospitalRecord.getStartTime();
          tempInfo.endTime = hospitalRecord.getEndTime();
          tempInfo.description = hospitalRecord.getDescription();
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
   * 更新住院条目
   * @param hospitalRecord 指定住院条目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/hospitalRecord",method = RequestMethod.PUT)
  @ResponseBody
  public String updateHospitalRecord(@RequestBody HospitalRecord hospitalRecord){
      hospitalRecordService.updateHospitalRecord(hospitalRecord);
      return "{\"result\":true}";
  }

  /**
   * 增加住院条目
   * @param hospitalRecord 指定住院条目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/hospitalRecord", method = RequestMethod.POST)
  @ResponseBody
  public String saveHospitalRecord(@RequestBody HospitalRecord hospitalRecord) {
      hospitalRecordService.saveHospitalRecord(hospitalRecord);
      return "{\"result\":true}";
  }

  /**
   * 删除住院条目
   * @param hospitalRecord 指定住院条目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/hospitalRecord",method = RequestMethod.DELETE)
  @ResponseBody
  public String deleteHospitalRecord(@RequestBody HospitalRecord hospitalRecord) {
      Integer id = hospitalRecord.getId();
      hospitalRecordService.deleteHospitalRecord(id);
      return "{\"result\":true}";
  }
}
