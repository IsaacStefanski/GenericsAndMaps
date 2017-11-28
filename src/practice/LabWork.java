package practice;

import common.Movie;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Isaac
 */
public class LabWork {
    public static void main(String[] args) {
        Movie m1 = new Movie("Skyfall", "Sam Mendes", "123");
        Movie m2 = new Movie("Star Wars", "George Lucas", "456");
        Movie m3 = new Movie("Star Trek", "JJ Abrams", "789");
        Movie m4 = new Movie("Indiana Jones", "Steven Spielberg", "789");
        
        Map<String, Movie> movieMap = new HashMap<>();
        
        movieMap.put("Skyfall", m1);
        movieMap.put("Star Wars", m2);
        movieMap.put("Star Trek", m3);
        movieMap.put("Indiana Jones", m4);
        
        Collection<Movie> movies = movieMap.values();
        
        System.out.println("*****Print values from HashMap*****");
        for(Movie m : movies){
            System.out.println(m);
        }
        
        Map<String, Movie> movieMap2 = new TreeMap<>();
        
        movieMap2.put("Skyfall", m1);
        movieMap2.put("Star Wars", m2);
        movieMap2.put("Star Trek", m3);
        movieMap2.put("Indiana Jones", m4);
        
        Set<String> keys = movieMap2.keySet();
        
        System.out.println("\n*****Print keys from TreeMap*****");
        for(String key : keys){
            System.out.println(key);
        }
        
        Set<Movie> set = new TreeSet<>();
        
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        
        System.out.println("\n*****Print movies from TreeSet*****");
        for(Movie m : set){
            System.out.println(m);
        }
    }
}