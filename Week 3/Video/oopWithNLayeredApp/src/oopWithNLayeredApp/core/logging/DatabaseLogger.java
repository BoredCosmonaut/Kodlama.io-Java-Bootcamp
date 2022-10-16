package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        //Veritabanına logluyormus gibi simule ettik
        System.out.println("Veri tabanına loglandı " + data);
    }
}
