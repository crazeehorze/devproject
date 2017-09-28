package com.github.devproject.learnjava8;
import java.net.URL;
import java.net.URLClassLoader;
import com.github.devproject.learnjava8.jpa.JpaTester;
import com.github.devproject.learnjava8.lambdas.FindGreater;
import com.github.devproject.learnjava8.lambdas.FindPrimes;

import java.net.URL;

public class FeatureRunner{

    public static void main (String[] args){

        Feature feature = new JpaTester();
        feature.runFeature();
    }

}
