package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.AthletesResult;
import plm.beans.AthletesResultExample;

public interface AthletesResultMapper {
    long countByExample(AthletesResultExample example);

    int deleteByExample(AthletesResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AthletesResult record);

    int insertSelective(AthletesResult record);

    List<AthletesResult> selectByExample(AthletesResultExample example);

    AthletesResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AthletesResult record, @Param("example") AthletesResultExample example);

    int updateByExample(@Param("record") AthletesResult record, @Param("example") AthletesResultExample example);

    int updateByPrimaryKeySelective(AthletesResult record);

    int updateByPrimaryKey(AthletesResult record);
}