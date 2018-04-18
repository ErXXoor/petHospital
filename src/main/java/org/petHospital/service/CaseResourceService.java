package org.petHospital.service;

import java.util.List;

import org.petHospital.model.CaseResource;

public interface CaseResourceService {
	 Integer saveCaseResource(CaseResource caseResource);

	    List<CaseResource> getAllCaseResource();

//	    CaseResource getCaseResource(String name);

	    CaseResource getById(Integer id);

	    void deleteCaseResource(Integer id);

	    void updateCaseResource(CaseResource caseResource);

}
