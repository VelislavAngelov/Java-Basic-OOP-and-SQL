package task_19_Tasks_For_Independent_Preparation.task_1;

public interface Measurable {

    static double getMeasure(Measurable[] objects){

        Employee employee;
        double salary = 0;

        for (Measurable object : objects) {

             employee = (Employee) object;
             salary += employee.getSalary();
        }
         return salary;
    }
}
