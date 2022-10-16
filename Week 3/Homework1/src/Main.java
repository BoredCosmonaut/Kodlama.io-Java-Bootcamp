public class Main {
    public static void main(String[] args) {

        /*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.city = "Mersin";

        CustomerManager customerManager1 = new CustomerManager(customer);
        customerManager1.Save();

        Company company = new Company();
        company.taxNumber = "12345";
        company.companyName = "Vestel";
        company.id = "100";

        CustomerManager customerManager2 = new CustomerManager(new Person());


        Person person = new Person();
        person.nationalId = "121092";
         */

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();
    }
}