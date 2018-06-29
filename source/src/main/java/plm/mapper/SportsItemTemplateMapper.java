package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsItemTemplate;
import plm.beans.SportsItemTemplateExample;

public interface SportsItemTemplateMapper {
    long countByExample(SportsItemTemplateExample example);

    int deleteByExample(SportsItemTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsItemTemplate record);

    int insertSelective(SportsItemTemplate record);

    List<SportsItemTemplate> selectByExample(SportsItemTemplateExample example);

    SportsItemTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsItemTemplate record, @Param("example") SportsItemTemplateExample example);

    int updateByExample(@Param("record") SportsItemTemplate record, @Param("example") SportsItemTemplateExample example);

    int updateByPrimaryKeySelective(SportsItemTemplate record);

    int updateByPrimaryKey(SportsItemTemplate record);
}