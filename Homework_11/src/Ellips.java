public class Ellips extends Circle{
    private int r2;

    public Ellips(int x, int y, int r, int r2) {
        super(x, y, r);
        this.r2 = r2;
    }

    @Override
    public int area() {
        int b;
        b = (int) (this.r2 * super.getR() * Math.PI);
        return b;
    }

    @Override
    public int perimeter() {
        int b;
        b = (int) (2 * Math.PI * Math.sqrt((Math.pow(r2, 2) + Math.pow(super.getR(), 2)) / 2));
        return b;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }
}
