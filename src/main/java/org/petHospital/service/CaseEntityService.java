package org.petHospital.service;

import java.util.List;

import org.petHospital.model.CaseEntity;
import org.petHospital.model.CaseResource;
import org.petHospital.model.Category;;

public interface CaseEntityService {
	List<CaseEntity> findAllCaseEntityByCategoryId(int id);
}
