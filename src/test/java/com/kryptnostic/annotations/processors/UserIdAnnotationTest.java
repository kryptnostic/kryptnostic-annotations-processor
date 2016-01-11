package com.kryptnostic.annotations.processors;

import java.util.UUID;

import org.junit.Test;

import com.kryptnostic.annotations.UserId;

public class UserIdAnnotationTest {
    @Test
    public void bar() {
        UUID f = UUID.randomUUID();
        foo( f );
    }
}
