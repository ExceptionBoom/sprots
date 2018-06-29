package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasJudgementExample;
import plm.beans.SportsHasJudgementKey;

public interface SportsHasJudgementMapper {
    long countByExample(SportsHasJudgementExample example);

    int deleteByExample(SportsHasJudgementExample example);

    int deleteByPrimaryKey(SportsHasJudgementKey key);

    int insert(SportsHasJudgementKey record);

    int insertSelective(SportsHasJudgementKey record);

    List<SportsHasJudgementKey> selectByExample(SportsHasJudgementExample example);

    int updateByExampleSelective(@Param("record") SportsHasJudgementKey record, @Param("example") SportsHasJudgementExample example);

    int updateByExample(@Param("record") SportsHasJudgementKey record, @Param("example") SportsHasJudgementExample example);
}