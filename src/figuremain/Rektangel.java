
package figuremain;


public class Rektangel extends Figure{
    private double height;
    private double base;
    
    public Rektangel(double height, double base){
        this.height = height;
        this.base = base;
    }
    public double area (){
        double area = base * height;
        return area;
    }
    public double circumference (){
        double circumference = base * 2 + height * 2;
        return circumference;
        
    }
}
