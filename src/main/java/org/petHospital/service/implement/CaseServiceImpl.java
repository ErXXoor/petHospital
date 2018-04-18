package org.petHospital.service.implement;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.petHospital.mapper.CaseEntityMapper;
import org.petHospital.model.CaseEntity;
import org.petHospital.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseEntityMapper caseRepository;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    public Integer saveCase(CaseEntity caseEntity) {
        try {
            return caseRepository.insert(caseEntity);
        } catch (DataAccessException e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
            log.error("在getCase出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public void deleteCase(Integer id) {
        try {
            caseRepository.deleteByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在deleteCase出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateCase(CaseEntity caseEntity) {
        try {
            caseRepository.updateByPrimaryKey(caseEntity);
        } catch (Exception e) {
            log.error("在updateCase出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public List<CaseEntity> getCaseInClassification(String classification) {
        try {
            List list = caseRepository.selectByClassification(classification);
            return list;
        } catch (Exception e) {
            log.error("在getCaseInClassification出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public CaseEntity getCaseByID(Integer id) {
        try {
            return caseRepository.selectByPrimaryKey(id);
        } catch (Exception e) {
            log.error("在getCaseByID出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }
}
