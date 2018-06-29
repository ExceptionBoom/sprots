package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.Judgement;
import plm.beans.JudgementExample;

public interface JudgementMapper {
    long countByExample(JudgementExample example);

    int deleteByExample(JudgementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Judgement record);

    int insertSelective(Judgement record);

    List<Judgement> selectByExample(JudgementExample example);

    Judgement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Judgement record, @Param("example") JudgementExample example);

    int updateByExample(@Param("record") Judgement record, @Param("example") JudgementExample example);

    int updateByPrimaryKeySelective(Judgement record);

    int updateByPrimaryKey(Judgement record);
}