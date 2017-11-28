package practice;

import java.util.Comparator;

/**
 *
 * @author Isaac
 */
public class CourseByName implements Comparator<Course>{
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCourseName().compareTo(o2.getCourseName());
    }
}