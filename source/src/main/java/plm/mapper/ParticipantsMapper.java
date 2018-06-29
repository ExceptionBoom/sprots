package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.Participants;
import plm.beans.ParticipantsExample;

public interface ParticipantsMapper {
    long countByExample(ParticipantsExample example);

    int deleteByExample(ParticipantsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Participants record);

    int insertSelective(Participants record);

    List<Participants> selectByExample(ParticipantsExample example);

    Participants selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Participants record, @Param("example") ParticipantsExample example);

    int updateByExample(@Param("record") Participants record, @Param("example") ParticipantsExample example);

    int updateByPrimaryKeySelective(Participants record);

    int updateByPrimaryKey(Participants record);
}