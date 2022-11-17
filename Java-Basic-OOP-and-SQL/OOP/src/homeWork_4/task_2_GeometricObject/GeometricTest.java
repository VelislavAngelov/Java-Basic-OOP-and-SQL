package homeWork_4.task_2_GeometricObject;

public class GeometricTest {
    // Напишете interface GeometricObject с абстрактни методи - getArea() - getPerimeter()
    // Напишете класове Circle - с атрибут radius - методи toString, getArea(), getPerimeter() Rectangle който го имплементират
    // - с атрибути width, length - методи toString, getArea(), getPerimeter()
    // Напишете програма която създава два обекта от тип GeometricObject.
    // Единия да е Circle, а другия Rectangle.
    // Вие си избирете стойности на които да инициализирате атрибутите им.
    // Изведете в конзолата areа и perimeter на двата обекта.
    // - Сега добавете и интерфейс Resizable който има абстрактен метод resize(int percent).
    // - Добавете клас ResizableCircle който наследява Circle и имплементира Resizable.
    // Нека имплементацията на метода resize да увеличава радиуса с percent.
    // Демонтстрирайте работата на тази функционалност в main метода.

    public static void main(String[] args) {

        GeometricObject circle= new Circle(5);
        GeometricObject rectangle= new Rectangle(6,7);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        ResizableCircle resizable = new ResizableCircle(5.5);
        System.out.println(resizable.getRadius());
        resizable.resize(2);
        System.out.println(resizable.getRadius());
    }
}
