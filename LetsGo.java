import java.util.Random;

public class LetsGo
{
    public LetsGo()
    {

    }

    public int random(int min, int max)
    {
        if (min >= max)
        {
            throw new IllegalArgumentException("nilai max lebih besar dari nilai min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args)
    {
        System.out.println("====Lomba Lari====");
        System.out.println("Aturan :");
        System.out.println("-Terdapat 20 checkpoint");
        System.out.println("-Start pada waktu yang ditentukan\n");

        LetsGo go = new LetsGo();
        RunForYourLife R1 = new RunForYourLife( "Lionel", go.random(5,33));
        RunForYourLife R2 = new RunForYourLife( "Andres", go.random(33,66));
        RunForYourLife R3 = new RunForYourLife( "Messi", go.random(66,100));

        System.out.println("\nStart \n");

        R1.start();
        R2.start();
        R3.start();
    }
}