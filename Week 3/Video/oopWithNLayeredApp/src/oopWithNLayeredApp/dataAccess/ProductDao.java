package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
//Dao alternatiflerinin kullandıgı ortak methodlar icin ınteface konuldu
public interface ProductDao {
    void add(Product product);
}
