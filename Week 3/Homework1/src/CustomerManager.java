public class CustomerManager {

    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }
    public void Save() {
        //System.out.println("Musteri eklendi: " + customer.firstName);
    }

    public void Delete() {
        //System.out.println("Musteri silindi: " + customer.firstName);
    }
    public void GiveCredit() {
        iCreditManager.Calculate();
        System.out.println("Kredi Verildi");
    }
}
