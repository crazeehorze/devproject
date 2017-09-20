package com.github.devproject.learnjava8.lambdas;

import com.github.devproject.learnjava8.Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static com.github.devproject.learnjava8.lambdas.FindUtility.doubled;
import static com.github.devproject.learnjava8.lambdas.FindUtility.isEven;
import static com.github.devproject.learnjava8.lambdas.FindUtility.isGreaterThan3;

public class FindGreater implements Feature {
    @Override
    public void runFeature() {

        List<Integer> numbers = Arrays.asList(1,3,5,6,7,8,9);

        //find sum of numbers greater than 3
        System.out.println(
        numbers.stream()
                .filter(n -> n > 3)
                .mapToInt(i -> i)
                .sum());

        System.out.println(
                numbers.stream()
                        .filter(n -> n > 3)
                        .reduce(0,(a,b) -> a+b));

        //find the double of the first even no greater than 3
        System.out.println(

                numbers.stream()
                        .filter(isGreaterThan3)
                        .filter(isEven)
                        .map(doubled)
                        .findFirst()
        );



    }
}
