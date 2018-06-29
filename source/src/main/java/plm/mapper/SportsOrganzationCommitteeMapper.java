package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.SportsOrganzationCommittee;
import plm.beans.SportsOrganzationCommitteeExample;

public interface SportsOrganzationCommitteeMapper {
    long countByExample(SportsOrganzationCommitteeExample example);

    int deleteByExample(SportsOrganzationCommitteeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SportsOrganzationCommittee record);

    int insertSelective(SportsOrganzationCommittee record);

    List<SportsOrganzationCommittee> selectByExample(SportsOrganzationCommitteeExample example);

    SportsOrganzationCommittee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SportsOrganzationCommittee record, @Param("example") SportsOrganzationCommitteeExample example);

    int updateByExample(@Param("record") SportsOrganzationCommittee record, @Param("example") SportsOrganzationCommitteeExample example);

    int updateByPrimaryKeySelective(SportsOrganzationCommittee record);

    int updateByPrimaryKey(SportsOrganzationCommittee record);
}