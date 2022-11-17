package task_16_Collection.task_02_08_22_Restorant;

import java.util.Queue;
import java.util.Stack;

public class Cook {

    private Queue<Order> orders;
    private Stack<Dish> dishes;

    public Cook(Queue<Order> orders, Stack<Dish> dishes) {
        this.orders = orders;
        this.dishes = dishes;
    }

    public  void  cooking(){

        if(!orders.isEmpty()){

            if(dishes.empty()) System.out.println("Np clean dishes");
            else System.out.println("Cooked");
        }
        else {
            System.out.println("No orders!");
        }
    }
}
