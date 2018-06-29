package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsScoreScheme;
import plm.beans.SportsScoreSchemeExample;

public interface SportsScoreSchemeMapper {
    long countByExample(SportsScoreSchemeExample example);

    int deleteByExample(SportsScoreSchemeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsScoreScheme record);

    int insertSelective(SportsScoreScheme record);

    List<SportsScoreScheme> selectByExample(SportsScoreSchemeExample example);

    SportsScoreScheme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsScoreScheme record, @Param("example") SportsScoreSchemeExample example);

    int updateByExample(@Param("record") SportsScoreScheme record, @Param("example") SportsScoreSchemeExample example);

    int updateByPrimaryKeySelective(SportsScoreScheme record);

    int updateByPrimaryKey(SportsScoreScheme record);
}