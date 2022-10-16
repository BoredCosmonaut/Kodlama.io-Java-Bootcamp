public class Main {
    public static void main(String[] args) {
        //Interface'lerde tıpkı abstract sınıflar gibi new'lenemez ama onu implemente eden sınıfın referansını tutabilir
        //ICustomerDal iCustomerDal = new MySqlCustomerDal();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}