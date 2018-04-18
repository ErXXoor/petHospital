package org.petHospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class CaseController {
	@Autowired
    private CaseService caseService;
    @Autowired
    private CaseResourceService caseResourceService;

    /**
     * 获得指定页码的病例信息，并得到其对应的四种病例资源信息
     *
     * @param page 病例申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/case/{page}",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getCases(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List cases = caseService.getAllCase();
        List<CaseEntity> subcases = null;
        int total = (cases.size()-1)/10+1;
        int fromIndex = (pages - 1) * 10;
        if (cases.size() >= fromIndex) {
            int toIndex = pages * 10;
            if (cases.size() >= toIndex) {
                subcases = cases.subList(fromIndex, toIndex);
            } else {
                subcases = cases.subList(fromIndex, cases.size());
            }
        }
        class templateInfo {
            Integer id;
            String caseName;
            CaseResource symptom;
            CaseResource exam;
            CaseResource result;
            CaseResource method;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (CaseEntity c : subcases) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.id = c.getId();
            tempInfo.caseName = c.getCaseName();
            tempInfo.symptom = caseResourceService.getById(c.getSymptom());
            tempInfo.exam = caseResourceService.getById(c.getExam());
            tempInfo.result = caseResourceService.getById(c.getResult());
            tempInfo.method = caseResourceService.getById(c.getMethod());
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
        return "{\"data\":"+json+",\"pages\":"+total+"}";
    }

//    @RequestMapping(value = "admin/case",method = RequestMethod.PUT)
//    @ResponseBody
//    public String updateCase(@RequestBody CaseEntity c){
//        caseService.updateCase(c);
//        return "{\"result\":true}";
//    }

    /**
     * 更新病例及其四种病例资源信息
     * @param map 现有病例对应的病例资源的映射
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/case",method = RequestMethod.PUT)
    @ResponseBody
    public String updateCase(@RequestBody Map map){
        int caseId = Integer.parseInt(map.get("id").toString());
        String caseName = map.get("caseName").toString();
        Map symptom = (Map)map.get("symptom");
        Map exam = (Map)map.get("exam");
        Map result = (Map)map.get("result");
        Map method = (Map)map.get("method");
        String classification = map.get("classification").toString();

        CaseResource cr = new CaseResource();

        //symptom
        cr.setId(Integer.parseInt(symptom.get("id").toString()));
        cr.setDescription(symptom.get("description").toString());
        cr.setPicture(symptom.get("picture").toString());
        cr.setVideo(symptom.get("video").toString());
        caseResourceService.updateCaseResource(cr);


        //exam
        cr.setId(Integer.parseInt(exam.get("id").toString()));
        cr.setDescription(exam.get("description").toString());
        cr.setPicture(exam.get("picture").toString());
        cr.setVideo(exam.get("video").toString());
        caseResourceService.updateCaseResource(cr);

        //result
        cr.setId(Integer.parseInt(result.get("id").toString()));
        cr.setDescription(result.get("description").toString());
        cr.setPicture(result.get("picture").toString());
        cr.setVideo(result.get("video").toString());
        caseResourceService.updateCaseResource(cr);

        //method
        cr.setId(Integer.parseInt(method.get("id").toString()));
        cr.setDescription(method.get("description").toString());
        cr.setPicture(method.get("picture").toString());
        cr.setVideo(method.get("video").toString());
        caseResourceService.updateCaseResource(cr);

        CaseEntity c = new CaseEntity();
        c.setId(caseId);
        c.setCaseName(caseName);
        c.setSymptom(Integer.parseInt(symptom.get("id").toString()));
        c.setExam(Integer.parseInt(exam.get("id").toString()));
        c.setResult(Integer.parseInt(result.get("id").toString()));
        c.setMethod(Integer.parseInt(method.get("id").toString()));
        c.setClassification(classification);
        caseService.updateCase(c);
        return "{\"result\":true}";
    }

    /**
     * 增加病例及其四种病例资源信息
     * @param map 现有病例对应的病例资源的映射
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/case",method = RequestMethod.POST)
    @ResponseBody
    public String saveCase(@RequestBody Map map){

        String caseName = map.get("caseName").toString();
        Map symptom = (Map)map.get("symptom");
        Map exam = (Map)map.get("exam");
        Map result = (Map)map.get("result");
        Map method = (Map)map.get("method");
        String classification = map.get("classification").toString();
        CaseResource cr = new CaseResource();

        //symptom
        cr.setDescription(symptom.get("description").toString());
        cr.setPicture(symptom.get("picture").toString());
        cr.setVideo(symptom.get("video").toString());
        int symptomId = caseResourceService.saveCaseResource(cr);


        //exam
        cr.setDescription(exam.get("description").toString());
        cr.setPicture(exam.get("picture").toString());
        cr.setVideo(exam.get("video").toString());
        int examId = caseResourceService.saveCaseResource(cr);

        //result
        cr.setDescription(result.get("description").toString());
        cr.setPicture(result.get("picture").toString());
        cr.setVideo(result.get("video").toString());
        int resultId = caseResourceService.saveCaseResource(cr);

        //method
        cr.setDescription(method.get("description").toString());
        cr.setPicture(method.get("picture").toString());
        cr.setVideo(method.get("video").toString());
        int methodId = caseResourceService.saveCaseResource(cr);

        CaseEntity c = new CaseEntity();
        c.setCaseName(caseName);
        c.setSymptom(symptomId);
        c.setExam(examId);
        c.setResult(resultId);
        c.setMethod(methodId);
        c.setClassification(classification);
        caseService.saveCase(c);
        return "{\"result\":true}";
    }

    /**
     * 更新病例
     * @param c 指定病例实体
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/case",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCase(@RequestBody CaseEntity c) {
        Integer id = c.getId();
        caseService.deleteCase(id);
        return "{\"result\":true}";
    }

    /**
     * 获得指定病例类别的病例，并得到其对应的病例名和其ID
     * @param classification 病例申类别
     * @return json数据信息
     */
    @RequestMapping(value = "learning/casenav/{classification}", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getCasesInClassification(@PathVariable String classification) {
        if(classification.equals("contagion"))
            classification = "传染病";
        else if(classification.equals("parasitosis"))
            classification = "寄生虫病";
        else if(classification.equals("internal"))
            classification = "内科病例";
        else if(classification.equals("obstetrics"))
            classification = "外产科病例";
        else if(classification.equals("surgery"))
            classification = "常用手术";
        else if(classification.equals("immune"))
            classification = "免疫";
        List<CaseEntity> cases = caseService.getCaseInClassification(classification);
        class templateInfo {
            String caseName;
            Integer caseId;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (CaseEntity c : cases) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.caseName = c.getCaseName();
            tempInfo.caseId = c.getId();
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
        return "{\"caseList\":" + json + "}";
    }

    /**
     * 获得指定ID的病例信息，并得到其对应的四种病例资源信息
     * @param caseId 申请病例的ID
     * @return json数据信息
     */
    @RequestMapping(value = "learning/casedes/{caseId}", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getCaseByID(@PathVariable Integer caseId) {
        CaseEntity cases = caseService.getCaseByID(caseId);
        class templateInfo {
            CaseResource symptom;
            CaseResource exam;
            CaseResource result;
            CaseResource method;
        }
        templateInfo tempInfo = new templateInfo();//必须放在循环内
        tempInfo.symptom = caseResourceService.getById(cases.getSymptom());
        tempInfo.exam = caseResourceService.getById(cases.getExam());
        tempInfo.result = caseResourceService.getById(cases.getResult());
        tempInfo.method = caseResourceService.getById(cases.getMethod());
        String caseName = cases.getCaseName();
        String json = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            json = objectMapper.writeValueAsString(tempInfo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"caseContent\":" + json + ",\"caseName\":" + "\"" + caseName + "\"" + "}";
    }

    /**
     * 搜索给定关键词，搜索范围是病例名和病例类别
     *
     * @param map 现有病例对应的病例资源的映射
     * @return json数据信息
     */
    @RequestMapping(value = "learning/casenav/search",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String Search(@RequestBody Map map){
        String key = map.get("searchContent").toString();
        int flag = 0;
        if(key.equals("contagion"))
            key = "传染病";
        else if(key.equals("parasitosis"))
            key = "寄生虫病";
        else if(key.equals("internal"))
            key = "内科病例";
        else if(key.equals("obstetrics"))
            key = "外产科病例";
        else if(key.equals("surgery"))
            key = "常用手术";
        else if(key.equals("immune"))
            key = "免疫";
        else
            flag = 1;
        class templateInfo{
            Integer caseId;
            String caseName;
        }
        List <CaseEntity> temp = new ArrayList<CaseEntity>();
        List <templateInfo> result = new ArrayList<templateInfo>();
        if(flag == 0) {
            temp = caseService.getCaseInClassification(key);
            for(CaseEntity tempCase : temp) {
                templateInfo tempinfo = new templateInfo();
                tempinfo.caseName = tempCase.getCaseName();
                tempinfo.caseId = tempCase.getId();
                result.add(tempinfo);
            }
        }else{
            temp.clear();
            temp = caseService.getCase(key);
            for(CaseEntity tempCase : temp) {
                templateInfo tempinfo = new templateInfo();
                tempinfo.caseName = tempCase.getCaseName();
                tempinfo.caseId = tempCase.getId();
                result.add(tempinfo);
            }
        }
        String json = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            json = objectMapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"resultList\":" + json + "}";
    }
}
