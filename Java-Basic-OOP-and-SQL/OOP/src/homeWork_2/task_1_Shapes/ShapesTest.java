package homeWork_2.task_1_Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {

    //В задачата Shapes от предишното домашно, добавете класове Circle и Triangle с необходимите за тях атрибути т.
    // че да е възможно смятането на лицето и периметъра им.
    //В ShapesTest class създайтe обекти от тип Shape които да са инстанции на Circle, Rectangle, Square, Triangle съответно.
    //Използвайте instanceof оператора за да направите следните проверки: Ако обектът е кръг тогава принтирайте
    // “Кръг с радиус: Х” Ако обектът е правоъгълник тогава принтирайте “Правоъгълник с височина Х и широчина У”
    // Ако обектът е квадрат тогава принтирайте “Квадрат” Ако обектът е триъгълник тогава принтирайте “Правоъгълен/Тъпоъгълен/Остроъгълен
    // Триъгълник със страни a,b,c, и ъгли alpha, beta, gama.” (*Ако е правоъгълен не извеждайте и остроъгълен.)
    //Сега в Circle добавете и метод getDiameter() който изчислява диаметъра на кръга.
    // В ShapesTest класа към изхода в случай на кръг добавете и диаметъра. т.е. Когато дадения обект е кръг тогава да се извежда
    // “Кръг с радиус: Х и диаметър D”
    //В класът Rectangle добавете метод getMaxPossibleSquareInside() който ще връщат страната на най-големия възможен
    // (т.е. с най-голяма страна) квадрат който се събира в правъгълника.
    // Сега в ShapesTest в случая когато обектът е правоъгълник добавете в изхода и страната на най-големия възможен квадрат
    // който се събира в правоъгълника. т.е. примерен изход: “Правоъгълник с височина Х и широчина У” .
    // Страната на най-големия квадрат който се събира в правоъгълника е: "

    public static void main(String[] args) {

        List<Shapes> shapesList = new ArrayList<>();

        Shapes shape1 = new Circle(5);
        Shapes shape2 = new Rectangle(4, 5);
        Shapes shape3 = new Rectangle(7, 9);
        Shapes shape4 = new Square(6);
        Shapes shape5 = new Triangle(5, 5, 5, 60, 60, 60);
        Shapes shape6 = new Triangle(5, 6, 7, 120, 40, 30);
        shapesList.add(shape1);
        shapesList.add(shape2);
        shapesList.add(shape3);
        shapesList.add(shape4);
        shapesList.add(shape5);
        shapesList.add(shape6);
        int count=0;
        for (Shapes shapes : shapesList) {
            count++;
            System.out.printf("%d: ",count);
            if (shapes instanceof Circle) {
                System.out.printf("Кръг с радиус: %.2f  и диаметър: %.2f\n", ((Circle) shapes).getRadius(), ((Circle) shapes).getDiameter());

            }
            if (shapes instanceof Rectangle && ((Rectangle) shapes).getHeight() != 0) {
                System.out.printf("Правоъгълник с височина: %.2f и широчина: %.2f." +
                                " Страната на най-големия квадрат който се събира в правоъгълника е: %.2f\n"
                        , ((Rectangle) shapes).getHeight(), ((Rectangle) shapes).getWidth(), ((Rectangle) shapes).getMaxPossibleSquareInside());
            }
            if (shapes instanceof Square) {

                System.out.printf("Квадрат с страна: %.2f\n", ((Square) shapes).getWidth());
            }
            if (shapes instanceof Triangle) {
                if (((Triangle) shapes).getAngle1() < 90) {

                    System.out.println("Остроъгълен триъгълник");
                }
                if (((Triangle) shapes).getAngle1() == 90) {

                    System.out.println("Правоъгълен триъгълник");
                }
                if (((Triangle) shapes).getAngle1() > 90) {

                    System.out.printf("Тъпоъгълен триъгълник със страни a = %.2f, b = %.2f, c = %.2f, и ъгли alpha = %.2f, beta = %.2f, gama = %.2f.\n"
                            , ((Triangle) shapes).getSide1(), ((Triangle) shapes).getSide2(), ((Triangle) shapes).getSide3(),
                            ((Triangle) shapes).getAngle1(), ((Triangle) shapes).getAngle2(), ((Triangle) shapes).getAngle3());
                }
            }
        }
    }
}
