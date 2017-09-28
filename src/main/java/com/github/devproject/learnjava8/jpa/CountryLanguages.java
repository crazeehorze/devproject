package com.github.devproject.learnjava8.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguages implements Serializable {


    @Id
    @Column(name = "CountryCode")
    private String countryCode;
    @Id
    @Column(name = "Language")
    private String language;

    @Override
    public String toString(){
        return  language;
    }

}
