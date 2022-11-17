package homeWork_1.task_6_PointsAndShapes;

import java.util.LinkedHashMap;

public class Line {

    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }


    public void setStartPoint(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setEndPoint(Point p2) {
        this.p2 = p2;
    }
    public LinkedHashMap<String,Double> getEquation(){
        LinkedHashMap<String,Double> result = new LinkedHashMap<>();

        result.put("x", getP1().getY()-getP2().getY());
        result.put("c", (getP1().getX()- getP2().getX())* getP1().getY()+ (getP2().getY()- getP1().getY())* getP1().getX());
        result.put("y", getP2().getX()-getP1().getX());
        return result;

    }

}
