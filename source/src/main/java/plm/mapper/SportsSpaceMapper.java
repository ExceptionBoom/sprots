package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsSpace;
import plm.beans.SportsSpaceExample;

public interface SportsSpaceMapper {
    long countByExample(SportsSpaceExample example);

    int deleteByExample(SportsSpaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsSpace record);

    int insertSelective(SportsSpace record);

    List<SportsSpace> selectByExample(SportsSpaceExample example);

    SportsSpace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsSpace record, @Param("example") SportsSpaceExample example);

    int updateByExample(@Param("record") SportsSpace record, @Param("example") SportsSpaceExample example);

    int updateByPrimaryKeySelective(SportsSpace record);

    int updateByPrimaryKey(SportsSpace record);
}