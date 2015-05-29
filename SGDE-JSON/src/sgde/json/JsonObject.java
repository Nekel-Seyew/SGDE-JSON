/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgde.json;

import java.util.HashMap;

/**
 *
 * @author Nekel
 */
public class JsonObject implements JsonType{
    HashMap<String, JsonType> data;

    @Override
    public String toString(){
        return "";
    }
    @Override
    public String toString(int spaces) {
        return "";
    }

    private String generateTabs(int tabs){
        String s="";
        for(int i=0; i<tabs; i++){
            s+="\t";
        }
        return s;
    }
    
    public JsonType getData(String name){
        return data.get(name);
    }
    public void setData(String name, JsonType data){
        this.data.put(name, data);
    }
    
    /**
     * This function makes no sense in this instance. It will always return null
     * @return null
     */
    @Override
    public <T> T getData(Class<T> type) {
        return null;
    }
}
