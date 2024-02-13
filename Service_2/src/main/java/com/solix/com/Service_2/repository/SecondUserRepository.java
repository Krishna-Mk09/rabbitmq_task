package com.solix.com.Service_2.repository;

import com.solix.com.Service_2.domain.SecondUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondUserRepository extends JpaRepository<SecondUser, Long> {
}
