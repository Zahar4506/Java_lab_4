package Java_4_1;

import java.io.IOException;
import java.util.Date;

/**
 * 1.	Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
 * вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
 */
public class Java_4_4 {
    public static int fibo(int n) {
        int f;
        if (n == 0) return 0;
        else if ((n == 1) || (n == 2)) return 1;
        else return fibo(fibo(n - 1) + fibo(n - 2));


    }

    public static void main(String[] args) throws IOException {
        long a = 0, b = 0;
        long c = 0;
        int n = 0;

        while (c <= 60000) {
            n++;
            //System.out.println(c);
            a = (System.currentTimeMillis());
            fibo(n);
            b = (System.currentTimeMillis());
            c = b - a;


        }
        System.out.println(n);
    }
}
