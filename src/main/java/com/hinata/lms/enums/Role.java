package com.hinata.lms.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

import static com.hinata.lms.enums.Permission.*;

@RequiredArgsConstructor
public enum Role {

    USER(Collections.emptySet()),
    ADMIN(
            Set.of(
                    ADMIN_CREATE,
                    ADMIN_READ,
                    ADMIN_UPDATE,
                    ADMIN_DELETE,
                    TEACHER_CREATE,
                    TEACHER_READ,
                    TEACHER_UPDATE,
                    TEACHER_DELETE
            )
    ),
    TEACHER(
            Set.of(
                    TEACHER_CREATE,
                    TEACHER_READ,
                    TEACHER_UPDATE,
                    TEACHER_DELETE
            )
    );

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_ " + this.name()));
        return authorities;
    }
}
