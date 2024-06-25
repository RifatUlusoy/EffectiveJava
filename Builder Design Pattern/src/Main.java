public class Main {
    public static void main(String[] args) {

        IceCreamBuilder iceCreamBuilder = new IceCreamBuilder
                .Builder("cone")
                .lemon("lemon")
                .strawberry("strawberry")
                .build();

    }
}