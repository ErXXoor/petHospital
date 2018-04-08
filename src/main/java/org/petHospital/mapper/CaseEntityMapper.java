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

    CaseEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaseEntity record, @Param("example") CaseEntityExample example);

    int updateByExample(@Param("record") CaseEntity record, @Param("example") CaseEntityExample example);

    int updateByPrimaryKeySelective(CaseEntity record);

    int updateByPrimaryKey(CaseEntity record);
    
    List<CaseEntity> findAllCaseEntityByCategoryId(int id);
}