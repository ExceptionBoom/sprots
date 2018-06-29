package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasVolunteerPositionExample;
import plm.beans.SportsHasVolunteerPositionKey;

public interface SportsHasVolunteerPositionMapper {
    long countByExample(SportsHasVolunteerPositionExample example);

    int deleteByExample(SportsHasVolunteerPositionExample example);

    int deleteByPrimaryKey(SportsHasVolunteerPositionKey key);

    int insert(SportsHasVolunteerPositionKey record);

    int insertSelective(SportsHasVolunteerPositionKey record);

    List<SportsHasVolunteerPositionKey> selectByExample(SportsHasVolunteerPositionExample example);

    int updateByExampleSelective(@Param("record") SportsHasVolunteerPositionKey record, @Param("example") SportsHasVolunteerPositionExample example);

    int updateByExample(@Param("record") SportsHasVolunteerPositionKey record, @Param("example") SportsHasVolunteerPositionExample example);
}