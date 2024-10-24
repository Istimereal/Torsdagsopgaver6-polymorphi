package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
String course;
   private ArrayList<String> canTeach = new ArrayList<String>();
   private ArrayList<String> currentCourses = new ArrayList<String>();
    public Teacher(String name, ArrayList<String> canTeach ) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();

    }
    @Override
    public boolean addCourse(){

        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }
        else{return false;}
    }

}
