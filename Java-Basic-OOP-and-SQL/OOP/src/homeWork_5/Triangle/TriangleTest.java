package homeWork_5.Triangle;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1;
        double side2;
        double angle;
        try {
            System.out.println("Въведи страните на триъгълника:");
             side1=Double.parseDouble(scanner.nextLine());
             side2=Double.parseDouble(scanner.nextLine());
             angle=Double.parseDouble(scanner.nextLine());

        } catch (IllegalArgumentException iae){
            throw new IllegalArgumentException("Invalid input");
        }

        Triangle triangle = new Triangle(side1,side2,angle);
        System.out.println("Area:");
        System.out.println(triangle.getArea());
        System.out.println();
        System.out.println("Perimeter:");
        System.out.println(triangle.getPerimeter());
        System.out.println();
        System.out.println(triangle);
    }
}
