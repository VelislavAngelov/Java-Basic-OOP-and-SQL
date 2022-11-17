package homeWork_3.task_4_Animal;

public interface Pet {

     String  getName();
     void setName(String name);
     public default void play(){
          System.out.println("I am playing on my own");
     }
}
