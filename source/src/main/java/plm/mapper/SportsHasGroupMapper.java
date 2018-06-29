package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsHasGroupExample;
import plm.beans.SportsHasGroupKey;

public interface SportsHasGroupMapper {
    long countByExample(SportsHasGroupExample example);

    int deleteByExample(SportsHasGroupExample example);

    int deleteByPrimaryKey(SportsHasGroupKey key);

    int insert(SportsHasGroupKey record);

    int insertSelective(SportsHasGroupKey record);

    List<SportsHasGroupKey> selectByExample(SportsHasGroupExample example);

    int updateByExampleSelective(@Param("record") SportsHasGroupKey record, @Param("example") SportsHasGroupExample example);

    int updateByExample(@Param("record") SportsHasGroupKey record, @Param("example") SportsHasGroupExample example);
}