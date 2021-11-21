package com.jyong.datawaiterspringboot.controller;


import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.somnambulistspringboot.config.JmsConfig;
import com.somnambulistspringboot.task.RabbitMqProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/task")
public class RabbitMqController {


    @Autowired
    private RabbitMqProducer rabbitMqProducer;

    private List<String> msgList;


    public RabbitMqController() {
        msgList = new ArrayList<>();

        msgList.add("中国");
        msgList.add("日本");
        msgList.add("美国");
        msgList.add("英国");
        msgList.add("澳大利亚");
    }


    @GetMapping("/dotask")
    public Object callback() throws MQBrokerException, RemotingException, InterruptedException, MQClientException {
        //总共发送5次消息
        for (String s : msgList) {
            Message msg = new Message(JmsConfig.topic, "test_tag", s.getBytes(StandardCharsets.UTF_8));

            //发送到消息队列
            SendResult send = rabbitMqProducer.getProducer().send(msg);

        }

        return "success";


    }
}
