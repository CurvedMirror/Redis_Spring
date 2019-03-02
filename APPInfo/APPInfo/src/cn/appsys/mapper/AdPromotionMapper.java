package cn.appsys.mapper;

import cn.appsys.pojo.AdPromotion;
import cn.appsys.pojo.AdPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdPromotionMapper {
    long countByExample(AdPromotionExample example);

    int deleteByExample(AdPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdPromotion record);

    int insertSelective(AdPromotion record);

    List<AdPromotion> selectByExample(AdPromotionExample example);

    AdPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdPromotion record, @Param("example") AdPromotionExample example);

    int updateByExample(@Param("record") AdPromotion record, @Param("example") AdPromotionExample example);

    int updateByPrimaryKeySelective(AdPromotion record);

    int updateByPrimaryKey(AdPromotion record);
}