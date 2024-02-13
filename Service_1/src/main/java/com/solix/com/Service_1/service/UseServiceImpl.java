package com.solix.com.Service_1.service;

import com.solix.com.Service_1.configuration.MessageDTO;
import com.solix.com.Service_1.configuration.Producer;
import com.solix.com.Service_1.domain.User;
import com.solix.com.Service_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Producer producer;

    @Autowired
    public UseServiceImpl(UserRepository userRepository, Producer producer) {
        this.userRepository = userRepository;
        this.producer = producer;
    }


    @Override
    public User saveUser(User user) {
        User result = userRepository.save(user);
        MessageDTO messageDTO = new MessageDTO(result.getEmail(), result.getId(), result.getPhone(), result.getName(), result.getPassword());
        producer.sendMessage(messageDTO);
        return result;

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
