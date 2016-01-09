package com.kryptnostic.annotations.processors;

import java.util.UUID;

import com.kryptnostic.annotations.UserId;

public class UserIdAnnotationTest {
    public UUID id = UUID.randomUUID();

    public void foo( @UserId UUID f ) {
        
    }
    
    public void bar() {
        UUID f = UUID.randomUUID();
        foo( f );
    }
}
