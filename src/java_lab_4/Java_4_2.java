/*
 * 2.	Создать метод, который будет выводить указанный массив на экран в строку.
  * С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов
  * из 10 элементов каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
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

    public class Java_4_2 {
        public static void masOut(int a[]){
            for (int i=0;i<10;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
        public static void main(String[] args) throws IOException{
            int[] mas1 = new int[10];
            int[] mas2 = new int[10];
            int[] mas3 = new int[10];
            int[] mas4 = new int[10];
            int[] mas5 = new int[10];

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

            for(int i = 0;i<10;i++){
                mas1[i]= Java_4_1.otr(a, b);
                mas2[i]= Java_4_1.otr(a, b);
                mas3[i]= Java_4_1.otr(a, b);
                mas4[i]= Java_4_1.otr(a, b);
                mas5[i]= Java_4_1.otr(a, b);
            }
            masOut(mas1);
            masOut(mas2);
            masOut(mas3);
            masOut(mas4);
            masOut(mas5);
        }
    }

