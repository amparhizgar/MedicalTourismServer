package com.se.medicaltourism;

import java.util.ArrayList;
import java.util.List;

import com.se.medicaltourism.utils.SearchFilter;
import com.se.medicaltourism.utils.csv;
import com.se.medicaltourism.model.BaseModel;

public class ItemDAO<Type> {
    public List<Type> init(Class<BaseModel> cls){
        List<Type> results = new ArrayList<Type>();
        csv<Type> reader = new csv<Type>();
        results = reader.importObjects(cls);
        return results;
    }

    public List<BaseModel> select(List<BaseModel> records, SearchFilter filter){
        List<BaseModel> results = new ArrayList<BaseModel>();
        for (var r: records){
            if(r.checkFilter(filter)){
                results.add(r);
            }
        }
        return results;
    }
}
