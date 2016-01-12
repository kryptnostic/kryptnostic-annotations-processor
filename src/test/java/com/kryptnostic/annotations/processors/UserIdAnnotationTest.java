package com.kryptnostic.annotations.processors;

import java.util.UUID;

import org.junit.Test;

import com.kryptnostic.annotations.UserId;

public class UserIdAnnotationTest {
    @Test
    public void bar() {
        @UserId UUID f = UUID.randomUUID();
    }
}
