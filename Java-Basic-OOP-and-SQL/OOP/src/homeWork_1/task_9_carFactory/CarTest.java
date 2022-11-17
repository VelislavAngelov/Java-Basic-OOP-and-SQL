package homeWork_1.task_9_carFactory;

import java.util.*;

public class CarTest {
    //Направете следните модификации в задачата “Фабрика за коли” от урок 8 в StartIT
    //Добавете класа Engine който да представлява двигателя на колата.
    //Двигателят има модел, мощност, обем и тип(дизел, бензин, хибридили електрическа).
    //Направете необходимите модификации в програмата т. че да удовлетворява следните условия:
    //Преди да започнете да произвеждате коли, трябва да произведете двигателите и да им зададете стойности на полетата – поне по 1 от всеки тип.
    //След това в класа трябва да прочетете число N, обозначаващо броят на колите, които трябва да произведете за деня.
    //Всяка втора кола, трябва да бъде оборудвана с поне 2 екстри, като ако има климатик цената на колата трябва да се увеличи с 1500лв,
    // Навигация – 500лв., Темпомат – 350лв., Автоматик – 3000лв. и ел. стъкла – 250лв.
    //Всяка произведена кола трябва пазиреференция към своя двигател.
    //След като завърши производството на колите, трябва да изкарате на конзолата следната статистика:
    // -Брой произведени коли за деня-Обща стойност на произведените коли
    // -Колко коли са произведени с екстри?
    // -Колко коли са произведени с различните типове двигатели?
    // -Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им,
    // като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras”

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Engine> engineList = new ArrayList<>();
        Engine engine1 = new Engine("ADR", 92, 1800, "бензин");
        Engine engine2 = new Engine("ADD", 115, 2800, "дизел");
        Engine engine3 = new Engine("ADH", 100, 1100, "хибрид");
        Engine engine4 = new Engine("ADE", 150, 1800, "електрически");
        engineList.add(engine1);
        engineList.add(engine2);
        engineList.add(engine3);
        engineList.add(engine4);

        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("WV", "Passat", "Sedan", "red", 4.01, 1.88, 1758, 25000);
        Car car2 = new Car("Ford", "Focus", "Cabriolet", "blue", 4.44, 1.48, 1558, 35000);
        Car car3 = new Car("Fiat", "Punto", "Hatchback", "green", 3.01, 1.68, 1358, 45000);
        Car car4 = new Car("Tesla", "Model3", "SUV", "orange", 3.01, 1.68, 1358, 55000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        List<List<String>> listExtras = new ArrayList<>();
        List<String> ext1 = new ArrayList<>();
        ext1.add("Kлиматик");
        ext1.add("Навигация");
        ext1.add("Автоматик");
        List<String> ext2 = new ArrayList<>();
        ext2.add("Темпомат");
        ext2.add("Eл. стъкла");
        listExtras.add(ext1);
        listExtras.add(ext2);

        ArrayList<Car> carFactory = new ArrayList<>();
        Random random = new Random();
        System.out.println("Въведи брой коли:");
        int count = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= count; i++) {

            int indexCar = random.nextInt(cars.size());
            int indexEngine = random.nextInt(engineList.size());
            Car car = new Car();
            car.setBrand(cars.get(indexCar).getBrand());
            car.setModel(cars.get(indexCar).getModel());
            car.setBodyType(cars.get(indexCar).getBodyType());
            car.setColor(cars.get(indexCar).getColor());
            car.setLength(cars.get(indexCar).getLength());
            car.setWidth(cars.get(indexCar).getWidth());
            car.setWeight(cars.get(indexCar).getWeight());
            car.setPrice(cars.get(indexCar).getPrice());
            car.setEngine(engineList.get(indexEngine));

            if (i % 2 == 0) {
                int indexExtras = random.nextInt(listExtras.size());
                car.setExtras(listExtras.get(indexExtras));
            }
            carFactory.add(car);
        }
        System.out.printf("Брой произведени коли за деня: %d\n", carFactory.size());
        System.out.printf("Обща стойност на произведените коли: %.2f\n", priceCars(carFactory));
        System.out.printf("Брой произведените коли с екстри: %d\n", extrasCars(carFactory));
        engineTypeCars(carFactory);
       // System.out.println();
        for (Car car : carFactory) {

            System.out.println(car);
        }
    }

    public static double priceCars(ArrayList<Car> car) {
        double price = 0;
        for (Car prices : car) {

            price += prices.getPrice();

        }
        return price;
    }

    public static int extrasCars(ArrayList<Car> car) {
        int ext = 0;
        for (Car cars : car) {

            if (cars.getExtras().size() != 0) {

                ext++;
            }
        }
        return ext;
    }

    public static void engineTypeCars(ArrayList<Car> car) {
        int gas = 0;
        int diesel = 0;
        int hybrid = 0;
        int electric = 0;
        for (Car cars : car) {


            if (Objects.equals(cars.getEngine().getEngineType(), "бензин")) {

                gas++;
            }
            if (Objects.equals(cars.getEngine().getEngineType(), "дизел")) {

                diesel++;
            }
            if (Objects.equals(cars.getEngine().getEngineType(), "хибрид")) {

                hybrid++;
            }
            if (Objects.equals(cars.getEngine().getEngineType(), "електрически")) {

                electric++;
            }

        }
        System.out.println("Колко коли са произведени с различните типове двигатели:");
        System.out.printf("бензин: %d, дизел: %d, хибрид: %d, електрически: %d\n", gas, diesel, hybrid, electric);


    }

}
