package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.CaseEntity;
import org.petHospital.model.CaseEntityExample;

public interface CaseEntityMapper {
    int countByExample(CaseEntityExample example);

    int deleteByExample(CaseEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaseEntity record);

    int insertSelective(CaseEntity record);

    List<CaseEntity> selectByExample(CaseEntityExample example);
    
    List<CaseEntity> getByName(String caseName);
    List<CaseEntity> selectByClassification(String classification);

    CaseEntity selectByPrimaryKey(Integer id);
    
    List<CaseEntity> findAll();

    int updateByExampleSelective(@Param("record") CaseEntity record, @Param("example") CaseEntityExample example);

    int updateByExample(@Param("record") CaseEntity record, @Param("example") CaseEntityExample example);

    int updateByPrimaryKeySelective(CaseEntity record);

    int updateByPrimaryKey(CaseEntity record);
}