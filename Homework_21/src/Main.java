public class Main {
    public static void main(String[] args) {
        CarsRepositoryFileBasedImpl carsRepo = new CarsRepositoryFileBasedImpl();
        System.out.println(carsRepo.getCarNumberBlackOrZeroMileage());
        System.out.println(carsRepo.getDistinctCarMiddleCost());
        System.out.println(carsRepo.getColorCarWithMinCost());
        System.out.println(carsRepo.getAverageCamry());
    }
}
