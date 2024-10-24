package Task3;

public abstract class Person {
    protected String name;
    private String course;

    Person(String name) {

        this.name = name;
    }

public void setName(String name){

    this.name = name;
    }

    public String getName(){

        return name;
    }

    public abstract boolean addCourse();
}
