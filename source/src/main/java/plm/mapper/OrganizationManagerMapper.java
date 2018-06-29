package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.OrganizationManager;
import plm.beans.OrganizationManagerExample;

public interface OrganizationManagerMapper {
    long countByExample(OrganizationManagerExample example);

    int deleteByExample(OrganizationManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrganizationManager record);

    int insertSelective(OrganizationManager record);

    List<OrganizationManager> selectByExample(OrganizationManagerExample example);

    OrganizationManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrganizationManager record, @Param("example") OrganizationManagerExample example);

    int updateByExample(@Param("record") OrganizationManager record, @Param("example") OrganizationManagerExample example);

    int updateByPrimaryKeySelective(OrganizationManager record);

    int updateByPrimaryKey(OrganizationManager record);
}