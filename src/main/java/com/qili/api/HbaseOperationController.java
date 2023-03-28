package com.qili.api;

import com.alibaba.fastjson2.JSON;
import com.qili.common.BeanResult;
import com.qili.vo.HTableInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: wuyong
 * @Description: TODO
 * @DateTime: 2023/3/28 20:20
 **/
public class HbaseOperationController {

    private static final Logger logger = LoggerFactory.getLogger(HbaseOperationController.class);

    @PostMapping("/saveTableInfo")
    public BeanResult<HTableInfo> queryDailyVideo(@RequestBody @Validated HTableInfo request) {
        logger.info("=== 每日回放视频分页列表请求参数 {} ===", JSON.toJSONString(request));
        return null;
    }

}
