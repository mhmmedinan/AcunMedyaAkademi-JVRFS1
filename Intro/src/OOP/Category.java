package OOP;



//Inheritance => alt sınıfın üst sınıfın özelliklerini miras alması.
// Bir class sadece bir classı veya absract class'ı miras alabilir.
public class Category extends BaseEntity {

    private int id;
    private String name;
    //Encapsulation

    //Setter
    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
