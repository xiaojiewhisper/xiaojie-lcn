package com.xiaojie.lcn.api.order.impl.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xiaojie.api.member.entity.Score;
import com.xiaojie.lcn.api.order.impl.mapper.OrderMapper;
import com.xiaojie.lcn.api.order.impl.service.feign.ScoreServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: xiaojie
 * @date: 2021.07.19
 */
@RestController
public class OrderServiceImpl {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ScoreServiceFeign scoreServiceFeign;

    @GetMapping("/finish")
    @Transactional
    @LcnTransaction
    public String finishOrder(String orderId){
        Integer integer = orderMapper.finishOrder(orderId);
        if (integer<0){
            return "修改订单失败";
        }
        //订单完成，添加积分
        Score score=new Score();
        score.setOrderId(orderId);
        score.setUserId(123456L);
        Integer integer1 = scoreServiceFeign.saveScore(score);
        int i=1/Integer.valueOf(orderId);
        return integer1+"";
    }
}
