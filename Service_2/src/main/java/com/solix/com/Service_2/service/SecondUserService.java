// SecondUserService.java
package com.solix.com.Service_2.service;

import com.solix.com.Service_2.domain.SecondUser;

public interface SecondUserService {

    SecondUser saveUser(SecondUser user);

    SecondUser updateById(SecondUser user, long id);

}
