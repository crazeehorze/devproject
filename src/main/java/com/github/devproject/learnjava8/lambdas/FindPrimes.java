package com.github.devproject.learnjava8.lambdas;

import com.github.devproject.learnjava8.Feature;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindPrimes implements Feature {
    @Override
    public void runFeature() {

        //Write a functional program to identify if a no is prime or not
        System.out.println(isPrime(-1));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }


    static boolean isPrime(int number) {

        IntPredicate isDivisible = i -> number % i == 0;

        return number > 1 && IntStream.range(2,number)
                                 .noneMatch(isDivisible);
    }
}
