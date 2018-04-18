package org.petHospital.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.petHospital.model.HospitalRecord;
import org.petHospital.model.HospitalRecordExample;

public interface HospitalRecordMapper {
    int countByExample(HospitalRecordExample example);

    int deleteByExample(HospitalRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HospitalRecord record);

    int insertSelective(HospitalRecord record);

    List<HospitalRecord> selectByExample(HospitalRecordExample example);

    HospitalRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HospitalRecord record, @Param("example") HospitalRecordExample example);

    int updateByExample(@Param("record") HospitalRecord record, @Param("example") HospitalRecordExample example);

    int updateByPrimaryKeySelective(HospitalRecord record);

    int updateByPrimaryKey(HospitalRecord record);
}