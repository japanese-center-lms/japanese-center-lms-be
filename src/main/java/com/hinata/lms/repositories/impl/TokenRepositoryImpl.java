package com.hinata.lms.repositories.impl;

import com.hinata.lms.entity.Token;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class TokenRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Token> findAllValidTokenByUser(UUID userId) {
        return entityManager.createQuery(
                """
                select t from Token t
                join t.user u
                where u.id = :id and (t.expired = false or t.revoked = false)
                """, Token.class
        ).setParameter("id", userId).getResultList();
    }
}

