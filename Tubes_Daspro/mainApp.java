import java.util.Scanner;

import Controller.mainControl;
import Database.Customer;
import Database.User;
import Database.Kamar;
import Database.Struk;

public class mainApp {
    public static void main(String[] args) {
        boolean lanjutkan = true;
        mainControl control = new mainControl();
        control.InputKamar();
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("================Selamat Datang Di Casablanca================");
        control.daftarCustomer();
        System.out.println("SILAHKAN PILIH MENU DI BAWAH INI");
        System.out.println("KETIK 1 JIKA INGIN MELIHAT KAMAR YANG ADA DI HOTEL KAMI");
        System.out.println("KETIK 2 UNTUK PESAN KAMAR");
        System.out.println("KETIK 3 UNTUK PRINT STRUK PEMESANAN");
        System.out.println("KETIK 4 UNTUK KELUAR DARI MENU");
        while (lanjutkan) {
            int pilih;
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    control.lihatKamar();
                    System.out.println("");
                    System.out.println("SILAHKAN MASUKAN KEMBALI NOMOR UNTUK PINDAH MENU ATAU KELUAR");
                    break;
                case 2:
                    control.pesanKamar();
                    System.out.println("SILAHKAN MASUKAN KEMBALI NOMOR UNTUK PINDAH MENU ATAU KELUAR");
                    break;
                case 3:
                    control.TampilkanStrukfinal();
                    System.out.println("SILAHKAN MASUKAN KEMBALI NOMOR UNTUK PINDAH MENU ATAU KELUAR");
                    break;
                case 4:
                    lanjutkan = false;
                    break;
                default:
                    System.out.println("MOHON UNTUK MENGISI NOMOR SESUAI YANG TERTERA!!!");
                    break;
            }
        }
        System.out.println("TERIMAKASIH SAMPAI JUMPA");
    }
}