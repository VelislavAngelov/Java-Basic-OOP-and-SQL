package homeWork_4.task_3_Move;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {

        y-=ySpeed;
    }

    @Override
    public void moveDown() {

        y+=ySpeed;
    }

    @Override
    public void moveLeft() {

        x-=xSpeed;
    }

    @Override
    public void moveRight() {

        x+=xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint:\n" +
                "x = " + x +
                "y = " + y +
                "xSpeed = " + xSpeed +
                "ySpeed = " + ySpeed ;
    }
}
