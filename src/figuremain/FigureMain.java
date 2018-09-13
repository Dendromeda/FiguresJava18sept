
package figuremain;

import java.util.Scanner;

/**
 *
 * @author Jakob Lundin & Arvid Melinder
 */
public class FigureMain {

    public static Scanner sc = new Scanner(System.in);
    
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            Figure figure = chooseFigure();
            
            calculate(figure);
            
            System.out.println("Do you want to do another calculation? (1 for yes)");
        } while (readNumber() == 1);
    }
    
    /** Lets user choose what type of figure to be created
     *
     * @return figure created of chosen type
     */
    public static Figure chooseFigure(){
        System.out.println("Choose figure:\n1:Circle\n2:Triangle\n3:Rectangle");
        int choice = readNumber();
        Figure figure = null;
        double base, height;
        switch(choice){
                case 1:
                    System.out.print("Enter radius of circle:  ");
                    double radius = sc.nextDouble();
                    figure = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter base and height of triangle:  ");
                    base = sc.nextDouble();
                    height = sc.nextDouble();
                    figure = new Triangle(base, height);
                    break;
                case 3:
                    System.out.print("Enter base and height of rectangle:  ");
                    base = sc.nextDouble();
                    height = sc.nextDouble();
                    figure = new Rektangel(base, height);
                    break;
                default:
                    System.out.println("Not a valid choice, Crashing...");
                    System.exit(0);
                    break;
            }
        return figure;
    }
    
    /** Lets user choose what to be calculated, then prints results
     *
     * @param figure figure to be used in calculation
     */
    public static void calculate(Figure figure){
        System.out.println("Calculate:\n1:Area\n2:Circumference\n3:Both");
            int choice = readNumber();
            switch(choice){
                case 1:
                    System.out.println("Area:" + figure.area());
                    break;
                case 2:
                    System.out.println("Circumference: " + figure.circumference());
                    break;
                case 3:
                    System.out.println("Area:" + figure.area());
                    System.out.println("Circumference: " + figure.circumference());
                    break;
                default:
                    System.out.println("What is wrong with you??");

            }
    }
   
    /** Reads integer from user, returns -1 if no valid value was read
     *
     * @return read number
     */
    public static int readNumber(){
        
        int num;
        try {
            num = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            num = -1;
        }
        return num;
    }
}
