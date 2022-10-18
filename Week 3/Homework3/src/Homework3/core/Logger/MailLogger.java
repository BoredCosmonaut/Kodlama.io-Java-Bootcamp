package Homework3.core.Logger;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gonderildi : " + data);
    }
}
