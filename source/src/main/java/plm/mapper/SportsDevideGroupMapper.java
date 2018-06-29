package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsDevideGroup;
import plm.beans.SportsDevideGroupExample;

public interface SportsDevideGroupMapper {
    long countByExample(SportsDevideGroupExample example);

    int deleteByExample(SportsDevideGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsDevideGroup record);

    int insertSelective(SportsDevideGroup record);

    List<SportsDevideGroup> selectByExample(SportsDevideGroupExample example);

    SportsDevideGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsDevideGroup record, @Param("example") SportsDevideGroupExample example);

    int updateByExample(@Param("record") SportsDevideGroup record, @Param("example") SportsDevideGroupExample example);

    int updateByPrimaryKeySelective(SportsDevideGroup record);

    int updateByPrimaryKey(SportsDevideGroup record);
}