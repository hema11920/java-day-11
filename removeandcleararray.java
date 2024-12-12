import java.util.*;
class removeandcleararray{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(90);
        a.add(77);
        a.add(786);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}