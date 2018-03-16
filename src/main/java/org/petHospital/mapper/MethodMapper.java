package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.Method;
import org.petHospital.model.MethodExample;

public interface MethodMapper {
    int countByExample(MethodExample example);

    int deleteByExample(MethodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Method record);

    int insertSelective(Method record);

    List<Method> selectByExample(MethodExample example);

    Method selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Method record, @Param("example") MethodExample example);

    int updateByExample(@Param("record") Method record, @Param("example") MethodExample example);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);
}