package com.github.devproject.learnjava8.lambdas;

import org.junit.Test;

import static com.github.devproject.learnjava8.lambdas.FindPrimes.isPrime;
import static org.junit.Assert.*;

public class FindPrimesTest {

    @Test
    public void test1IsNotPrime(){
        assertFalse(FindPrimes.isPrime(1));
    }

    @Test
    public void testMinus1IsNotPrime(){
        assertFalse(FindPrimes.isPrime(-1));
    }

    @Test
    public void test2IsPrime(){
        assertTrue(FindPrimes.isPrime(2));
    }

    @Test
    public void test5IsPrime(){
        assertTrue(FindPrimes.isPrime(2));
    }

    @Test
    public void test37IsPrime(){
        assertTrue(FindPrimes.isPrime(37));
    }

}