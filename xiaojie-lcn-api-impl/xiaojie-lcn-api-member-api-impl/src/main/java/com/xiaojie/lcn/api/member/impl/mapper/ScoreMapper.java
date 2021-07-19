package com.xiaojie.lcn.api.member.impl.mapper;

import com.xiaojie.api.member.entity.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * @Description:
 * @author: xiaojie
 * @date: 2021.07.19
 */
public interface ScoreMapper {
    @Insert("INSERT INTO tb_score (userId,orderId) VALUES(#{userId},#{orderId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer save(Score score);
}
