package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsJudgementPositionTemplate;
import plm.beans.SportsJudgementPositionTemplateExample;

public interface SportsJudgementPositionTemplateMapper {
    long countByExample(SportsJudgementPositionTemplateExample example);

    int deleteByExample(SportsJudgementPositionTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsJudgementPositionTemplate record);

    int insertSelective(SportsJudgementPositionTemplate record);

    List<SportsJudgementPositionTemplate> selectByExample(SportsJudgementPositionTemplateExample example);

    SportsJudgementPositionTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsJudgementPositionTemplate record, @Param("example") SportsJudgementPositionTemplateExample example);

    int updateByExample(@Param("record") SportsJudgementPositionTemplate record, @Param("example") SportsJudgementPositionTemplateExample example);

    int updateByPrimaryKeySelective(SportsJudgementPositionTemplate record);

    int updateByPrimaryKey(SportsJudgementPositionTemplate record);
}