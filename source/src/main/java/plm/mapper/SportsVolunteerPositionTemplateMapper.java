package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsVolunteerPositionTemplate;
import plm.beans.SportsVolunteerPositionTemplateExample;

public interface SportsVolunteerPositionTemplateMapper {
    long countByExample(SportsVolunteerPositionTemplateExample example);

    int deleteByExample(SportsVolunteerPositionTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsVolunteerPositionTemplate record);

    int insertSelective(SportsVolunteerPositionTemplate record);

    List<SportsVolunteerPositionTemplate> selectByExample(SportsVolunteerPositionTemplateExample example);

    SportsVolunteerPositionTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsVolunteerPositionTemplate record, @Param("example") SportsVolunteerPositionTemplateExample example);

    int updateByExample(@Param("record") SportsVolunteerPositionTemplate record, @Param("example") SportsVolunteerPositionTemplateExample example);

    int updateByPrimaryKeySelective(SportsVolunteerPositionTemplate record);

    int updateByPrimaryKey(SportsVolunteerPositionTemplate record);
}