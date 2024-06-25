public class Main {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){

                }
                System.out.println("Hash code of lazy: "+LazyCache.getInstance().hashCode());
                System.out.println("Hash code of Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("Hash code of Enum: "+EnumCache.INSTANCE.hashCode());

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hash code of lazy: "+LazyCache.getInstance().hashCode());
                System.out.println("Hash code of Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("Hash code of Enum: "+EnumCache.INSTANCE.hashCode());
            }
        }).start();

    }
}