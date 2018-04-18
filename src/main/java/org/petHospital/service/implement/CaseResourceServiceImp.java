package org.petHospital.service.implement;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.CaseResourceMapper;
import org.petHospital.model.CaseResource;
import org.petHospital.service.CaseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseResourceServiceImp implements CaseResourceService{
	 @Autowired
	    private CaseResourceMapper caseResourceRepository;

	    //log工厂
	    private final Log log = LogFactory.getLog(getClass());

	    public Integer saveCaseResource(CaseResource caseResource) {
	        try {
	            Integer id = caseResourceRepository.insert(caseResource);
	            return id;
	        } catch (Exception e) {
	            log.error("在saveCaseResource出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
	        return -1;
	    }

	    public List<CaseResource> getAllCaseResource() {
	        try {
	            List<CaseResource> list = caseResourceRepository.selectAll();
	            return list;
	        } catch (Exception e) {
	            log.error("在getAllCaseResource出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
	        return null;
	    }

	    public CaseResource getById(Integer id){

	        try {
	            CaseResource cr = caseResourceRepository.selectByPrimaryKey(id);
	            return cr;
	        } catch (Exception e) {
	            log.error("在getCaseResource出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
	        return null;
	    }
//	    public CaseResource getCaseResource(String name){
//	        return caseResourceRepository.getByName(name);
//	    }

	    public void deleteCaseResource(Integer id) {
	        try {
	            caseResourceRepository.deleteByPrimaryKey(id);
	        } catch (Exception e) {
	            log.error("在deleteCaseResource出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
	    }

	    public void updateCaseResource(CaseResource caseResource) {
	        try {
	            caseResourceRepository.updateByPrimaryKey(caseResource);
	        } catch (Exception e) {
	            log.error("在updateCaseResource出错了");
	            log.error(e);
	            e.printStackTrace();
	        }
	    }
}
