import java.util.HashSet;
class hashset {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();   //hashset declaration - is a class in many programming languages(like java,python,c#,etc) used to implement the set interface,
        // which represents an unordered colllection of unique elements.
        set.add(10);
        set.add(20);
        set.add(30);    // adding elements
        System.out.println(set);
    }
}