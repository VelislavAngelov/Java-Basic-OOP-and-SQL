package task_16_Collection.ReversSorted;

import java.util.Comparator;

public class ReversSorter implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if(o1.getArea()>o2.getArea()){
            return -1;
        }
        else if(o1.getArea()<o2.getArea()) {
            return 1;
        }
        return 0;
    }
}
