package task_6_AccessControl.carFactory;

import java.util.*;

public class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
        Car car1=new Car("WV","Passat","Sedan","red",4.01,1.88,1758,"бензин",25000);
        Car car2=new Car("Ford","Focus","Hatchback","blue",4.44,1.48,1558,"дизел",35000);
        Car car3=new Car("Fiat","Punto","Cabriolet","green",3.01,1.68,1358,"хибрид",45000);
        ArrayList<Car> cars =new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);



        System.out.println("Въведи брой коли:");
        int count= Integer.parseInt(scanner.nextLine());
        ArrayList<Car>carFactory= new ArrayList<>();
        Random random= new Random();

        for (int i = 1; i <= count; i++) {

            int indexCar = random.nextInt(cars.size());
            Car car=new Car();
            car.setBrand(cars.get(indexCar).getBrand());
            car.setModel(cars.get(indexCar).getModel());
            car.setBodyType(cars.get(indexCar).getBodyType());
            car.setColor(cars.get(indexCar).getColor());
            car.setLength(cars.get(indexCar).getLength());
            car.setWidth(cars.get(indexCar).getWidth());
            car.setWeight(cars.get(indexCar).getWeight());
            car.setEngineType(cars.get(indexCar).getEngineType());
            car.setPrice(cars.get(indexCar).getPrice());


            if(i%2==0){

                int indexExtras = random.nextInt(listExtras.size());
                car.setExtras(listExtras.get(indexExtras));
            }
            carFactory.add(car);
        }

        System.out.printf("Брой произведени коли за деня: %d\n",count);
        System.out.printf("Обща стойност на произведените коли: %.2f\n",priceCars(carFactory));
        System.out.printf("Брой произведените коли с екстри: %d\n",extrasCars(carFactory));

        engineTypeCars(carFactory);
        System.out.println();
        for (Car car11:carFactory){

            System.out.println(car11);
        }



    }
    public static double priceCars(ArrayList<Car> car){
        double price=0;
        for (Car prices:car){

            price+=prices.getPrice();

        }
        return price;
    }
    public static int extrasCars(ArrayList<Car> car){
        int ext=0;
        for (Car cars:car){

            if(cars.getExtras()!=null){

                ext++;
            }

        }
        return ext;
    }
    public static void engineTypeCars(ArrayList<Car> car){
        int gas=0;
        int diesel=0;
        int hybrid=0;
        int electric=0;
        StringBuilder sb = new StringBuilder();
        for (Car cars:car){

            if(Objects.equals(cars.getEngineType(), "бензин")){

                gas++;
            }
            if(Objects.equals(cars.getEngineType(), "дизел")){

                diesel++;
            }
            if(Objects.equals(cars.getEngineType(), "хибрид")){

                hybrid++;
            }
            if(Objects.equals(cars.getEngineType(), "електрически")){

                electric++;
            }


        }
        System.out.println("Колко коли са произведени с различните типове двигатели:");
        System.out.printf("бензин: %d, дизел: %d, хибрид: %d, електрически: %d",gas,diesel,hybrid,electric);
        sb.append("Колко коли са произведени с различните типове двигатели: ");
        sb.append("бензин: ").append(gas).append("дизел: ").append(diesel)
                .append("хибрид: ").append(hybrid).append("електрически: ").append(electric);

    }

}
