package common;

import java.util.Objects;

/**
 *
 * @author Instlogin
 */
public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private String rabiesId;

    public Dog(String name, int age, String rabiesId) {
        this.name = name;
        this.age = age;
        this.rabiesId = rabiesId;
    }
    
    @Override
    public int compareTo(Dog target) {
        return this.getRabiesId().compareTo(target.getRabiesId());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.rabiesId);
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
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rabiesId, other.rabiesId)) {
            return false;
        }
        return true;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public String toString() {
        return rabiesId + " " + name + ", age " + age;
    }
}