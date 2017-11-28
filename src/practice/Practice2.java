package practice;

import common.Dog;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Isaac
 */
public class Practice2 {
    public static void main(String[] args) {
        Map<Dog, String> map = new TreeMap<>();
        
        Dog d1 = new Dog("Fido", 2, "1234");
        Dog d2 = new Dog("Max", 4, "5678");
        Dog d3 = new Dog("Butch", 2, "1234");
        
        map.put(d1, "Fido");
        map.put(d2, "Max");
        map.put(d3, "Butch");
        
        Set<Dog> keys = map.keySet();
        
//        for(Dog key : keys){
//            System.out.println(key);
//        }
        
        Set<Dog> set = new TreeSet<>();
        
        set.add(d1);
        set.add(d2);
        set.add(d3);
        
        for(Dog d: set){
            System.out.println(d);
        }
    }
}