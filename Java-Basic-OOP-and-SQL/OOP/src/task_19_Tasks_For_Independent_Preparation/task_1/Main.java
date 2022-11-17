package task_19_Tasks_For_Independent_Preparation.task_1;

public class Main {

    //В лекциите на няколко пъти дадохме пример с класът Employee.
    // В това упражнение трябва да направите нов интерфейс Measurable с метод double getMeasure(),
    // като този метод измерва обект по някакъв начин.
    //
    //Направете Employee да имплементира Measurable.
    //
    //Направете клас Measurables и добавете метод double average(Measurable[] objects)
    // който изчислява средно аритметично на подадените обекти. Използвайте го за да изчислите средната заплата на служителите.
    //
    //Към Measurables класа, добавете и метод Measurable largest(Measurable[] objects).
    // Използвайте този метод да откриете служителя с най-голяма заплата. Отпечатайте името на служителя.

    public static void main(String[] args) {


        Measurable emp1 = new Employee("Ivan", "Ivanov", 1500);
        Measurable emp2 = new Employee("Petar", "Petrov", 2000);
        Measurable emp3 = new Employee("Asen", "Asenov", 2750);
        Measurable emp4 = new Employee("Boiko", "Borisov", 3125);
        Measurable[] obj = {emp1, emp2, emp3, emp4};

        Measurables measurables = new Measurables();
        System.out.println("Average salary: " + measurables.average(obj));
        System.out.println("Employee largest salary: " + measurables.largest(obj));

        System.out.println("Salary: "+Measurable.getMeasure(obj));

        //System.out.println(.getMeasure());
    }
}
