public class ProductValidator {
    static {
        System.out.println("Yapıcı blok calıstı");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return  true;
        }
        else {
            return false;
        }
    }
    public void bisey() {

    }
    //Inner class
    public static class BaskaBirClass {
         public static void sil() {

         }
    }
}
