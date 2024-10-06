public class Main {
    public static void main(String[] args) {
        ProductRepositoryFileBasedImpl productRepo = new ProductRepositoryFileBasedImpl();
        System.out.println(productRepo.findById(2));
        System.out.println(productRepo.findAllByTitleLike("б"));
        Product milk = productRepo.findById(1);
        milk.setCount(10);
        milk.setPrice(40.3);
        productRepo.update(milk);
    }
}
