package org.petHospital.service;

import java.util.List;

import org.petHospital.model.CaseEntity;

public interface CaseService {
    Integer saveCase(CaseEntity caseEntity);

    List<CaseEntity> getAllCase();

    List<CaseEntity> getCase(String name);

    void deleteCase(Integer id);

    void updateCase(CaseEntity caseEntity);

    List<CaseEntity> getCaseInClassification(String classification);

    CaseEntity getCaseByID(Integer id);
}
