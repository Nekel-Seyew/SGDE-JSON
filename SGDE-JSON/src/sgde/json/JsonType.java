/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgde.json;

/**
 *
 * @author Nekel
 */
public interface JsonType {
    @Override
    public String toString();
    public String toString(int spaces);
    public <T extends Object> T getData(Class<T> type);
}
