package com.github.devproject.mapper;



import java.util.Optional;

/**
 * Created by roypaul on 24/04/2017.
 */
public interface hasTemplateInMapping extends Document{

    String PROPERTY = "TEMPLATE_PATTERNS";

    default Optional<String> getTemplatePatterns() {
        return Optional.ofNullable((String) get(PROPERTY));
    }

}
