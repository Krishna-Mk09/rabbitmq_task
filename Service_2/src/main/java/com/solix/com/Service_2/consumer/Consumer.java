package com.solix.com.Service_2.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Consumer {

    @RabbitListener(queues = "messageQueue")
    public void consumeMessage(MessageDTO2 message) {
        MessageDTO2 messageDTO = new MessageDTO2(message.getEmail(), message.getId(), message.getPhone(), message.getName(), message.getPassword());
        System.out.println("Message consumed: " + messageDTO);

    }
}
