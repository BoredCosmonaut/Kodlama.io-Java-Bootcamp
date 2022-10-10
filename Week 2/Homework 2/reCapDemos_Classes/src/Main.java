public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(3,2);
        dortIslem.cıkarma(5,4);
        dortIslem.carpma(3,4);
        dortIslem.bolme(4,2);
        System.out.println(sonuc);
    }
}