package homeWork_4.task_1_Cars;

public class MyOwnAutoShop {

    //Създайте клас Car който има следните атрибути и методи
    //speed, regularPrice, color
    //getSalePrice()
    //Създайте клас Truck който наследява Car и има следните атрибути и методи
    //weight
    //getSalePrice() т.че ако weight > 2000 тогава има 10% намаление, иначе 20% намаление.
    //Създайте клас Ford който наследява Car и има следните атрибути и методи
    //year
    //manufacturerDiscount
    //getSalePrice() т. че от цената изчислена в класа Car да се извади manufacturerDiscount
    //Създайте клас Sedan който наследява Car и има следните атрибути и методи
    //length
    //getSalePrice() - ако дължината е > 6,5 метра -> 5% отстъпка, иначе 10% отстъпка
    //Създайте програма MyOwnAutoShop когато изпълнява следните стъпки в main() метода си.
    //Създава инстанция на класа Sedan инициализирайки всичките атрибути с подходящи стойности.
    // Ползвайте ключовата дума super за да инициализирате атрибутите на супер класа.
    //Създава две инстанции на Ford и инциализира техните атрибути, задавайки им подходящи стойности. Отново ползвайте ключовата дума super.
    //Създава инстанция от класа Car инициализирайки всичките атрибути с подходящи стойности.
    //Създава инстанции и от класовете Truck, Sedan
    //Извежда в конзолата цените на всички инстанции.

    public static void main(String[] args) {

        Sedan sedan = new Sedan(200,3500,"red",4.35);
        Ford ford1 = new Ford(180,4560,"blue",2006,500);
        Ford ford2 = new Ford(220,5500,"green",2020,1500);
        Car car = new Car(150,4000,"orange");
        Truck truck = new Truck(180,15000,"red",2500);
        Sedan sedan1 = new Sedan(250,35000,"brown",4.85);

        System.out.println(sedan.getRegularPrice());
        System.out.println(ford1.getRegularPrice());
        System.out.println(ford2.getRegularPrice());
        System.out.println(car.getRegularPrice());
        System.out.println(truck.getRegularPrice());
        System.out.println(sedan1.getRegularPrice());
    }
}
