package com.qili;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.junit.Test;

/**
 * @Author: wuyong
 * @Description: Zookeeper connection test
 * @DateTime: 2023/2/1 19:00
 **/
public class ZookeeperTest {
    /**
     * 测试连接hbase
     * @throws Exception
     */
    @Test
    public void getConnection() throws Exception {
        //  创建conf对象
        Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum", "docker-hbase");
        configuration.set("zookeeper.znode.parent", "/hbase");
        configuration.set("hbase.zookeeper.property.clientPort", "2181");
        Connection connection = ConnectionFactory.createConnection(configuration);
        System.out.println("configuration:"+configuration);
        System.out.println("connection:"+connection.getAdmin());

    }
}
