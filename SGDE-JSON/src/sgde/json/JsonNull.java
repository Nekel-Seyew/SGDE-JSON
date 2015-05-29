/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgde.json;

/**
 *
 * @author Nekel
 */
public class JsonNull implements JsonType{

    @Override
    public String toString(){
        return "null";
    }
    @Override
    public String toString(int spaces) {
        return generateTabs(spaces)+"null";
    }
    
    public Object getData(){
        return null;
    }
    private String generateTabs(int tabs){
        String s="";
        for(int i=0; i<tabs; i++){
            s+="\t";
        }
        return s;
    }

    @Override
    public <T> T getData(Class<T> type) {
        return type.cast(null);
    }
    
}
