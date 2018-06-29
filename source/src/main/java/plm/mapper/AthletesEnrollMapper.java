package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.AthletesEnroll;
import plm.beans.AthletesEnrollExample;

public interface AthletesEnrollMapper {
    long countByExample(AthletesEnrollExample example);

    int deleteByExample(AthletesEnrollExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AthletesEnroll record);

    int insertSelective(AthletesEnroll record);

    List<AthletesEnroll> selectByExample(AthletesEnrollExample example);

    AthletesEnroll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AthletesEnroll record, @Param("example") AthletesEnrollExample example);

    int updateByExample(@Param("record") AthletesEnroll record, @Param("example") AthletesEnrollExample example);

    int updateByPrimaryKeySelective(AthletesEnroll record);

    int updateByPrimaryKey(AthletesEnroll record);
}