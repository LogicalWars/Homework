public class Square extends Figure {
    private int a;

    public Square(int x, int y, int a) {
        super(x, y);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int area(){
        int b = 0;
        b = this.a * this.a;
        return b;
    }

    public int perimeter(){
        int b = 0;
        b = this.a * 4;
        return b;
    }
}
