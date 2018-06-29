package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.VolunteerEnroll;
import plm.beans.VolunteerEnrollExample;

public interface VolunteerEnrollMapper {
    long countByExample(VolunteerEnrollExample example);

    int deleteByExample(VolunteerEnrollExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VolunteerEnroll record);

    int insertSelective(VolunteerEnroll record);

    List<VolunteerEnroll> selectByExample(VolunteerEnrollExample example);

    VolunteerEnroll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VolunteerEnroll record, @Param("example") VolunteerEnrollExample example);

    int updateByExample(@Param("record") VolunteerEnroll record, @Param("example") VolunteerEnrollExample example);

    int updateByPrimaryKeySelective(VolunteerEnroll record);

    int updateByPrimaryKey(VolunteerEnroll record);
}