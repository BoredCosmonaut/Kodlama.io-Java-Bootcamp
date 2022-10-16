public class ProductManager {
    public void add(Product product) {
        //Method statik olduguicin ayrı bir sekilde cagırmaya gerek yok;
        if (ProductValidator.isValid(product)) {
            System.out.println("Veritabanına eklendi");
        }
        else {
            System.out.println("Urun bilgileri gecersizdir");
        }
    }
}
