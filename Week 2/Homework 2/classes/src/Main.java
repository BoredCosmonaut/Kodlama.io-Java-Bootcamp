public class Main {
    public static void main(String[] args) {

        //Reference Type
        CustomerManager customer1 = new CustomerManager();
        CustomerManager customer2 = new CustomerManager();
        customer1.Add();
        customer1.Remove();
        customer1.Update();

        //Value
        int sayı1 = 10;
        int sayı2 = 20;
        sayı2 = sayı1;
        sayı1 = 30;

        int[] sayılar1 = {1,2,3};
        int[] sayılar2 ={4,5,6};
        sayılar2 = sayılar1;
        sayılar1[0] = 10;
        System.out.println(sayılar2[0]);
    }
}

