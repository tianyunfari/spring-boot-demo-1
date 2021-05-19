package com.xkcoding.mq.kafka.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * kafka消息发送
 *
 * @author wuchangyuan
 * @date 2021/2/16 16:43
 */
@Component
public class MessageSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // git操作测试
    private void  send(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
