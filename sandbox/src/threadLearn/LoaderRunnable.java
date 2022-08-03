package threadLearn;

public class LoaderRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hh");
    }

}
class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread loader = new Thread(new LoaderRunnable());
        loader.start();// קראתי לסטארט ורן גם פעלה
        int a = 1;
        loader.setPriority(a);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    loader.sleep(10);
                    System.out.print(k*10 +",");
                }
                loader.sleep(100);
                System.out.println(j*100);
            }
            System.out.println(i + " second");
        }
        Thread.sleep(1000*60);
    }
}