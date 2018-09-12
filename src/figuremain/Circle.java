package figuremain;

public class Circle extends Figure{

    private final double PI = 3.14;
    double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        double area = radius * radius * PI;
        return area;
    }

    public double circumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }
    
    
    
}
