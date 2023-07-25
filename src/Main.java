import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int a = new Random().nextInt();
        System.out.println(a);
        int b = new Random().nextInt();
        System.out.println(b);
        int c = new Random().nextInt();
        System.out.println(c);
        if (    (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) ||
                (a % 2 != 0 && b % 2 != 0 && c % 2 != 0))   {
            System.out.println("WIN");
        }else {
            System.out.println("FAIL");
        }

        long endTime = System.nanoTime();

        System.out.println((float)(endTime - startTime) / 1000000000);
    }
}