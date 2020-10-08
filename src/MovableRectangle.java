public class MovableRectangle implements Movable{
    protected double width;
    protected double length;
    protected double x;
    protected double y;
    MovableRectangle(){};
    MovableRectangle(double width, double length,double x,double y){
        this.width=width;
        this.length=length;
        this.x=x;
        this.y=y;
    };

    public double getWidth() {
        return width;
    };

    public void setWidth(double width) {
        this.width = width;
    };

    public double getLength() {
        return length;
    };

    public void setLength(double length) {
        this.length = length;
    };

    public double getArea(){
        return width*length;
    };

    public double getPerimeter(){
        return 2*width+2*length;
    };

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    };

    public void moveUp(int chy) {
        this.y+=chy;
    }

    public void moveDown(int chy) {
        this.y-=chy;
    }

    public void moveLeft(int chx) {
        this.y+=chx;
    }

    public void moveRight(int chx) {
        this.y-=chx;
    }

}