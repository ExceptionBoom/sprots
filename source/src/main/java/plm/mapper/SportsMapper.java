package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.Sports;
import plm.beans.SportsExample;

public interface SportsMapper {
    long countByExample(SportsExample example);

    int deleteByExample(SportsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sports record);

    int insertSelective(Sports record);

    List<Sports> selectByExample(SportsExample example);

    Sports selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sports record, @Param("example") SportsExample example);

    int updateByExample(@Param("record") Sports record, @Param("example") SportsExample example);

    int updateByPrimaryKeySelective(Sports record);

    int updateByPrimaryKey(Sports record);
}