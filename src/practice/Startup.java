package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
        Course c1 = new Course("22", "Advanced Java", 4.0);
        Course c2 = new Course("11", "Intro to Java", 4.0);
        Course c3 = new Course("44", "Distributed Java", 4.0);
        
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        
        Collections.sort(courses, new CourseByName());

        Course[] cArray = {c1, c2, c3};
        Arrays.sort(cArray);
        
        for(Course c : cArray){
            System.out.println(c);
        }
        
//        Map<String, Course> courses = new HashMap<>();
//        courses.put("Fav", c1);
//        courses.put("Simple", c2);
//        courses.put("Web", c3);
//        
//        Set<String> keyset = courses.keySet();
//        for(String key : keyset) {
//            System.out.println(key);
//        }
//        
//        Collection<Course> col = courses.values();
//        List<Course> list = new ArrayList<>(col);
//        Collections.sort(list);
//        
//        for(Course c : list){
//            System.out.println(c);
//        }
//        
//        List<Course> courses = new ArrayList<>();
//        courses.add(c1);
//        courses.add(c2);
//        courses.add(c3);
//        
//        System.out.println("Unsorted list");
//        for(Course c : courses){
//            System.out.println(c);
//        }
//        
//        Set<Course> set = new TreeSet<>(courses);
//        courses = new ArrayList<>(set);
//        
//        System.out.println("Sorted list");
//        for(Course c : courses){
//            System.out.println(c);
//        }       
    }
}