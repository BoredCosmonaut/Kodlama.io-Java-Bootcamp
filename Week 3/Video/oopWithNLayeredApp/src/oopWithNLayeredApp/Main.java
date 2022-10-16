package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        //Yeni urun olusturduk
        Product product1 = new Product(1, "Iphone XR",4000);

        //ProductManager argumantlarını tamamlamak icin loggerları dizide kurduk
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        //Urunu veri tabanına ekliyoruz
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}