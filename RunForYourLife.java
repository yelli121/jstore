public class RunForYourLife implements Runnable
{
    private Thread thread;
    private String nama;
    private int waktuJeda;

    RunForYourLife(String nama, int waktuJeda)
    {
        this.nama = nama;
        this.waktuJeda = waktuJeda;
        System.out.println(nama + ", ready");
    }

    public void run()
    {
        System.out.println(nama + ", go!");
        try
        {
            for(int checkpoint = 1; checkpoint <= 20; checkpoint++)
            {
                System.out.println(nama + " has passed checkpoint (" + checkpoint + ")");
                Thread.sleep(waktuJeda);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(nama + " was interrupted.");
        }
        System.out.println("\n" + nama + " has finish \n");
    }

    public void start()
    {
        System.out.println(nama + ", set ...");
        if (thread == null)
        {
            thread = new Thread (this, nama);
            thread.start();
        }
    }
}
