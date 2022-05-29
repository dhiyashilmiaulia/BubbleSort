package MengurutkanNama;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PengurutanNama {
    public static void main(String[] args) throws Exception {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        //Class Buffered menjadi variable bernama kata
        int a; //mendeklarasikan variable bernama a bertipe data integer
        System.out.println("Jumlah Nama Yang Diinputkan:"); //banyaknya input yang dimasukan oleh user
        a = Integer.parseInt(kata.readLine()); //mengconvert a yang asalnya bertipe data string menjadi integer(kata menjadi integer)
        String[] Array; //mendeklarasikan array yang bertipe data string
        Array = new String[a]; //instansiasi dan inisialisasi variable a
        String temp; //mendeklarasikan variable tem yang bertipe data string
        Scanner input = new Scanner(System.in); //instansiasi untuk menyimpan inputan user
        //penginputan nama
        for (int i = 0; i < a; i++) ;
        {
            System.out.print("Nama " + (a+ 1) + " adalah: ");
            Array[a] = input.next();
        }
        //proses penyortingan
        for (int x = 1; x < a; x++) ;
        {
            for (int y = 0; y < a - 1; y++);
            {
                if (Array[a].compareTo(Array[a + 1]) > 0) ;
                {
                    temp = Array[a];//Adelio,Adam,Azzar,
                    Array[a] = Array[a + 1];//Adam,Azzar,Aditya
                    Array[a + 1] = temp;//Adelio,Adam,Azzar
                }
            }
        }
        //output pengurutan nama
        System.out.println(" ");
        System.out.println("Urutanya ");

        for (int i=0;i<a;i++) {
            System.out.println((i + 1) + " " + Array[i]);
        }
        //output dari jumlah siswa
        System.out.println("Jumlah siswa : " + a);
        System.out.println("nama 2 terbawah : " +Array[a-2]);
        System.out.println("nama 2 teratas : " +Array[1]);
        }
    }