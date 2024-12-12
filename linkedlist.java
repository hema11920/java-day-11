import java.util.*;
class linkedlist{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(567);
        a.add(789);
        a.add(900);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addLast(90);
        System.out.println(a);
    }
}