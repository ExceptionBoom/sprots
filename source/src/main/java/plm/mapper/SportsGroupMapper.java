package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsGroup;
import plm.beans.SportsGroupExample;

public interface SportsGroupMapper {
    long countByExample(SportsGroupExample example);

    int deleteByExample(SportsGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsGroup record);

    int insertSelective(SportsGroup record);

    List<SportsGroup> selectByExample(SportsGroupExample example);

    SportsGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsGroup record, @Param("example") SportsGroupExample example);

    int updateByExample(@Param("record") SportsGroup record, @Param("example") SportsGroupExample example);

    int updateByPrimaryKeySelective(SportsGroup record);

    int updateByPrimaryKey(SportsGroup record);
}