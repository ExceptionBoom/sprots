package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasSportsUnitExample;
import plm.beans.SportsHasSportsUnitKey;

public interface SportsHasSportsUnitMapper {
    long countByExample(SportsHasSportsUnitExample example);

    int deleteByExample(SportsHasSportsUnitExample example);

    int deleteByPrimaryKey(SportsHasSportsUnitKey key);

    int insert(SportsHasSportsUnitKey record);

    int insertSelective(SportsHasSportsUnitKey record);

    List<SportsHasSportsUnitKey> selectByExample(SportsHasSportsUnitExample example);

    int updateByExampleSelective(@Param("record") SportsHasSportsUnitKey record, @Param("example") SportsHasSportsUnitExample example);

    int updateByExample(@Param("record") SportsHasSportsUnitKey record, @Param("example") SportsHasSportsUnitExample example);
}