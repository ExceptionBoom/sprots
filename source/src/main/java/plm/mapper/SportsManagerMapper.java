package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsManager;
import plm.beans.SportsManagerExample;

public interface SportsManagerMapper {
    long countByExample(SportsManagerExample example);

    int deleteByExample(SportsManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsManager record);

    int insertSelective(SportsManager record);

    List<SportsManager> selectByExample(SportsManagerExample example);

    SportsManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsManager record, @Param("example") SportsManagerExample example);

    int updateByExample(@Param("record") SportsManager record, @Param("example") SportsManagerExample example);

    int updateByPrimaryKeySelective(SportsManager record);

    int updateByPrimaryKey(SportsManager record);
}