package org.petHospital.service.implement;

import java.util.List;

import org.petHospital.mapper.CaseEntityMapper;
import org.petHospital.mapper.CaseResourceMapper;
import org.petHospital.mapper.CategoryMapper;
import org.petHospital.model.CaseEntity;
import org.petHospital.model.CaseResource;
import org.petHospital.model.Category;
import org.petHospital.service.CaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseEntityServiceImp implements CaseEntityService{

	@Autowired
	private CaseEntityMapper caseEntityMapper;
	
	
	public List<CaseEntity> findAllCaseEntityByCategoryId(int id){
		return caseEntityMapper.findAllCaseEntityByCategoryId(id);
	}

}
