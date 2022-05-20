package com.exampletwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AppTest {

    @Test
    void testAnswerVariable() {
        assertEquals(2, AverageMethod.answer);
    }

    @Test
    void testAverageMethod() {
        assertEquals(2, AverageMethod.average(1, 2, 3));
    }

    @Test
    void testBoolean() {
        assertTrue(MethodReturnTypes.thisBoolean());
    }

    @Test
    void testInteger() {
        assertNotEquals(30, MethodReturnTypes.thisInteger());
    }

    @Test
    void testNotNull() {
        assertNotNull(MethodReturnTypes.thisString());
    }
}
