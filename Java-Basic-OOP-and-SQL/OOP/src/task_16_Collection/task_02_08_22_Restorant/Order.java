package task_16_Collection.task_02_08_22_Restorant;

public class Order {

    private String name;
    private  int tableNumber;

    public Order(String name, int tableNumber) {
        this.name = name;
        this.tableNumber = tableNumber;
    }

    public String getName() {
        return name;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", tableNumber=" + tableNumber +
                '}';
    }
}
