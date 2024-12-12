import java.util.*;
class arraylistwithmodification{
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(345);
        a.add(346);
        a.add(344);
        //adding at particular index
        a.add(0,3456);
        //modifying
        a.set(2,3456);
        System.out.println(a);
    }
}