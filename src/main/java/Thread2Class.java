import java.util.concurrent.CountDownLatch;

public class Thread2Class extends Thread
{
    private String name;
    private CountDownLatch countDownLatch;
    public Thread2Class(String name, CountDownLatch countDownLatch)
    {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(name+ ": "+i);
            countDownLatch.countDown();
        }
    }
}
