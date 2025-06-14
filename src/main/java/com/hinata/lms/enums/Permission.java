package com.hinata.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    TEACHER_READ("teacher:read"),
    TEACHER_UPDATE("teacher:read"),
    TEACHER_CREATE("teacher:read"),
    TEACHER_DELETE("teacher:read");

    @Getter
    private final String permission;
}
