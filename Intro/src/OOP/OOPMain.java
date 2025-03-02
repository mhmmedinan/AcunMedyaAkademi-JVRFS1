package OOP;

import Polyformizm.DatabaseLogger;
import Polyformizm.FileLogger;

import java.time.LocalDateTime;
import java.util.List;

public class OOPMain {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(1);
        category.setName("Elektronik");
        category.setCreatedDate(LocalDateTime.now());//setter

        System.out.println(category.getName());   //getter

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(5000);
        product.setCreatedDate(LocalDateTime.now());

        ProductManager productManager = new ProductManager(new DatabaseLogger());
        productManager.add(product);

        List<Product> products = productManager.getList();
        for (var item:products){
            System.out.println(item.getId());
            System.out.println(item.getName());

        }
    }
}
