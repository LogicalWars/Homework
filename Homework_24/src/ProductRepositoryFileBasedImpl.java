import java.io.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductRepositoryFileBasedImpl implements ProductRepository {
    private String filename = "./Homework_24/productDB.txt";

    private static final Function<String, Product> stringToProductMapper = s -> {
        String[] parts = s.split("\\|");
        Integer id = Integer.parseInt(parts[0]);
        String name = parts[1];
        Double price = Double.parseDouble(parts[2]);
        Integer count = Integer.parseInt(parts[3]);
        return new Product(id, name, price, count);
    };

    @Override
    public Product findById(Integer id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .map(stringToProductMapper)
                    .filter(p -> p.getId() == id)
                    .findFirst()
                    .get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAllByTitleLike(String title) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .map(stringToProductMapper)
                    .filter(p -> p.getName().contains(title))
                    .distinct()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {
        List<Product> products;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            products = reader.lines()
                    .map(stringToProductMapper)
                    .map(p -> p.getId() == product.getId() ? product : p)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product p : products) {
                writer.write(p.getId() + "|" + p.getName() + "|" + p.getPrice() + "|" + p.getCount());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
