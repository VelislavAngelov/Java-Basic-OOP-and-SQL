package homeWork_6.task_1b_Set;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
    }
}
