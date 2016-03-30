/*
 *1.	Создать статический метод, который будет иметь два целочисленных параметра a и b,
 * и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
 * C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
package Java_4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author zam1541b
 */
public class Java_4_1 {
    /**
     *
     */
    public static int otr(int a, int b){
        int c =0;
        c=(int)(Math.random() * (b - a + 1) + a);
        return c;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 числа a и b");
        int a = 0, b = 0;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        String b_str = bufferedReader.readLine();

        try {
            a = Integer.parseInt(a_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода числа a");

        }

        try {
            b = Integer.parseInt(b_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода числа b");
        }

        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = (int) (otr(a,b));
            System.out.println(mas[i]);

        }

    }
}
