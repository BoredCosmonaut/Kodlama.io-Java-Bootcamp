package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        //Dosyaya kaydediyormus gibi simule ettik
        System.out.println("Dosyaya Loglandı " + data);
    }
}
