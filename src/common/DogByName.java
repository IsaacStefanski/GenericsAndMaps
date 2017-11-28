package common;

import java.util.Comparator;

/**
 *
 * @author Isaac
 */
public class DogByName implements Comparator<Dog>{
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.getName().compareTo(d2.getName());
    }
}