package Polyformizm;

public class FileLogger extends Logger{
    @Override
    public void log(Object object) {
        System.out.println("Dosyaya Loglandı : " + object);
    }
}
