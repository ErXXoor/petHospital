package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.Ward;
import org.petHospital.model.WardExample;

public interface WardMapper {
    int countByExample(WardExample example);

    int deleteByExample(WardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ward record);

    int insertSelective(Ward record);

    List<Ward> selectByExample(WardExample example);

    Ward selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ward record, @Param("example") WardExample example);

    int updateByExample(@Param("record") Ward record, @Param("example") WardExample example);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);
}