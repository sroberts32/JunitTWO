package com.exampletwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertFalse(MethodReturnTypes.thisBoolean());
    }

    @Test
    void testInteger() {
        assertNotEquals(30, MethodReturnTypes.thisInteger());
    }

    @Test
    void testNotNull() {
        assertNotNull(MethodReturnTypes.thisString());
    }

    @Test
    void testSum() {
        assertEquals(15, Math.sum(5, 10));
    }

    @Test
    void testProduct() {
        assertEquals(15, Math.product(3, 5));
    }

    @Test 
    void testRemainder() {
        assertEquals(1, Math.remainder(6, 5));
    }

    @Test
    void testGreaterThan() {
        assertTrue(Math.num1Bigger(32, 30));
    }

    @Test
    void testNotEquals() {
        assertNotEquals(3, Math.notEquals(7));
    }
}
