package com.github.devproject.mapper;

import com.github.devproject.mapper.AbstractDocument;

import java.util.Map;

/**
 * Created by roypaul on 24/04/2017.
 */
public class MappingWorkBook extends AbstractDocument {

    public MappingWorkBook(String mappingworkbookname, Map<String, Object> properties) {
        super(properties);
    }
}
