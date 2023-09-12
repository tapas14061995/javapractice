class Student{
    String name;
    int rollno;
    int marks;
}

class Array{
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name="chiku";
        s1.rollno=9;
        s1.marks=98;

        Student s2 = new Student();
        s2.name="hari";
        s2.rollno=3;
        s2.marks = 76;

        Student s3 = new Student();
        s3.name = "Radha";
        s3.rollno=5;
        s3.marks=65;
        
        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for (int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+" : "+students[i].rollno+" : "+students[i].marks);
        // }
        for (Student stu : students){
            System.out.println(stu.name+" : "+stu.rollno+" : "+stu.marks);
        }
        
        

        

    }
 }
