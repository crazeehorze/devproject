package com.github.devproject.mapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by roypaul on 25/04/2017.
 */
public class MappingEngine {


    public MappingEngine() {

        Map<String, Object> mappingEntryProperties = new HashMap<>();
        mappingEntryProperties.put("mapper-entry-key", "xpathvalue");
        if (checkIfConditionsSpecified()){
            Map<String, Object> conditions = new HashMap<>();
            conditions.put("dbosml.messagePayloadsubtype", " = strategy");
            mappingEntryProperties.put(hasConditions.PROPERTY, conditions);

        }

        if (resultHasTemplates()){
            Map<String, Object> resultTemplates = new HashMap<>();
            resultTemplates.put("key1", "dbosml.rbclegalentity.dtcc_participant_id");
            mappingEntryProperties.put(hasTemplateInMapping.PROPERTY, resultTemplates);
        }


        Map<String, Object> mappingSheetProperties = new HashMap<>();
        mappingSheetProperties.put("SheetName", mappingEntryProperties);
        MappingSheet mappingSheet = new MappingSheet(mappingSheetProperties);

        Map<String, Object> workbookProperties = new HashMap<>();
        workbookProperties.put("Sheet1", mappingSheet );

        MappingWorkBook mappingWorkBook = new MappingWorkBook("Mappingworkbookname", workbookProperties);



    }

    private boolean resultHasTemplates() {

        return true;
    }

    private boolean checkIfConditionsSpecified() {
        return true;
    }


}
