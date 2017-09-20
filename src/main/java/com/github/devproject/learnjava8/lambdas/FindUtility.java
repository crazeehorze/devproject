package com.github.devproject.learnjava8.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

class FindUtility {

    static Predicate<Integer> isGreaterThan3 = number -> number > 3;
    static Predicate<Integer> isEven = number -> number % 2 == 0;
    static Function<Integer,Integer> doubled = number -> number * 2;
    static Function<Integer, Predicate<Integer>> isDivisible = pivot -> number -> number % pivot == 0;
    static Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;
}
