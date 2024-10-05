public class Car {
    private String number;
    private String model;
    private String color;
    private int mileage;
    private double cost;

    public Car(String number, String model, String color, int mileage, double cost) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage='" + mileage + '\'' +
                ", cost=" + cost +
                '}';
    }
}
