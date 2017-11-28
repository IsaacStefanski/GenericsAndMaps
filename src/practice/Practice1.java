/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Isaac
 */
public class Practice1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        
        map.put("FirstName", "John");
        map.put("LastName", "Smith");
        map.put("Birthday", new Date());
        map.put("Age", 21);
        
        Collection<Object> values = map.values();
        for(Object o : values){
            System.out.println(o);
        }
    }
}