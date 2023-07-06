package com.se.medicaltourism;

import com.se.medicaltourism.model.Residence;
import com.se.medicaltourism.utils.SearchFilter;

import java.util.List;

public class ResidenceCatalog extends BaseCatalog{
    private List<Residence> records;
    private ItemDAO dao;
    public ResidenceCatalog(){
        dao = new ItemDAO();
        records = dao.init(Residence.class);
    }

    public List<Residence> getRecords(SearchFilter sf){
        var result = dao.select(records, sf);
        return result;
    }
}
