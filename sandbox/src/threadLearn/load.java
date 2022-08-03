package threadLearn;

public class load {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("hello");
            }
        };
        thread.start();
        thread.sleep(3000);
        System.out.println("hi");
    }
}
