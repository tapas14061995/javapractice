class phone {
    int price;
    String brand;
    static String name;

    public static void show1(){
        System.out.println("This is static method");
    }

    public void show(){
        System.out.println(price+" : "+brand+" :"+name);
    }
}

public class Demo {
    public static void main(String[] args){
        phone obj1 =new phone();
        obj1.price= 200;
        obj1.brand= "samsung";
        phone.name= "smartphone";

        phone obj2 = new phone();
        obj2.price =300;
        obj2.brand="realme";
        phone.show1();
        obj1.show();

    }
}
