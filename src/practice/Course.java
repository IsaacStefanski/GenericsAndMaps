package practice;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Isaac
 */
public class Course implements Comparable<Course> {
    private String courseNum;
    private String courseName;
    private double credits;

    public Course(String courseNum, String courseName, double credits) {
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.credits = credits;
    }

    @Override
    public int compareTo(Course target) {
        return new CompareToBuilder()
                        .append(this.courseNum, target.courseNum)
                        .toComparison();
    }
        
//        if(this.getCourseNum() < target.getCourseNum()){
//            result = LESSTHAN;
//        } else if(this.getCourseNum() > target.getCourseNum()){
//            result = GREATERTHAN;
//        }
//        else {
//            result = EQUAL;
//        }
//        
//        return result;
//  }
    
    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.courseNum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseNum, other.courseNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + "courseNum=" + courseNum + ", courseName=" + courseName + ", credits=" + credits + '}';
    }

    private Object append(String courseNum, String courseNum0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}