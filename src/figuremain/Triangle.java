package figuremain;

public class Triangle extends Figure{
    private double base;
    private double height;
    
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return (base*height)/2;
    }
    
    public double circumference(){
        double circumference = base;
        circumference += 2*getHypotenuse(base/2, height);
        return circumference;
    }
   
    private double getHypotenuse(double b, double h){
        return Math.sqrt((b*b)+(h*h));
    }
}
