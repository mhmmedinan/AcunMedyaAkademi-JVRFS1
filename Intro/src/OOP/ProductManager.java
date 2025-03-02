package OOP;

import Polyformizm.Logger;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products;
    private Logger logger;

    //constructor

    public ProductManager(Logger logger) {
        //Dependency Injection Pattern

        this.logger = logger;


        products = new ArrayList<>();
        products.add(new Product(1,"Laptop",30000));
        products.add(new Product(2,"Televizyon",20000));



    }

    public void add(Product product){


        logger.log(product.getName());
        logger.info();

        //kötü kod pratiği
        /*boolean log = true;
        if(log)
            System.out.println("Dosyaya Loglandı");
        else
            System.out.println("Veritabanına loglandı");*/

        products.add(product);
    }


    public List<Product> getList(){

        return products;
    }
}


//Customer => Individual ve Corporate Customer olabilir.
//Customer,IndividualCustomer,CorporateCustomer sınıflarını oluşturunuz.
//IndividualCustomerManager adında bir sınıf oluşturunuz.
//add,getlist,getbyid,delete metodlarını yazınız.
