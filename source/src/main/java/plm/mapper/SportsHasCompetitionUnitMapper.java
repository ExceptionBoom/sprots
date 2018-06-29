package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasCompetitionUnitExample;
import plm.beans.SportsHasCompetitionUnitKey;

public interface SportsHasCompetitionUnitMapper {
    long countByExample(SportsHasCompetitionUnitExample example);

    int deleteByExample(SportsHasCompetitionUnitExample example);

    int deleteByPrimaryKey(SportsHasCompetitionUnitKey key);

    int insert(SportsHasCompetitionUnitKey record);

    int insertSelective(SportsHasCompetitionUnitKey record);

    List<SportsHasCompetitionUnitKey> selectByExample(SportsHasCompetitionUnitExample example);

    int updateByExampleSelective(@Param("record") SportsHasCompetitionUnitKey record, @Param("example") SportsHasCompetitionUnitExample example);

    int updateByExample(@Param("record") SportsHasCompetitionUnitKey record, @Param("example") SportsHasCompetitionUnitExample example);
}