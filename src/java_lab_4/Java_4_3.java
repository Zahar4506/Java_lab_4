package Java_4_1;

import java.io.*;

/**
 * 3.	Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
 */
public class Java_4_3 {
    public static void sort(int a[]){

        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( a[j] > a[j+1] ){
                int b = a[j];
                a[j] = a[j+1];
                a[j+1] = b;
            }
        }
    }
        for(int i=0; i< a.length;i++){ System.out.println(a[i]);
    }}

    public static void main(String[] args) throws IOException {

        int[] mas = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random() * 10 );;
            System.out.print(mas[i]+" ");
        }
        System.out.println();
       sort(mas);
    }
}
