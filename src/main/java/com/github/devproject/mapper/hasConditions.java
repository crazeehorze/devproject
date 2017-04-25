package com.github.devproject.mapper;


import com.github.devproject.mapper.Document;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by roypaul on 24/04/2017.
 */
public interface hasConditions extends Document{

    String PROPERTY = "CONDITIONAL_MAPPING_RULES";

    default Optional<Object> getConditions() {
        return Optional.ofNullable((Object) get(PROPERTY));
    }

}
