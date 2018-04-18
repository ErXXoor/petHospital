package org.petHospital.service.implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.ExaminationMapper;
import org.petHospital.model.Examination;
import org.petHospital.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExaminationServiceImpl implements ExaminationService {

    @Autowired
    private ExaminationMapper examinationRepository;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveExamination(Examination examination) {
        try {
            return examinationRepository.insert(examination);
        } catch (Exception e) {
            log.error("在saveExamination出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<Examination> getAllExamination() {
        try {
            List list = examinationRepository.selectAll();
            return list;
        } catch (Exception e) {
            log.error("在getAllExamination出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public Examination getExamination(String name) {
        try {
            return examinationRepository.selectByName(name);
        } catch (Exception e) {
            log.error("在getExamination出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteExamination(Integer id) {
        try {
            examinationRepository.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteExamination出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateExamination(Examination examination) {
        try {
            examinationRepository.updateByPrimaryKey(examination);
        } catch (Exception e) {
            log.error("在updateExamination出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
