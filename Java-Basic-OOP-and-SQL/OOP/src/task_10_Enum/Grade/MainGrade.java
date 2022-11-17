package task_10_Enum.Grade;

import java.util.*;

public class MainGrade {

    public static void main(String[] args) {

        List<Grade> grades =new ArrayList<>();
        grades.add(Grade.СЛАБ);
        grades.add(Grade.ДОБЪР);
        grades.add(Grade.МНОГО_ДОБЪР);
        grades.add(Grade.ОТЛИЧЕН);
        grades.add(Grade.СРЕДЕН);
        grades.add(Grade.СРЕДЕН);
        grades.add(Grade.МНОГО_ДОБЪР);
        grades.add(Grade.ДОБЪР);
        grades.add(Grade.СЛАБ);
        grades.sort(Comparator.naturalOrder());

        for (Grade grade:grades){
                System.out.println(grade.getNumGrade()+" "+grade+ " -> "+(grade.pass()?"Pass":"Fail"));

        }
    }
}
