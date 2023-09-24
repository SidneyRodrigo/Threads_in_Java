public class MyThread extends Thread
{
    private String name;
    private int startValue;
    private int endValue;

    public MyThread(String name, int startValue, int endValue)
    {
        super(name);
        this.startValue = startValue;
        this.endValue = endValue;
    }

    @Override
    public void run()
    {
        System.out.println("Thread \"" + getName() + "\" started.");
        for (int i = startValue; i <= endValue; i++)
        {
            if ((i % 3) == 0 || (i % 5) == 0)
            {
                System.out.println(getName() + ": " + i + ".");
            }
        }
        System.out.println("Thread \"" + getName() + "\" finished.");
    }
}