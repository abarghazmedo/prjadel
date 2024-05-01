package Circle;

public class Circle {

    private double radius;//9otr
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {//misa7a 
        return Math.PI*radius*radius;
        
 
    }
    
    public double getcircufense(){//mo7it
        return Math.PI*2*radius;
    }

   
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
