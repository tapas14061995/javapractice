class Human{
    private String name;
    private int age;

    public Human(){
        age=12;
        name="john";
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;

    }
    

    public Human(int age) {
        this.age = age;
        name= "Hari";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
       this.age=age;
    }

}



public class Encap {
    public static void main(String[] args){
        Human obj = new Human();
        Human obj1= new Human(10);
        
        obj.setName("Rohan");
        obj.setAge(34);

        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());

    }
    
}
