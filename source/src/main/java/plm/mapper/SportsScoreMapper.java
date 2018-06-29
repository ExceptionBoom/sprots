package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsScore;
import plm.beans.SportsScoreExample;

public interface SportsScoreMapper {
    long countByExample(SportsScoreExample example);

    int deleteByExample(SportsScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsScore record);

    int insertSelective(SportsScore record);

    List<SportsScore> selectByExample(SportsScoreExample example);

    SportsScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsScore record, @Param("example") SportsScoreExample example);

    int updateByExample(@Param("record") SportsScore record, @Param("example") SportsScoreExample example);

    int updateByPrimaryKeySelective(SportsScore record);

    int updateByPrimaryKey(SportsScore record);
}