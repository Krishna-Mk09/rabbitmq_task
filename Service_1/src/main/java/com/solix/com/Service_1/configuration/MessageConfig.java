package com.solix.com.Service_1.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
    protected static final String MESSAGE_KEY = "messageKey";
    private static final String MESSAGE_EXCHANGE = "messageExchange";
    private static final String MESSAGE_QUEUE = "messageQueue";

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(MESSAGE_EXCHANGE);
    }

    @Bean
    public Queue registerQueue() {
        return new Queue(MESSAGE_QUEUE, true);
    }

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemp = new RabbitTemplate(connectionFactory);
        rabbitTemp.setMessageConverter(producerJackson2MessageConverter());
        return rabbitTemp;
    }

    @Bean
    Binding bindingUser() {
        return BindingBuilder.bind(registerQueue()).to(directExchange()).with(MESSAGE_KEY);
    }
}


