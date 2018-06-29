package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsCompetitionSchedule;
import plm.beans.SportsCompetitionScheduleExample;

public interface SportsCompetitionScheduleMapper {
    long countByExample(SportsCompetitionScheduleExample example);

    int deleteByExample(SportsCompetitionScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsCompetitionSchedule record);

    int insertSelective(SportsCompetitionSchedule record);

    List<SportsCompetitionSchedule> selectByExample(SportsCompetitionScheduleExample example);

    SportsCompetitionSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsCompetitionSchedule record, @Param("example") SportsCompetitionScheduleExample example);

    int updateByExample(@Param("record") SportsCompetitionSchedule record, @Param("example") SportsCompetitionScheduleExample example);

    int updateByPrimaryKeySelective(SportsCompetitionSchedule record);

    int updateByPrimaryKey(SportsCompetitionSchedule record);
}