import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product findById(Integer id);
    List<Product> findAllByTitleLike(String title);
    void update(Product product);
}
