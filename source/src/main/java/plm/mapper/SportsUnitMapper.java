package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsUnit;
import plm.beans.SportsUnitExample;
import plm.beans.SportsUnitKey;

public interface SportsUnitMapper {
    long countByExample(SportsUnitExample example);

    int deleteByExample(SportsUnitExample example);

    int deleteByPrimaryKey(SportsUnitKey key);

    int insert(SportsUnit record);

    int insertSelective(SportsUnit record);

    List<SportsUnit> selectByExample(SportsUnitExample example);

    SportsUnit selectByPrimaryKey(SportsUnitKey key);

    int updateByExampleSelective(@Param("record") SportsUnit record, @Param("example") SportsUnitExample example);

    int updateByExample(@Param("record") SportsUnit record, @Param("example") SportsUnitExample example);

    int updateByPrimaryKeySelective(SportsUnit record);

    int updateByPrimaryKey(SportsUnit record);
}