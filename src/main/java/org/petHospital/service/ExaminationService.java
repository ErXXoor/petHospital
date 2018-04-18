package org.petHospital.service;



import java.util.List;

import org.petHospital.model.Examination;
public interface ExaminationService {
    Integer saveExamination(Examination examination);

    List<Examination> getAllExamination();

    Examination getExamination(String name);

    void deleteExamination(Integer id);

    void updateExamination(Examination examination);

}
