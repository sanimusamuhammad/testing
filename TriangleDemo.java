
import java.util.Scanner;
/**
 * Lab06 Assignment4
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class TriangleDemo
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the sides of the Triangle\n First Side: ");
       int firstSide = input.nextInt();
       
       System.out.println("Second Side: ");
       int secondSide = input.nextInt();
       
       System.out.println("Third Side: ");
       int thirdSide = input.nextInt();
       
       Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
       
       System.out.println("The Perimter of the Triangle is: " + triangle.getPerimeter());
       System.out.println("The Area of the Triangle is: " + triangle.getArea());
       System.out.println("The Longest side of the Triangle is: " + triangle.hypotenus);
       System.out.println("The Shortest side of the Triangle is: " + triangle.shortestSide);
       System.out.println("The remainder is: " + triangle.getRatio());
   }
}
