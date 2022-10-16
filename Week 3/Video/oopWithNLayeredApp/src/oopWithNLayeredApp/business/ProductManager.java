package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

// Calısılan is ile alakalı kodları buraya yazacagız
public class ProductManager {
    private ProductDao productDao;

    //Bize birden fazla logger gondermesi icin kurduk bunu
    private Logger[] loggers;

    //Her new ProductManager kuruldugunda bize bir productDao veriyor
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // is kuralları (business rule) buraya yazılır.
        if (product.getUnitPrice() < 10 ) {
            throw new Exception("Urun fiyatı 10 dan kucuk olamaz");
        }
        //**Not: Bir katman baska bir katmanın class'ını kullanıyorsa sadece interface'den erisim kurmalıdır
        //Interface implemente edildigi sınıfın referansını tutabilir
        //ProductDao productDao = new HibernateProductDao(); //Sonradan sil
        //JdbcProductDao productDao = new JdbcProductDao(); // Sonradan sil

        productDao.add(product); // Veri tabanına urunu ekledik

        //Urunu loglamak ıcın kullandık
        for (Logger logger: loggers) { //[file,db,mail]
            logger.log(product.getName());
        }
    }
}
