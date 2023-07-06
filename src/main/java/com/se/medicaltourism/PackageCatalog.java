package com.se.medicaltourism;
import com.se.medicaltourism.model.Field;
import com.se.medicaltourism.model.Package;
import com.se.medicaltourism.model.Template;
import com.se.medicaltourism.utils.SearchFilter;

import java.util.List;
import java.util.Map;

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

    public List<Field> getPackageFields(int packageId){
        var filter = new SearchFilter(Map.of("uid",String.valueOf(packageId)) );
        var result = getRecords(filter).get(0);
        var template = new Template(result.getTemplateId());
        return template.getFields();
    }
}
