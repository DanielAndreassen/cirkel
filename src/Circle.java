import java.util.ArrayList;
import java.util.Scanner;

public class Circle {
    //att
    double radius = 1.0;
    double area;

    double circumference;

    //const
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //meth
    ArrayList<Circle> list = new ArrayList<Circle>();
    public void create() { //make new amount of circles depending on user input.
        Scanner myScan = new Scanner(System.in);
        int ans = myScan.nextInt();
        for (int i = 0; i <= ans; i++) {
            double z = myScan.nextDouble();
            Circle x = new Circle(z);
            list.add(x);
        }
    }

    public void print(){// Method to print circles, dont know how to do it.
        for (int i = 0; i<list.size();i++ ){
            System.out.println("Circle" + i + "area= "+ list.get(i));
        }
    }




    //getset

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        double are = Math.PI*(radius * radius);
        return are;
    }

    public double getCircumference(double radius) {
        double circ = (2*radius)*Math.PI;
        return circ;
    }


    /*
    Ska inte ljuga vet inte vad denna gör, antar att det har något med hur Cirkeln skrivs ut.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
        //return super.toString();
    }
}
