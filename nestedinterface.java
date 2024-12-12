import java.util.*;
interface out{
    void outm();
interface in{
    void innm();
}
}
class nestedinterface implements out.in{
    public void innm()
    {
        System.out.println("hello i'm inner method");
    }
    public static void main(String args[]){
        nestedinterface h = new nestedinterface();
        h.innm();
    }
}
