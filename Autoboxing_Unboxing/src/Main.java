import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Autoboxing: primitive to wrapper
        int primitiveInt = 2;
        Integer wrappedInt = primitiveInt;
        System.out.println("Autoboxing: "+wrappedInt);

        //Unboxing: wrapper to primitive
        Integer anotherWrappedInt = Integer.valueOf(10);
        int anotherPrimitiveInt = anotherWrappedInt;
        System.out.println("Unboxing: "+anotherPrimitiveInt);

        //Using in collections (Autoboxing)
        List<Integer> intList = new ArrayList<>();
        intList.add(20);
        System.out.println("List after autoboxing: "+intList);

        //Retrieving from collections (Unboxing)
        int retrievedInt = intList.get(0);
        System.out.println("Retrieved int after unboxing: "+retrievedInt);
    }
}