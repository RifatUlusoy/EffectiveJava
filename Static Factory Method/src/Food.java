public class Food {
    String name;

    public static Food hotFood(String name){
        return new Chicken();
    }
    public static Food coldFood(String name){
        return new IceCream();
    }
}
