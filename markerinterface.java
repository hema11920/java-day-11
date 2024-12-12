import java.util.*;
interface printable{
}
class h implements printable{
    public void print()
    {
        System.out.println("hello students");
    }
}
public class markerinterface{
    public static void main(String args[]){
        h f=new h();
        f.print();
    }
}