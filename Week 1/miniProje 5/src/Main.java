public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,99,0,9};
        int lookingFor = 11;
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
            System.out.println("Aranan sayı dizide var ve " + index + ". indekste");
        }
        else {
            System.out.println("Sayı dizide yok");
        }
    }
}