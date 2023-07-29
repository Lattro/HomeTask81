import java.util.concurrent.Executors;
import java.util.concurrent.*;
public class Main
{
    public static void main(String[] args) throws InterruptedException {

        //TASK - 1
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        CountDownLatch countDownLatch1 = new CountDownLatch(10);
        CountDownLatch countDownLatch2 = new CountDownLatch(10);
        executorService.execute(new ThreadClass(countDownLatch,"Thread - 1") );
        executorService.execute(new ThreadClass(countDownLatch1,"Thread - 2") );
        executorService.execute(new ThreadClass(countDownLatch2,"Thread - 3") );
        countDownLatch.await();
        countDownLatch1.await();
        countDownLatch2.await();
        System.out.println("Завершение потоков"); executorService.shutdown();


        // TASK - 2
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        CountDownLatch countDownLatch4 = new CountDownLatch(11);
        CountDownLatch countDownLatch5 = new CountDownLatch(11);
        CountDownLatch countDownLatch6 = new CountDownLatch(11);
        CountDownLatch countDownLatch7 = new CountDownLatch(11);
        CountDownLatch countDownLatch8 = new CountDownLatch(11);
        CountDownLatch countDownLatch9 = new CountDownLatch(11);
        CountDownLatch countDownLatch10 = new CountDownLatch(11);
        CountDownLatch countDownLatch11 = new CountDownLatch(11);
        CountDownLatch countDownLatch12 = new CountDownLatch(11);
        CountDownLatch countDownLatch13 = new CountDownLatch(11);
        executorService1.execute(new Thread2Class("A",countDownLatch4));
        executorService1.execute(new Thread2Class("B",countDownLatch5));
        executorService1.execute(new Thread2Class("C",countDownLatch6));
        executorService1.execute(new Thread2Class("D",countDownLatch7));
        executorService1.execute(new Thread2Class("E",countDownLatch8));
        executorService1.execute(new Thread2Class("F",countDownLatch9));
        executorService1.execute(new Thread2Class("G",countDownLatch10));
        executorService1.execute(new Thread2Class("H",countDownLatch11));
        executorService1.execute(new Thread2Class("I",countDownLatch12));
        executorService1.execute(new Thread2Class("J",countDownLatch13));
        countDownLatch4.await();
        countDownLatch5.await();
        countDownLatch6.await();
        countDownLatch7.await();
        countDownLatch8.await();
        countDownLatch9.await();
        countDownLatch10.await();
        countDownLatch11.await();
        countDownLatch12.await();
        countDownLatch13.await();
        executorService1.shutdown();
        System.out.println("Завершение работы потоков");
    }
}
