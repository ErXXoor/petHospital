package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.CaseResource;
import org.petHospital.model.CaseResourceExample;

public interface CaseResourceMapper {
    int countByExample(CaseResourceExample example);

    int deleteByExample(CaseResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaseResource record);

    int insertSelective(CaseResource record);

    List<CaseResource> selectByExample(CaseResourceExample example);
    List<CaseResource> selectAll();

    CaseResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaseResource record, @Param("example") CaseResourceExample example);

    int updateByExample(@Param("record") CaseResource record, @Param("example") CaseResourceExample example);

    int updateByPrimaryKeySelective(CaseResource record);

    int updateByPrimaryKey(CaseResource record);
}