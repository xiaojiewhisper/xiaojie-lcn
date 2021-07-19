package com.xiaojie.api.member.service;

import com.xiaojie.api.member.entity.Score;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description:积分服务接口
 * @author: xiaojie
 * @date: 2021.07.19
 */
public interface ScoreService {

    @PostMapping("/saveScore")
    Integer saveScore(@RequestBody Score score);
}
