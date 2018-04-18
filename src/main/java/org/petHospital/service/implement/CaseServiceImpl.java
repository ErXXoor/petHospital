package org.petHospital.service.implement;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseDao caseRepository;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveCase(CaseEntity caseEntity) {
        try {
            return caseRepository.save(caseEntity);
        } catch (HibernateException e) {
            log.error("在saveCase出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<CaseEntity> getAllCase() {
        try {
            List list = caseRepository.findAll();
            return list;
        } catch (HibernateException e) {
            log.error("在getAllCase出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public List<CaseEntity> getCase(String name) {
        try {
            List list = caseRepository.getByName(name);
            return list;
        } catch (HibernateException e) {
            log.error("在getCase出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteCase(Integer id) {
        try {
            caseRepository.delete(id);
        } catch (HibernateException e) {
            log.error("在deleteCase出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateCase(CaseEntity caseEntity) {
        try {
            caseRepository.update(caseEntity);
        } catch (HibernateException e) {
            log.error("在updateCase出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public List<CaseEntity> getCaseInClassification(String classification) {
        try {
            List list = caseRepository.getByClassification(classification);
            return list;
        } catch (HibernateException e) {
            log.error("在getCaseInClassification出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public CaseEntity getCaseByID(Integer id) {
        try {
            return caseRepository.getByID(id);
        } catch (HibernateException e) {
            log.error("在getCaseByID出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }
}
