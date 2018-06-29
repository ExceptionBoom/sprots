package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.AthletesResultNote;
import plm.beans.AthletesResultNoteExample;

public interface AthletesResultNoteMapper {
    long countByExample(AthletesResultNoteExample example);

    int deleteByExample(AthletesResultNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AthletesResultNote record);

    int insertSelective(AthletesResultNote record);

    List<AthletesResultNote> selectByExample(AthletesResultNoteExample example);

    AthletesResultNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AthletesResultNote record, @Param("example") AthletesResultNoteExample example);

    int updateByExample(@Param("record") AthletesResultNote record, @Param("example") AthletesResultNoteExample example);

    int updateByPrimaryKeySelective(AthletesResultNote record);

    int updateByPrimaryKey(AthletesResultNote record);
}