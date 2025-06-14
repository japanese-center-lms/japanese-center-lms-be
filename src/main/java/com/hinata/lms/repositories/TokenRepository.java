package com.hinata.lms.repositories;

import java.util.Optional;
import java.util.UUID;

import com.hinata.lms.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, UUID> {
    Optional<Token> findByToken(String token);
}
