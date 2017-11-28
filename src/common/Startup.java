package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Isaac
 */
public class Startup {
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", 3, "A111");
        Dog d2 = new Dog("Spot", 4, "B222");
        Dog d3 = new Dog("Max", 2, "C333");
        Dog d4 = new Dog("Fido", 3, "A111");
        
        Set<Dog> dogs = new TreeSet<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        
        System.out.println("***Part 1: Use TreeSet***");
        for(Dog d : dogs){
            System.out.println(d);
        }
        
        List<Dog> dogList = new ArrayList<>(dogs);        
        Collections.sort(dogList, new DogByName());
        System.out.println("\n***Part 2: Use List Sorted By Name***");
        for(Dog d : dogList){
            System.out.println(d);
        }
        
        Map<String, Dog> dogMap = new TreeMap<>();
        dogMap.put("Fido", d1);
        dogMap.put("Spot", d2);
        dogMap.put("Max", d3);
        
        Collection<Dog> dogCollection = dogMap.values();
        List<Dog> list = new ArrayList<>(dogCollection);
        Collections.sort(list);
        System.out.println("\n***Part 3: Use Default Sort");
        for(Dog d : list){
            System.out.println(d);
        }
        
        Dog[] dogArray = {d1, d2, d3};
        Arrays.sort(dogArray);
        System.out.println("\n***Part 4: Use Array***");
        for(Dog d : dogArray){
            System.out.println(d);
        }
    }
}