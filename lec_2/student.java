package lec_2;


class main{     //main class

    public static void main(String[] args){
        Student Student1=new Student("Vartika Shukla",100,90);
        Student Student2=new Student("Amit Shukla",101,85);
        Student Student3=new Student("Reenu Shukla",102,95);
        System.out.println("Student Details:");
        System.out.println("------------------");

        Student1.display();

        System.out.println("------------------");

        Student2.display();

        System.out.println("------------------");

        Student3.display();

        System.out.println("------------------");

    }
}
class Student{
    String name;   //non static function
    int rollno;
    double marks;
    public Student(String name,int rollno,double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Rollno:" +rollno);
        System.out.println("Marks:" +marks);
    }
}