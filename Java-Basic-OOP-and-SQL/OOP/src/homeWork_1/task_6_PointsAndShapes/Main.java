package homeWork_1.task_6_PointsAndShapes;

import java.util.Scanner;

public class Main {

    //Дефинирайте клас Point който е Java Bean.
    //Класът Point символизира точка в равнината с координати x, у.
    //Създайте клас Line който е Java Bean и симоволизира права в равнината.
    // (Както е известно то математика всяка една права се определя от две точки. Използвайте този факт във вашата програма).
    //Използвайте уравнението на права в равнината g: Ax +By + C = 0.
    //Напишете програма която: * Чете от конзолата 2 точки които определят правата line1.
    // * Чете от конзолата 2 точки които определят правата line2.
    // * Помислите как да валидирате входните данни където има нужда т. че правата да има за дължина някаква положително число.
    // * Показва взаимното положение на двете прави - пресичащи се, перпендикуларни, успоредни, съвпадащи.
    // (Потърсете формулите за взаимно положение на две прави.)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Line line1=new Line();
        Line line2=new Line();
        Point line1StartPoint=new Point();
        Point line2StartPoint=new Point();
        Point line1EndPoint=new Point();
        Point line2EndPoint=new Point();

        System.out.println("Please enter coordinates for start point  for the Line 1:");
        System.out.print("X1: ");
        line1StartPoint.setX(Double.parseDouble(scanner.nextLine()));
        System.out.print("Y1: ");
        line1StartPoint.setY(Double.parseDouble(scanner.nextLine()));
        System.out.println("Please enter coordinates for end point  for the Line 1:");
        System.out.print("X2: ");
        line1EndPoint.setX(Double.parseDouble(scanner.nextLine()));
        System.out.print("Y2: ");
        line1EndPoint.setY(Double.parseDouble(scanner.nextLine()));

        System.out.println("Please enter coordinates for start point  for the Line 2:");
        System.out.print("X1: ");
        line2StartPoint.setX(Double.parseDouble(scanner.nextLine()));
        System.out.print("Y1: ");
        line2StartPoint.setY(Double.parseDouble(scanner.nextLine()));
        System.out.println("Please enter coordinates for end point for the Line 2:");
        System.out.print("X2: ");
        line2EndPoint.setX(Double.parseDouble(scanner.nextLine()));
        System.out.print("Y2: ");
        line2EndPoint.setY(Double.parseDouble(scanner.nextLine()));

        line1.setStartPoint(line1StartPoint);
        line1.setEndPoint(line1EndPoint);
        line2.setStartPoint(line2StartPoint);
        line2.setEndPoint(line2EndPoint);

        double x=(Math.abs(line1.getEquation().get("x"))+1)/(Math.abs(line2.getEquation().get("x"))+1);
        double y=(Math.abs(line1.getEquation().get("y"))+1)/(Math.abs(line2.getEquation().get("y"))+1);
        double c=(Math.abs(line1.getEquation().get("c"))+1)/(Math.abs(line2.getEquation().get("c"))+1);

        System.out.println(line1.getEquation());
        System.out.println(line2.getEquation());

        if(x!=y){
            if(line1.getEquation().get("x")*line2.getEquation().get("x")+
                    line1.getEquation().get("y")*line2.getEquation().get("y")==0){
                System.out.println("Two lines are perpendicular!");
            }
            else{
                System.out.println("Two lines cross each other but they are not perpendicular!");
            }
        }
        else if(x==y&&x!=c){
            System.out.println("Two lines are parallel!");
        }
        else{
            System.out.println("Two lines has same coordinates");
        }
    }
}
