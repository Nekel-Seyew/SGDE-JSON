/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgde.json;

/**
 *
 * @author Nekel
 */
public class JsonString implements JsonType{

    String data;
    
    @Override
    public String toString(){
        return data;
    }
    
    @Override
    public String toString(int spaces) {
        return generateTabs(spaces)+data;
    }
    private String generateTabs(int tabs){
        String s="";
        for(int i=0; i<tabs; i++){
            s+="\t";
        }
        return s;
    }
    
    public String getData(){
        return data;
    }

    @Override
    public <T> T getData(Class<T> type) {
        return type.cast(data);
    }
}
