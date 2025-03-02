package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Diziler sabittir.
          /*String[] products = new String[3];
          products[0] = "Mouse";
          products[1] = "Laptop";
          products[2]= "Monitor";
          //products[3] = "Asus Laptop"; dizi sabittir. Boyutundan fazla eleman eklenemez.

          for (int i = 0 ; i<products.length;i++){
              System.out.println("Ürünler : " + products[i]);
          }*/



         String[] products = {"Laptop" , "Mouse" , "Monitor"};
         //products[3] = "Asus Laptop";
         for(String product:products){
             System.out.println("Ürünler : " + product);
         }

         String[][] cities = new String[3][3];
         cities[0][0] = "İstanbul";
         cities[0][1] = "Kocaeli";
         cities[0][2] = "Sakarya";

        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kırşehir";

        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Gaziantep";
        cities[2][2] = "Mardin";


        for (int i= 0;i<cities.length;i++){
            System.out.println("----------------------------------");
            for (int j=0;j<cities.length;j++){
                System.out.println(cities[i][j]);
            }
        }


        List<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");

        System.out.println(programmingLanguages);

        for (String language:programmingLanguages){
            System.out.println(language);
        }

        System.out.println("--------------------------------");

        programmingLanguages.remove("Python");

        for (String language:programmingLanguages){
            System.out.println(language);
        }

        System.out.println("--------------------------------");

        int index = programmingLanguages.indexOf("C++");
        if(index!=-1){
            programmingLanguages.set(index,"Php");
        }

        for (String language:programmingLanguages)
            System.out.println(language);


        System.out.println("--------------------------------");


        List<String[]> users = new ArrayList<>();
        users.add(new String[]{"Batu","Emre","Şevval"});
        for (String[] user:users)
            System.out.println(user[0] + " " +  user[1] + " " +  user[2]);


        HashMap<String,Object> product = new HashMap<>();
        product.put("ürünün adı : " ,"Laptop");
        product.put("ürünün açıklaması : " ,"hızlı ve güçlü bir bilgisayar");
        product.put("ürünün fiyatı : " , 38000);


        System.out.println("--------------------------------");
        //yöntem 1 : keyset
        for (String key:product.keySet()){
            System.out.println(key + " " + product.get(key));
        }

        System.out.println("--------------------------------");

        //yöntem 2 : entrysetset() hem anahtar hem de değer üzerinden ulaşmak
        for (Map.Entry<String,Object> entry:product.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        System.out.println("--------------------------------");

        //yöntem 3 : Lambda ifadesi kullnarak
        product.forEach((key,value)->
                        System.out.println(key + " " +  value)
                );


        List<HashMap<String,Object>> products2 = new ArrayList<>();
        HashMap<String,Object> product1 = new HashMap<>();
        product1.put("ad" ,"Laptop");
        product1.put("aciklama" ,"hızlı ve güçlü bir bilgisayar");
        product1.put("fiyat" , 38000);

        products2.add(product1);

        for (var pr:products2){
            System.out.println("Ürün Adı " + pr.get("ad"));
            System.out.println("Ürün Açıklaması " + pr.get("aciklama"));
            System.out.println("Ürün Fiyatı" + pr.get("fiyat"));
        }



    }
}
