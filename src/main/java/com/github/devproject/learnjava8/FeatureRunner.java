package com.github.devproject.learnjava8;

import com.github.devproject.learnjava8.lambdas.FindPrimes;

public class FeatureRunner{

    public static void main (String[] args){
        Feature feature = new FindPrimes();
        feature.runFeature();
    }

}