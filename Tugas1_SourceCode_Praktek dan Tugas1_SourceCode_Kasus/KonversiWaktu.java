import java.util.Scanner;

public class KonversiWaktu
{
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan detik: ");
        int detik = sc.nextInt();

        //Menghitung detik sekarang
        int ds = detik % 3600 % 60;
        //Menghitung total menit
        int tm = detik / 60 ;
        //Menghitung menit sekarang
        int ms = detik % 3600 / 60;
        //Menghitung total jam
        int tj = detik / 36000;
         //Menghitung jam sekarang
         int js = tj % 24;

         System.out.println("Detik sekarang = " + ds + "detik");
         System.out.println("Total menit = " + tm + "menit");
         System.out.println("Menit sekarang = " + ms + "menit");
         System.out.println("Total jam = " + tj + "jam");
         System.out.println("Jam sekarang= " + tj + "jam");

         //Tampil waktu
         System.out.println("waktu("+js +":"+ ms+":" + ds +")");
    }
}