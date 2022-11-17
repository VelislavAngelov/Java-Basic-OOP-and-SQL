package homeWork_2.task_2_CarFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private String bodyType;
    private String color;
    private double length;
    private double width;
    private double weight;
    private Engine engine;
    private double price;
    private List<Enum> extras = new ArrayList<>();

    public Car() {

    }

    public Car(String brand, String model, String bodyType,
               String color, double length, double width,
               double weight, double price) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {


        this.price = price;
    }

    public List<Enum> getExtras() {
        return extras;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setExtras(List<Enum> extras) {

        for (Enum ext : extras) {
            if (Objects.equals(ext, Enum.AIR_CONDITION)) {
                this.price += Enum.AIR_CONDITION.getPriceExtras();
            }
            if (Objects.equals(ext, Enum.NAVIGATION)) {
                this.price += Enum.NAVIGATION.getPriceExtras();
            }

            if (Objects.equals(ext, Enum.AUTOMATIC)) {

                this.price += Enum.AUTOMATIC.getPriceExtras();
            }

        }
        this.extras = extras;
    }

    @Override
    public String toString() {

        if (getExtras().size() == 0) {
            return "Car: \n" +
                    "brand: " + brand + '\n' +
                    "model: " + model + '\n' +
                    "bodyType: " + bodyType + '\n' +
                    "color: " + color + '\n' +
                    "length: " + length + '\n' +
                    "width: " + width + '\n' +
                    "weight: " + weight + '\n' +
                    "price: " + price + '\n' +
                    "extras: This car is not equipped with any extras." + "\n" +
                    engine;
        }
        return "Car: \n" +
                "brand: " + brand + '\n' +
                "model: " + model + '\n' +
                "bodyType: " + bodyType + '\n' +
                "color: " + color + '\n' +
                "length: " + length + '\n' +
                "width: " + width + '\n' +
                "weight: " + weight + '\n' +
                "price: " + price + '\n' +
                "extras: " + extras + '\n' +
                engine;
    }
}
