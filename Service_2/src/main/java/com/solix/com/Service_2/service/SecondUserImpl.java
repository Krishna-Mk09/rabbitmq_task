package com.solix.com.Service_2.service;

import com.solix.com.Service_2.domain.SecondUser;
import com.solix.com.Service_2.repository.SecondUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondUserImpl {

    private final SecondUserRepository secondUserRepository;

    @Autowired
    public SecondUserImpl(SecondUserRepository secondUserRepository) {
        this.secondUserRepository = secondUserRepository;
    }

    public SecondUser saveUser(SecondUser user) {
        return secondUserRepository.save(user);
    }

    public SecondUser updateById(SecondUser user, long id) {
        return secondUserRepository.save(user);
    }

}
