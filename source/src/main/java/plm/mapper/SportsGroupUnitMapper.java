package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsGroupUnit;
import plm.beans.SportsGroupUnitExample;

public interface SportsGroupUnitMapper {
    long countByExample(SportsGroupUnitExample example);

    int deleteByExample(SportsGroupUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsGroupUnit record);

    int insertSelective(SportsGroupUnit record);

    List<SportsGroupUnit> selectByExample(SportsGroupUnitExample example);

    SportsGroupUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsGroupUnit record, @Param("example") SportsGroupUnitExample example);

    int updateByExample(@Param("record") SportsGroupUnit record, @Param("example") SportsGroupUnitExample example);

    int updateByPrimaryKeySelective(SportsGroupUnit record);

    int updateByPrimaryKey(SportsGroupUnit record);
}