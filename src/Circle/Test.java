package Circle;

public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.2);
        c1.setColor("Black");
        System.out.println(c1.toString());
        System.out.println("circle Area" + c1.getArea());
        System.out.println("circle fence" + c1.getcircufense());

        System.out.println("----------------------------------------------------");

        Circle c2 = new Circle();
        c2.setRadius(12.5);
        c2.setColor("Red");
        System.out.println(c2.toString());
        System.out.println("circle Area" + c2.getArea());
        System.out.println("circle fence" + c2.getcircufense());

    }

}
