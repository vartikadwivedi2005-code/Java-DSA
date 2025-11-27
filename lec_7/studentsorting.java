import java.util.*;
class MyStudent implements Comparable<MyStudent>{
     String name;
     int Rollno;

     public MyStudent(String name,int Rollno){
         this.name=name;
         this.Rollno=Rollno;
     }
     public int compareTo(MyStudent s){
         return this.Rollno - s.Rollno;
     }
     public String toString(){
         return Rollno + " " + name;
     }
}
class studentSorting{
    public static void main(String[] args){
        ArrayList<MyStudent> list=new ArrayList<MyStudent>();
        list.add(new MyStudent("Alex",101));
        list.add(new MyStudent("John",102));
        Collections.sort(list);
        System.out.println("Students sorted by Roll Number:");
        System.out.println(list);
    }

}