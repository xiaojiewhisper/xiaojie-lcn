package com.xiaojie.lcn.api.order.impl.service.feign;

import com.xiaojie.api.member.service.ScoreService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description:
 * @author: xiaojie
 * @date: 2021.07.19
 */
@FeignClient("xiaojie-member")
public interface ScoreServiceFeign extends ScoreService {
}
