package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.CompetitionUnit;
import plm.beans.CompetitionUnitExample;
import plm.beans.CompetitionUnitKey;

public interface CompetitionUnitMapper {
    long countByExample(CompetitionUnitExample example);

    int deleteByExample(CompetitionUnitExample example);

    int deleteByPrimaryKey(CompetitionUnitKey key);

    int insert(CompetitionUnit record);

    int insertSelective(CompetitionUnit record);

    List<CompetitionUnit> selectByExample(CompetitionUnitExample example);

    CompetitionUnit selectByPrimaryKey(CompetitionUnitKey key);

    int updateByExampleSelective(@Param("record") CompetitionUnit record, @Param("example") CompetitionUnitExample example);

    int updateByExample(@Param("record") CompetitionUnit record, @Param("example") CompetitionUnitExample example);

    int updateByPrimaryKeySelective(CompetitionUnit record);

    int updateByPrimaryKey(CompetitionUnit record);
}