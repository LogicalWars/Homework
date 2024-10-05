import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarsRepositoryFileBasedImpl implements CarsRepository{

    private String filename = "./Homework_21/carDB.txt";

    private static final Function<String, Car> stringToCarMapper = s -> {
        String[] parts = s.split("\\|");
        String number = parts[0];
        String model = parts[1];
        String color = parts[2];
        Integer mileage = Integer.parseInt(parts[3]);
        Double cost = Double.parseDouble(parts[4]);
        return new Car(number, model, color, mileage, cost);
    };

    @Override
    public List<String> getCarNumberBlackOrZeroMileage() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(stringToCarMapper)
                    .distinct()
                    .filter(c -> c.getColor().equals("Black") || c.getMileage() == 0)
                    .map(Car::getNumber)
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getDistinctCarMiddleCost() {
        try {
            return (int) new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(stringToCarMapper)
                    .distinct()
                    .filter(c -> c.getCost() <= 800 && c.getCost() >= 700)
                    .count();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getColorCarWithMinCost() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(stringToCarMapper)
                    .distinct()
                    .min(Comparator.comparing(Car::getCost))
                    .map(Car::getColor)
                    .get();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double getAverageCamry() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(stringToCarMapper)
                    .distinct()
                    .mapToDouble(Car::getCost)
                    .average()
                    .getAsDouble();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
