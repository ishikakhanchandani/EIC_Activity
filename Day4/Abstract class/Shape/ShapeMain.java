import java.util.*;
import java.text.DecimalFormat;


public class ShapeMain{

    private static final DecimalFormat df = new DecimalFormat("0.00");

 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Enter the Shape:");
        String Shape = s.nextLine();
        if(Shape.equalsIgnoreCase("circle")){
            System.out.println("Enter the radius:");
            int radius = s.nextInt();
            Circle circle = new Circle();
            circle.setValue(radius);
            System.out.println(df.format(circle.calculateArea()));


        }
       else if(Shape.equalsIgnoreCase("square")){
            System.out.println("Enter the side:");
            int side = s.nextInt();
            Square square = new Square();
            square.setValue(side);
            System.out.println(df.format(square.calculateArea()));
            
        }
        else{
            System.out.println("Invalid Input:");
            System.exit(0);
        }
 }

}