package Task3;

import java.util.ArrayList;

public class Student extends Person {
    private String course;

  ArrayList<String> passedCourses = new ArrayList<String>();
  ArrayList<String> currentCourses = new ArrayList<String>();

    public Student(String name, ArrayList<String> passedCourses){

        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<String>();
    }

    @Override
    public boolean addCourse() {

        if(! passedCourses.contains(course)){
          currentCourses.add(course);
          return true;
        }
        else{ return false;
        }
    }
}
