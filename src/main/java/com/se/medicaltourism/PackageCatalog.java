package com.se.medicaltourism;
import com.se.medicaltourism.BaseCatalog;
import com.se.medicaltourism.model.Package;
import com.se.medicaltourism.ItemDAO;
import com.se.medicaltourism.utils.SearchFilter;

import java.util.List;

public class PackageCatalog extends BaseCatalog {
    private List<Package> records;
    private ItemDAO dao;
    public PackageCatalog(){
        dao = new ItemDAO();
        records = dao.init(Package.class);
    }
    public List<Package> getRecords(SearchFilter sf){
        var result = dao.select(records, sf);
        return result;
    }
}
