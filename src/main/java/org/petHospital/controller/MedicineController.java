package org.petHospital.controller;

import java.util.ArrayList;
import java.util.List;

import org.petHospital.model.Medicine;
import org.petHospital.service.MedicineService;
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
public class MedicineController {
	@Autowired
    private MedicineService medicineService;

    /**
     * 获得指定页码的药品信息
     *
     * @param page 药品申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/medicine/{page}",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getMedicine(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List medicines = medicineService.getAllMedicine();
        List<Medicine> submedicines = null;
        int total = (medicines.size() - 1) / 10 + 1;
        int fromINdex = (pages - 1) * 10;
        if (medicines.size() >= fromINdex) {
            int toIndex = pages * 10;
            if (medicines.size() >= toIndex) {
                submedicines = medicines.subList(fromINdex, toIndex);
            } else {
                submedicines = medicines.subList(fromINdex, medicines.size());
            }
        }
        class templateInfo {
            Integer id;
            String medicineName;
            Float medicinePrice;
            Integer medicineType;
            String description;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (Medicine medicine : submedicines) {
            templateInfo tempInfo = new templateInfo();
            tempInfo.id = medicine.getId();
            tempInfo.medicineName = medicine.getMedicineName();
            tempInfo.medicinePrice = medicine.getMedicinePrice();
            tempInfo.medicineType = medicine.getMedicineType();
            tempInfo.description = medicine.getDescription();
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
     * 增加药品
     * @param medicine 指定药品
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/medicine",method = RequestMethod.POST)
    @ResponseBody
    public String saveMedicine(@RequestBody Medicine medicine){
        medicineService.saveMedicine(medicine);
        return "{\"result\":true}";
    }

    /**
     * 更新药品
     * @param medicine 指定药品
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/medicine",method = RequestMethod.PUT)
    @ResponseBody
    public String updateMedicine(@RequestBody Medicine medicine){
        medicineService.updateMedicine(medicine);
        return "{\"result\":true}";
    }

    /**
     * 删除药品
     * @param medicine 指定药品
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/medicine",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteMedicine(@RequestBody Medicine medicine) {
        Integer id = medicine.getId();
        medicineService.deleteMedicine(id);
        return "{\"result\":true}";
    }
}
