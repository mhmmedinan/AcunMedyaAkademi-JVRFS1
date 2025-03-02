package Polyformizm;

public class DatabaseLogger extends Logger{
    @Override
    public void log(Object object) {
        System.out.println("Veritabanına loglandı : " + object);
    }

    @Override
    public void info() {
        System.out.println("Info seviyesinde loglama yapıldı");
    }
}
