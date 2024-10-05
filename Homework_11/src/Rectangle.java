public class Rectangle extends Square {
    private int b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y, a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int area() {
        int c;
        c = this.b * super.getA();
        return c;
    }

    @Override
    public int perimeter() {
        int c;
        c = 2 * (this.b + super.getA());
        return c;
    }
}
