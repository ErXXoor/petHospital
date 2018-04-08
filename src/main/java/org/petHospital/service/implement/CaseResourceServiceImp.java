package org.petHospital.service.implement;

import org.petHospital.mapper.CaseResourceMapper;
import org.petHospital.model.CaseResource;
import org.petHospital.service.CaseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseResourceServiceImp implements CaseResourceService{
	@Autowired
	private CaseResourceMapper caseResourceMapper;
	
	public CaseResource getCaseResource(int id){
		return caseResourceMapper.selectByPrimaryKey(id);
	}
	
}
