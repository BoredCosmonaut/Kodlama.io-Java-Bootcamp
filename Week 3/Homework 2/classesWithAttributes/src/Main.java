public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",5550.32,3,"Kırmızı");

        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        productManager  productManager = new productManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}