package com.github.devproject.learnjava8.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;

    public City getCapital() {
        return capital;
    }

    @OneToOne
    @JoinColumn(name = "Capital")
    private City capital;

    public List<CountryLanguages> getLanguagesList() {
        return languagesList;
    }

    @OneToMany
    @JoinColumn(name = "CountryCode")
    private List<CountryLanguages> languagesList;

    @Override
    public String toString(){
        return  "Country Code: " + code + " Name: " + name;
    }

}
