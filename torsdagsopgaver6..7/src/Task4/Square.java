package Task4;

public class Square implements Shape {
private double length;

Square(double length){

    this.length = length;
}
    @Override
    public double getArea(){

        return length*length;
    }

}
