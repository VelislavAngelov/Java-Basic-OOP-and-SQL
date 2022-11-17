package task_16_Collection.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(4);
        stack.push(6);
        stack.push(7);

        System.out.println(stack);
         int e=stack.pop();
        System.out.println(e);
        System.out.println(stack);
    }
}
