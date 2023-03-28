package com.qili.utils;

import org.apache.http.concurrent.FutureCallback;
import org.apache.http.pool.ConnPool;

import java.util.concurrent.Future;

/**
 * @Author: wuyong
 * @Description: 自定义连接池
 * @DateTime: 2023/3/28 15:35
 **/
public class ConnPoolImpl implements ConnPool {
    public Future lease(Object o, Object o2, FutureCallback futureCallback) {
        return null;
    }

    public void release(Object o, boolean b) {

    }
}
