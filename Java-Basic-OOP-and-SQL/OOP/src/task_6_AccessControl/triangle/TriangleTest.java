package task_6_AccessControl.triangle;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1=Double.parseDouble(scanner.nextLine());
        double side2=Double.parseDouble(scanner.nextLine());
        double angle=Double.parseDouble(scanner.nextLine());

        Triangle triangle = new Triangle(side1,side2,angle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);
    }
}
