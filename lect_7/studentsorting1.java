import java.util.*;
class MyStudent{
        String name;
        int Rollno;
    
        public MyStudent(String name, int Rollno){
            this.name = name;
            this.Rollno = Rollno;
        }
}
class NameSorted implements Comparator<MyStudent>{
    public int compare(MyStudent s1, MyStudent s2){
        return s1.name.compareTo(s2.name);
    }
}

class studentSorting1{
    public static void main(String[] args){
        ArrayList<MyStudent> list=new ArrayList<MyStudent>();
        list.add(new MyStudent("Vartika", 12));
        list.add(new MyStudent("Vishesh", 19));
        Collections.sort(list, new NameSorted());
        System.out.println("Sorting by Name:");
        for(MyStudent s : list){
            System.out.println(s.Rollno + " " + s.name);
        }
    }
}