package com.se.medicaltourism.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.se.medicaltourism.model.BaseModel;

import javax.management.ReflectionException;

public class csv<T> {
    private static final Logger LOGGER = Logger.getLogger( "MedicalTourism" );

    public static List<HashMap<String,String> > importInstances(String filePath) {
        List<HashMap<String,String> > packages = new ArrayList<>();
        LOGGER.log(Level.INFO, " reading csv from :{0}", filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String csvSplitBy = ",";

            // Skip the header line if it exists
            var headerLine = br.readLine();
            var headers = headerLine.split(csvSplitBy);
            LOGGER.log(Level.INFO, " header :{0}", headers);

            while ((line = br.readLine()) != null) {
                String[] lineData = line.split(csvSplitBy);
                var newRecord = new HashMap<String,String >();

                for(int i = 0; i < headers.length; i+=1){
                    var key = headers[i];
                    var value = lineData[i];
                    newRecord.put(key, value);
                }

                LOGGER.log(Level.INFO, " new record {0}", newRecord);
                packages.add(newRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return packages;
    }

    public List<T> importObjects(String filePath, Function<Map<String, String>, T> mapper) {
        List<T> instances = new ArrayList<>();
        var instancesData = csv.importInstances(filePath);
        for (var iter : instancesData) {
            var newInstance = mapper.apply(iter);
            instances.add(newInstance);
        }
        return instances;
    }

    public List<T> importObjects(Class<BaseModel> cls)  {
        try {
            List<T> instances = new ArrayList<>();
            var instancesData = csv.importInstances(cls.getField("filePath").toString());
            var mapper = cls.getMethod("makeFromMap");
            for (var iter : instancesData) {
                var newInstance = (T) mapper.invoke(iter);
                instances.add(newInstance);
            }
            return instances;
        }

        catch (Exception e) { throw null; }


    }

    public static void main(String[] args) {
//        String filePath = "test/resource/packages.csv";
//        var instances = Package.importObjects();
//        List<Package> importedPackages = csv.importInstances(filePath);

        // Do further processing with the imported packages
//        for (Package pkg : importedPackages) {
//
//        }
    }
}
