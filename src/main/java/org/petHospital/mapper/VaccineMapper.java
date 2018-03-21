package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.Vaccine;
import org.petHospital.model.VaccineExample;

public interface VaccineMapper {
    int countByExample(VaccineExample example);

    int deleteByExample(VaccineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vaccine record);

    int insertSelective(Vaccine record);

    List<Vaccine> selectByExample(VaccineExample example);

    Vaccine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vaccine record, @Param("example") VaccineExample example);

    int updateByExample(@Param("record") Vaccine record, @Param("example") VaccineExample example);

    int updateByPrimaryKeySelective(Vaccine record);

    int updateByPrimaryKey(Vaccine record);
}