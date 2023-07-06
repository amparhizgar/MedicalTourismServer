package com.se.medicaltourism.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class TemplateDao{
    static private final String filesDir = "src/test/resource/templates/";
    static private String getPath(String uid){
        return filesDir + uid + ".txt";
    }
    static public List<Field> getFields(String uid) throws IOException {
        var path = getPath(uid);
        String text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        var names = text.split(",");
        List<Field> result = new ArrayList<>();
        for (var name : names){
            result.add( new Field(name) );
        }
        return result;
    }
}
public class Template {
    public Template(String uid) {
        this.uid = uid;
    }

    String uid;

    public List<Field> getFields(){
        try {
            return TemplateDao.getFields(uid);
        }
        catch(IOException e){
            return null;
        }
    }

}
