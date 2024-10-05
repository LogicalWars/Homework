public class Circle extends Figure {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int area(){
        int b = 0;
        b = (int) (this.r * this.r * Math.PI);
        return b;
    }

    public int perimeter(){
        int b = 0;
        b = (int) (this.r * 2 * Math.PI);
        return b;
    }
}
