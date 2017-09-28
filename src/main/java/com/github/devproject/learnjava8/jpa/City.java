package com.github.devproject.learnjava8.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Entity
@Table(name = "city")
public class City implements Serializable {

    @Id
    @Column(name = "ID")
    private int cityId;
    @Column(name = "Name")
    private String name;

    public Country getCountry() {
        return country;
    }

    @OneToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Column(name = "District")
    private String district;
    @Column(name = "Population")
    private long population;
    @Override
    public String toString(){
        String city =   "Id: " + cityId + " city: " + name;
        String ctry = " Country: " + getCountry();
        String capital = country.getCapital().name;
        String langList = country.getLanguagesList().stream().collect(toList()).toString();
        return (city + " " + ctry + " Capital city =" + capital + " languages spoken " + langList);

    }


}
