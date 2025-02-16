import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //veriables


        String productName = "Apple Macbook M3";

        byte unitInStock = 5;
        short unitInStock1 = 10;
        int unitInStock2 = 40;
        long unitInStock3 = 50;

        double unitPrice = 999.99;
        float unitPrice2 = 999.99F;

        //int number = 99.99;
        //double number1 = 99;

        char gender = 'K';

        boolean isActive = false;
        //var number = 12.99;
        var name = "Ali";


        //var number2 = 18.99;

     /*   System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);
        System.out.println(productName);*/


        //controlStatement

        int number1 = 10;
        int number2 = 10;

        if(number1<number2){
            System.out.println(number1 + " küçüktür");
        }
        else if (number1>number2){
            System.out.println(number1 + " büyüktür");
        }
        else{
            System.out.println("Sayılar eşit");
        }


       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Hesap bakiyenizi giriniz : ");
        double accountBalance = scanner.nextDouble();

        System.out.print("Çekmek istediğiniz miktarı giriniz : ");
        double amount = scanner.nextDouble();*/


       /* if(amount<=accountBalance){
            accountBalance-=amount;
            System.out.println("Para çekme işlemi başarılı." + " Güncel Bakiye : " + accountBalance);
        }
        else {
            System.out.println("Yetersiz bakiye");
        }*/


        //loops
        //for,foreach,while,do-while

        for(int i=0;i<50;i++){
            System.out.println(i);
        }

        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println("Çift sayılar : " + i);
            }
            else{
                System.out.println("Tek sayılar : " + i );
            }
        }

        int number = 30;

        boolean isPrime = true;


        for(int i = 2;i<number;i++){
            if(number%i==0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("SAyı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }

    }
}