package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasItem;
import plm.beans.SportsHasItemExample;
import plm.beans.SportsHasItemKey;

public interface SportsHasItemMapper {
    long countByExample(SportsHasItemExample example);

    int deleteByExample(SportsHasItemExample example);

    int deleteByPrimaryKey(SportsHasItemKey key);

    int insert(SportsHasItem record);

    int insertSelective(SportsHasItem record);

    List<SportsHasItem> selectByExample(SportsHasItemExample example);

    SportsHasItem selectByPrimaryKey(SportsHasItemKey key);

    int updateByExampleSelective(@Param("record") SportsHasItem record, @Param("example") SportsHasItemExample example);

    int updateByExample(@Param("record") SportsHasItem record, @Param("example") SportsHasItemExample example);

    int updateByPrimaryKeySelective(SportsHasItem record);

    int updateByPrimaryKey(SportsHasItem record);
}