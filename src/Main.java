public class Main {
    public static void main(String[] args) {

        Shapes triangle = new Triangle(2,4);
        triangle.findArea();
        Shapes rectangle = new Rectangle(4,8);
        rectangle.findArea();
        Shapes circle = new Circle(3.14, 6);
        circle.findArea();
        Shapes square = new Square(3);
        square.findArea();
    }
}