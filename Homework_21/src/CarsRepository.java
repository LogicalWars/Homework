import java.util.List;

public interface CarsRepository {
    List<String> getCarNumberBlackOrZeroMileage();
    int getDistinctCarMiddleCost();
    String getColorCarWithMinCost();
    double getAverageCamry();
}
