import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*Complex c1 = new Complex(10,15);
        Complex c2 = new Complex(10,15);

        Complex2 c3 = new Complex2(10,15);
        Complex2 c4 = new Complex2(10,15);



        if(c1.equals(c2)){
            System.out.println("Equal ");
        }else {
            System.out.println("Not Equal ");
        }

        if(c3.equals(c4)){
            System.out.println("Equal ");
        }else{
            System.out.println("Not Equal ");
        }*/
        /*Complex2 c5 = new Complex2(1,2);
        Complex2 c6 = new Complex2(3,4);
        Complex2 c7 = new Complex2(1,2);
        System.out.println(c5.hashCode());
        System.out.println(c6.hashCode());
        System.out.println(c7.hashCode());*/
        Map<Complex2,String> map = new HashMap<>();
        map.put(new Complex2(1,2),"first element");
        System.out.println(map.get(new Complex2(1,2)));
    }

}