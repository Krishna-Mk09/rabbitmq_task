package com.solix.com.Service_2.controller;

import com.solix.com.Service_2.domain.SecondUser;
import com.solix.com.Service_2.service.SecondUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secondUser")
public class SecondUserController {

    private final SecondUserService secondUserService;

    @Autowired
    public SecondUserController(SecondUserService secondUserService) {
        this.secondUserService = secondUserService;
    }

    @PostMapping
    public SecondUser saveUser(@RequestBody SecondUser user) {
        return secondUserService.saveUser(user);
    }

    @PutMapping("/{id}")
    public SecondUser updateById(@RequestBody SecondUser user, @PathVariable long id) {
        return secondUserService.updateById(user, id);
    }
}
