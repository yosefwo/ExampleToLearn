package threadLearn;

public class Loader extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + " second");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void start() {
        super.start();
        try {
            new Thread().sleep(5000);
            System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Main1{
    public static void main(String[] args) {
        Loader loader = new Loader();
        loader.start();// קראתי לסטארט ורן גם פעלה
    }
}