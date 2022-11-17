package task_16_Collection.task_02_08_22_Restorant;

import java.util.Stack;

public class Washer {

    private Stack<Dish> dishes;
    private Stack<Dish> dirtyDishes;

    public Washer(Stack<Dish> dishes, Stack<Dish> dirtyDishes) {
        this.dishes = dishes;
        this.dirtyDishes = dirtyDishes;
    }

    public void  wash(){
        dishes.push(dirtyDishes.pop());
    }
}
