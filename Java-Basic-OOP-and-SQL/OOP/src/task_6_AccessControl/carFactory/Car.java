package task_6_AccessControl.carFactory;

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
    private String engineType;
    private double price;
    private List<String> extras;

    public Car() {
        extras = new ArrayList<>();
    }

    public Car(String brand, String model, String bodyType,
               String color, double length, double width,
               double weight, String engineType, double price) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.engineType = engineType;
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {


        this.price = price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {

        for (String ext : extras) {
            if (Objects.equals(ext, "Kлиматик")) {
                this.price += 1500;
            }
            if (Objects.equals(ext, "Навигация")) {
                this.price += 500;
            }
            if (Objects.equals(ext, "Темпомат")) {

                this.price += 350;
            }
            if (Objects.equals(ext, "Автоматик")) {

                this.price += 3000;
            }
            if (Objects.equals(ext, "Eл. стъкла")) {

                this.price += 250;
            }
        }
        this.extras = extras;
    }

    @Override
    public String toString() {

        if(getExtras().size()==0){
            return "Car: \n" +
                    "brand: " + brand + '\n' +
                    "model: " + model + '\n' +
                    "bodyType: " + bodyType + '\n' +
                    "color: " + color + '\n' +
                    "length: " + length + '\n' +
                    "width: " + width + '\n' +
                    "weight: " + weight + '\n' +
                    "engineType: " + engineType + '\n' +
                    "price: " + price+ '\n' +
                    "extras: This car is not equipped with any extras.\n";
        }
        return "Car: \n" +
                "brand: " + brand + '\n' +
                "model: " + model + '\n' +
                "bodyType: " + bodyType + '\n' +
                "color: " + color + '\n' +
                "length: " + length + '\n' +
                "width: " + width + '\n' +
                "weight: " + weight + '\n' +
                "engineType: " + engineType + '\n' +
                "price: " + price+ '\n' +
                "extras: " + extras+ '\n';
    }
}
