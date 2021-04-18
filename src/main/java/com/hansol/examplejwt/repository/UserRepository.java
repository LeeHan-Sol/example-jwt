package com.hansol.examplejwt.repository;

import com.hansol.examplejwt.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "authorities")    // 조회할 때 authorities 조회 방식 EAGER
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
