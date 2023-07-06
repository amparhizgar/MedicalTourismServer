package com.se.medicaltourism;

import java.util.ArrayList;
import java.util.List;
import com.se.medicaltourism.utils.csv;
import com.se.medicaltourism.model.BaseModel;

public class ItemDAO<Type> {
    public List<Type> init(Class<BaseModel> cls){
        List<Type> results = new ArrayList<Type>();
        csv<Type> reader = new csv<Type>();
        results = reader.importObjects(cls);
        return results;
    }
}
