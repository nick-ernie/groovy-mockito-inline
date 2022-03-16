package com.mockitoinlinetest;

import groovy.transform.CompileStatic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@CompileStatic
class CallerJavaTest {

    @Test
    void testDoCall() {
        Called mock = mock(Called.class);

        when(mock.doCall()).thenReturn("mock called");

        String res = new Caller(mock).doCall();
        assertEquals("mock called", res);
    }
}
