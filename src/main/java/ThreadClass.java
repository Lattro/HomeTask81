import java.util.concurrent.CountDownLatch;

public class ThreadClass extends Thread
{
    private CountDownLatch countDownLatch ;
    private String name;

    public ThreadClass(CountDownLatch countDownLatch, String name)
    {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(name);
            countDownLatch.countDown();
        }
    }
}
