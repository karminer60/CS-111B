package Projects;

public class Circle {

    double x;
    double y;
    double radius;


    public void setX(double value){
        this.x = value;
    }

    public double getX(){
        return x;
    }

    public void setY(double value){
        this.y = value;
    }

    public double getY(){
        return y;
    }

    public void setRadius(double value){
        this.radius = value;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public boolean doesOverlap(Circle otherCircle){
        //z = sqrt(x^2 + y^2), where x is x2 - x1, and y is y2 - y1
        //is the distance between the two circle centers
        double xSquared = Math.abs(this.x - otherCircle.x);
        double ySquared = Math.abs(this.y - otherCircle.y);
        double z = Math.sqrt(Math.pow(xSquared, 2) + Math.pow(ySquared, 2));

        if(z <= (this.radius + otherCircle.radius)){
            return true;
        }else{
            return false;
        }

    }
}