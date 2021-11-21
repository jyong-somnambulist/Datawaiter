package com.jyong.datawaiterspringboot.task;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.somnambulistspringboot.config.JmsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMqProducer {


    //实例生产者
    private String producerGroup="test_producer";

    private DefaultMQProducer producer;

    //不开启vip通道 开通后端口会减2
    public RabbitMqProducer(){
        producer = new DefaultMQProducer(producerGroup);

        //绑定name server
        producer.setNamesrvAddr(JmsConfig.name_server);

        start();
    }


    /**
     * 在对象使用之前必须调用一次，只能调用一次
     *
     */
    public void start() {

        try {
            this.producer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }

    }


    public DefaultMQProducer getProducer(){
        return this.producer;
    }



    public void shutdown(){

        this.producer.shutdown();

    }





}
