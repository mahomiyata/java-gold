package chap3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsSample {
    public static void main(String[] args) throws InterruptedException {
        Runnable test = () -> System.out.println(Thread.currentThread().getId());

        ExecutorService singleExec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            singleExec.submit(test);
        }
        singleExec.shutdown();
        System.out.println("singleExec status: is shutdown?" + singleExec.isShutdown());

        ExecutorService cachedExec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            cachedExec.submit(test);
        }
        Thread.sleep(10000);
        System.out.println("---------10秒後---------");
        for (int i = 0; i < 5; i++) {
            cachedExec.submit(test);
        }
        Thread.sleep(70000);
        System.out.println("---------70秒後---------");
        for (int i = 0; i < 5; i++) {
            cachedExec.submit(test);
        }
        cachedExec.shutdown();
    }
}
