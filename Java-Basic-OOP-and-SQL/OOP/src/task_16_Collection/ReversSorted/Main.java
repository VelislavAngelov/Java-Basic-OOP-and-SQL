package task_16_Collection.ReversSorted;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(6);
        Square square1 = new Square(7);
        Square square2 = new Square(5);
        Square square3 = new Square(4);
        Square square4 = new Square(8);
        Square square5 = new Square(3);
        Square square6 = new Square(4);

        List<Square> squareList=new ArrayList<>();
        TreeSet<Square> squareTreeSet=new TreeSet<>(new ReversSorter());
        squareTreeSet.add(square1);
        squareTreeSet.add(square2);
        squareTreeSet.add(square3);
        squareTreeSet.add(square4);
        squareTreeSet.add(square5);

        squareList.add(square1);
        squareList.add(square2);
        squareList.add(square3);
        squareList.add(square4);
        squareList.add(square5);

        for (Square sq:squareList){

            System.out.println("ArrayList: "+sq.getWidth());
        }
        squareList.sort(new ReversSorter());
        System.out.println();
        for (Square sq:squareList){

            System.out.println("ArrayList: "+sq.getWidth());
        }
        System.out.println();
        for (Square sq:squareTreeSet){

            System.out.println("TreeSet: "+sq.getWidth());
        }

    }
}
