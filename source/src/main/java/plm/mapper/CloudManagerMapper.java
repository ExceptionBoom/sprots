package plm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import plm.beans.CloudManager;
import plm.beans.CloudManagerExample;

public interface CloudManagerMapper {
    long countByExample(CloudManagerExample example);

    int deleteByExample(CloudManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CloudManager record);

    int insertSelective(CloudManager record);

    List<CloudManager> selectByExample(CloudManagerExample example);

    CloudManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CloudManager record, @Param("example") CloudManagerExample example);

    int updateByExample(@Param("record") CloudManager record, @Param("example") CloudManagerExample example);

    int updateByPrimaryKeySelective(CloudManager record);

    int updateByPrimaryKey(CloudManager record);
}