public class Main {
    public static void main(String[] args) {
        isThere();
    }


    // camel Casing
    public static void isThere() {
        int[] numbers = {1,2,3,4,5,6,99,0,9};
        int lookingFor = 5;
        int index = 0;
        boolean exists = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == lookingFor) {
                exists = true;
                index = i;
                break;
            }
        }
        if (exists) {
            message(lookingFor);
        }
        else {
            System.out.println("Sayı dizide yok");
        }
    }
    public static void message(int lookingFor) {
        System.out.println("Aranan sayı : " + lookingFor + " dizide mevcut");
    }
}