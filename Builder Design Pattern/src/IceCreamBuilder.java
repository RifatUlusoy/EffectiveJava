public class IceCreamBuilder {
    private String iceCone;
    private String iceLemon;
    private String iceStrawberry;
    private String iceVanilla;
    public static class Builder{
        private final String iceCone;
        private String iceLemon;
        private String iceStrawberry;
        private String iceVanilla;

        public Builder(String iceCone) {
            this.iceCone = iceCone;
        }
        public Builder lemon(String lemon){
            iceLemon = lemon;
            return this;
        }
        public Builder strawberry(String strawberry){
            iceStrawberry = strawberry;
            return this;
        }
        public Builder vanilla(String vanilla){
            iceVanilla = vanilla;
            return this;
        }
        public IceCreamBuilder build(){
            return new IceCreamBuilder(this);
        }


    }
    public IceCreamBuilder(Builder builder) {
        iceCone = builder.iceCone;
        iceLemon = builder.iceLemon;
        iceStrawberry = builder.iceStrawberry;
        iceVanilla = builder.iceVanilla;
    }

}
