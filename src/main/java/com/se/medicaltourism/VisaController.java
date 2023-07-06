package com.se.medicaltourism;

import ch.qos.logback.core.read.ListAppender;
import com.se.medicaltourism.model.Country;
import com.se.medicaltourism.model.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class VisaDAO{
    static private Map<String, String> country_doc_map = Map.of(
            "IRAN", "phone,id_card",
            "UAE", "phone,passport"
    );

    static public List<Field> getFields(Country country){
        String key = country.name();
        String value = country_doc_map.get(key);
        var fieldsNames = value.split(",");
        List<Field> fields = new ArrayList<>();
        for (var fieldName : fieldsNames){
            fields.add(new Field(fieldName));
        }
        return fields;
    }
}
public class VisaController {
    static public List<Field> getVisaFields(Country country){
        return VisaDAO.getFields(country);
    }
}
