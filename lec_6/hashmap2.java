import java.util.*;
class Main{
    public static void main(String[] args){
        String str="aabcad";
        HashMap<Character,Integer> map=new HashMap<>();   //key->Character , value->Integer
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);   //count frequency of characters
        }
        System.out.println(map);   //output - {a=3, b=1, c=1, d=1}
        for(char ch :str.toCharArray()){
            if(map.get(ch)==1){   //first non-repeating character
                System.out.println(ch);   //output - b
                break;
            }
        }
    }
}