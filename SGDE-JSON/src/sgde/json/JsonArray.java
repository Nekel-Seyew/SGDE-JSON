/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgde.json;

import java.util.ArrayList;

/**
 *
 * @author Nekel
 */
public class JsonArray implements JsonType{

    ArrayList<JsonType> data;
    
    public JsonType getData(int i){
        return data.get(i);
    }
    public void add(JsonType data){
        this.data.add(data);
    }
    public void add(JsonType data, int i){
        this.data.add(i, data);
    }
    public JsonType remove(int i){
        return this.data.remove(i);
    }
    public boolean remove(JsonType data){
        return this.data.remove(data);
    }
    
    @Override
    public String toString(){
        String s="[";
        for(JsonType t : data){
            s+=t.toString()+",";
        }
        s = s.substring(0, s.length()-1);
        s += "]";
        return s;
    }
    /**
     * Use this for a nice, nested, expanded readable format. 
     * @param spaces The number of tabs to start with when expanding
     * @return 
     */
    @Override
    public String toString(int spaces) {
        String s=generateTabs(spaces)+"[";
        for(JsonType t : data){
            s+=generateTabs(spaces+1)+t.toString(spaces+2)+",";
        }
        s = s.substring(0, s.length()-1);
        s +=generateTabs(spaces)+"]";
        return s;
    }
    private String generateTabs(int tabs){
        String s="";
        for(int i=0; i<tabs; i++){
            s+="\t";
        }
        return s;
    }
//    public double getData(){
//        return data;
//    }

    @Override
    public <T> T getData(Class<T> type) {
        return type.cast(data);
    }
    
}
