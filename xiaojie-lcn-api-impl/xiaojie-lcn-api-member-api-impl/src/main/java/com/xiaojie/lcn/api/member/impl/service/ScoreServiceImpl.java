package com.xiaojie.lcn.api.member.impl.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xiaojie.api.member.entity.Score;
import com.xiaojie.api.member.service.ScoreService;
import com.xiaojie.lcn.api.member.impl.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 积分服务
 * @author: xiaojie
 * @date: 2021.07.19
 */
@RestController
public class ScoreServiceImpl  implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    @Transactional
    @LcnTransaction
    public Integer saveScore(Score score) {
        return scoreMapper.save(score);
    }
}
