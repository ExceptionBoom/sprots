package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.VolunteerPosition;
import plm.beans.VolunteerPositionExample;

public interface VolunteerPositionMapper {
    long countByExample(VolunteerPositionExample example);

    int deleteByExample(VolunteerPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VolunteerPosition record);

    int insertSelective(VolunteerPosition record);

    List<VolunteerPosition> selectByExample(VolunteerPositionExample example);

    VolunteerPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VolunteerPosition record, @Param("example") VolunteerPositionExample example);

    int updateByExample(@Param("record") VolunteerPosition record, @Param("example") VolunteerPositionExample example);

    int updateByPrimaryKeySelective(VolunteerPosition record);

    int updateByPrimaryKey(VolunteerPosition record);
}