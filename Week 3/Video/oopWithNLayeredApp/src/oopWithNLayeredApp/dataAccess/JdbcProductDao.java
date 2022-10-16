package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// Veri tabanına erisim islemlerini gerceklestirmek icin bu sınıfı kurduk
public class JdbcProductDao implements ProductDao{
    //Veritabanına urun ekliyormus gibi simule ettik
    public void add(Product product) {
        //sadece ve sadece database erisim kodları buraya yazılır (SQL ile)
        System.out.println("JDBC ile veritabanına eklendi");
    }
}

//Hibernate
