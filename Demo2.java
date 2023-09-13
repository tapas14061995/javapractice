public class Demo2 {
    public static void main(String[] args){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1=obj.add(3, 4);
        int r2=obj.sub(7, 4);
        int r3=obj.mul(5, 8);
        int r4=obj.mul(66, 6);
        double r5=obj.power(5, 3);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }
    
}
