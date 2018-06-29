package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsGroupItem;
import plm.beans.SportsGroupItemExample;

public interface SportsGroupItemMapper {
    long countByExample(SportsGroupItemExample example);

    int deleteByExample(SportsGroupItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(SportsGroupItem record);

    int insertSelective(SportsGroupItem record);

    List<SportsGroupItem> selectByExample(SportsGroupItemExample example);

    SportsGroupItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SportsGroupItem record, @Param("example") SportsGroupItemExample example);

    int updateByExample(@Param("record") SportsGroupItem record, @Param("example") SportsGroupItemExample example);

    int updateByPrimaryKeySelective(SportsGroupItem record);

    int updateByPrimaryKey(SportsGroupItem record);
}