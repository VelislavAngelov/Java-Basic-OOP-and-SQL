package task_8_MathematicalOperations;

public class OvalSquare {
    //Направете програма, която изчислява лице на окръжност по формулата:
    //
    //Дефинирайте променлива r със стойност 10.3. Какъв ще бъде типът на променливата?
    //
    //А сега дефинирайте променлива area - тя ще съдържа резултата.
    //
    //Нека присвоим на area лицето на окръжността с дадения по-горе радиус.
    //
    //Отпечатайте променливата area на екрана със System.out.println().

    public static void main(String[] args) {

        double r = 10.3;
        double area = Math.PI * Math.pow(r,2);

        System.out.println(area);
    }
}
