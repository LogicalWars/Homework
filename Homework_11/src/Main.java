public class Main {
    public static void main(String[] args) {
        Square square = new Square(10, 20, 10);
        System.out.println(square.area() + " " + square.perimeter());;
        Circle circle = new Circle(5, 6, 8);
        System.out.println(circle.area() + " " + circle.perimeter());
        Rectangle rectangle = new Rectangle(4, 8, 10, 20);
        System.out.println(rectangle.area() + " " + rectangle.perimeter());
        Ellips ellips = new Ellips(56, 24, 7, 2);
        System.out.println(ellips.area() + " " + ellips.perimeter());
    }
}