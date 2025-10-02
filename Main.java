import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    //problem 1 
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14.0);
    Circle circ3 = new Circle(20.5);
    
    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());

    // problem 2 


    Scanner scanner = new Scanner(System.in);


    System.out.println("type a number for length & width");
    double side = scanner.nextDouble();

    System.out.println("Type a length:");
    double length = scanner.nextDouble();


    System.out.println("Type a width:");
    double width = scanner.nextDouble();

    Rectangle rect1 = new Rectangle (side, side);
    Rectangle rect2 = new Rectangle (length, width);


    System.out.println(rect1.toString());
    System.out.println(rect2.toString());

   

    //problem 3 

    

    System.out.println("Type a sidelength:");

    double sideLength = scanner.nextDouble();

    RegularPolygon triangle = new RegularPolygon(3,sideLength);

    RegularPolygon square = new RegularPolygon(4, sideLength);

    System.out.println(triangle.toString());

    System.out.println(square.toString());

    scanner.close();


  






  }
}
