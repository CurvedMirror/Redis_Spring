package cn.appsys.mapper;

import cn.appsys.pojo.AppCategory;
import cn.appsys.pojo.AppCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppCategoryMapper {
    long countByExample(AppCategoryExample example);

    int deleteByExample(AppCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppCategory record);

    int insertSelective(AppCategory record);

    List<AppCategory> selectByExample(AppCategoryExample example);

    AppCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByExample(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByPrimaryKeySelective(AppCategory record);

    int updateByPrimaryKey(AppCategory record);
}