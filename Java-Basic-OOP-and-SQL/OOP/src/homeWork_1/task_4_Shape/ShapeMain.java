package homeWork_1.task_4_Shape;

public class ShapeMain {

    //Създайте клас Shape, който дефинира следните методи - getArea(), getPerimeter(), които връщат 0.
    //Създайте клас Rectangle, който наследява Shape и има атрибути width, height, конструктор,
    // който приема width & height параметри, има getter & setter методи.
    //Направете клас Square, който наследява Rectangle. Помислете какъв конструктор ще има този клас.
    //Направете програма TestShapes, която илюстрира използването им и правилната работа на getArea() и getPerimeter() методите.
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 6);
        Square square = new Square(8);

        System.out.printf("Rectangle area: %.2f\n", rectangle.getArea());
        System.out.printf("Rectangle perimeter: %.2f\n", rectangle.getPerimeter());
        System.out.println();
        System.out.printf("Square area: %.2f\n", square.getArea());
        System.out.printf("Square perimeter: %.2f\n", square.getPerimeter());

    }
}
