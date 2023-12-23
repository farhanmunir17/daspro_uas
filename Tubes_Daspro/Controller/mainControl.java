package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Database.Customer;
import Database.User;
import Database.Kamar;
import Database.Struk;
import Database.Strukfix;

public class mainControl {
    HashMap<Integer, Kamar> Kamars = new HashMap<Integer, Kamar>();
    ArrayList<Struk> Ostruk = new ArrayList<Struk>();
    ArrayList<Strukfix> Ostrukfix = new ArrayList<Strukfix>();
    Scanner input = new Scanner(System.in);
    HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();

    public void daftarCustomer() {
        int kodeunik = 0;
        System.out.println("");
        System.out.println("Sebelum Memesan Kamar Mohon Untuk Mengisi Data Diri Anda Terlebih Dahulu");
        System.out.print("Masukan Nama Anda : ");
        String name = input.nextLine();
        System.out.print("Masukan Email Anda : ");
        String email = input.nextLine();
        System.out.println("");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setIdcus(kodeunik + 1);

        customers.put(customer.getIdcus(), customer);
    }

    public Customer getNamaCustomer() {
        Customer customer = new Customer();
        return customers.get(customer.getIdcus());
    }

    public Customer getEmailCustomer() {
        Customer customer = new Customer();
        return customers.get(customer.getEmail());
    }

    public void InputKamar() {
        Kamar kamar1 = new Kamar();
        Kamar kamar2 = new Kamar();
        Kamar kamar3 = new Kamar();

        kamar1.setIdKamar(1).setJenisKamar("Deluxe").setharga(200000)
                .setfasilitas("Twins bed large, TV, AC, BathTub, Wastafel, Free Snack  & Cocktaill").setJumlahKamar(5);
        kamar2.setIdKamar(2).setJenisKamar("Standard").setharga(100000)
                .setfasilitas("Twins bed standard, TV, AC, BathTub, Wastafel").setJumlahKamar(5);
        kamar3.setIdKamar(3).setJenisKamar("Rakyat").setharga(50000)
                .setfasilitas("Single bed standard, TV, Kipas Angin, BathTub, Wastafel").setJumlahKamar(7);

        Kamars.put(kamar1.getIdKamar(), kamar1);
        Kamars.put(kamar2.getIdKamar(), kamar2);
    }

    public void lihatKamar() {
        System.out.println();
        System.out.println("================Daftar Kamar Casablanca================");
        for (Map.Entry<Integer, Kamar> k : Kamars.entrySet()) {
            int key = k.getKey();
            Kamar vKamar = k.getValue();
            System.out.println("");
            if (vKamar.getJumlahKamar() >= 0) {
                System.out.println("Kode Kamar :" + key);
                System.out.println("Jenis Kamar :" + vKamar.getJenisKamar());
                System.out.println("Harga Kamar :" + vKamar.getharga());
                System.out.println("Fasiitas Kamar \t:" + vKamar.getfasilitas());
                System.out.println("Jumah kamar yang tersisa : " + vKamar.getJumlahKamar());
            } else {
                System.out.println("jenis kamar ini habis");
            }
        }
    }

    public Kamar getKamar(int idKamar) {
        return Kamars.get(idKamar);
    }

    public void pesanKamar() {
        System.out.println("================Menu Pemesanan================");
        int penambahId = 0;
        int lanjut;
        do {
            penambahId++;
            System.out.println("");
            System.out.println("Masukan Kode Kamar Yang Akan di Pesan");
            int kode = input.nextInt();
            System.out.println("Masukan Jumlah Kamar Yang Akan di Pesan");
            int jmlKamar = input.nextInt();
            System.out.println("Berapa Lama Kamar Ini akan Disewa?");
            int jmlhari = input.nextInt();
            System.out.println("Lanjut Pesan? (ya=1/tidak=2)");
            lanjut = input.nextInt();
            System.out.println("");

            Kamar tkamar = getKamar(kode);
            Struk setruk = new Struk();
            setruk.setIdStruk(penambahId);
            setruk.setKamar(tkamar);
            setruk.setHargaJual(tkamar.getharga());
            setruk.setJumlahPesan(jmlKamar);
            setruk.setSubTotal(tkamar.getharga() * jmlKamar * jmlhari);
            setruk.setJumlahHari(jmlhari);
            Kamars.put(kode, tkamar.setJumlahKamar(tkamar.getJumlahKamar() - jmlKamar));
            Ostruk.add(setruk);
        } while (lanjut == 1);

        ArrayList<Struk> setruk = Ostruk;
        Strukfix fixpisan = new Strukfix();
        fixpisan.setDetilPenjualans(setruk);
        fixpisan.setIdpesanan(Ostrukfix.size() + 1);
        fixpisan.setCustomer(customers.get(1));
        fixpisan.setEmailCustomer(customers.get(1));
        fixpisan.setTotal(HitungTotalPesanan(setruk));

        Ostrukfix.add(fixpisan);

        System.out.println("PESANAN ANDA");
        tampilkanpesanan(Ostruk);
        System.out.println("Total Harga Dari Pesanan Anda adalah : " + HitungTotalPesanan(Ostruk));
        System.out.println("");

    }

    public void tampilkanpesanan(ArrayList<Struk> setruk) {
        for (Struk s : setruk) {
            System.out.println("Jenis Kamar : " + s.getKamar().getJenisKamar());
            System.out.println("Harga : " + s.getHargaJual());
            System.out.println("Jumlah : " + s.getJumlahPesan());
            System.out.println("Lama Menginap : " + s.getJumlahHari());
        }
    }

    public int HitungTotalPesanan(ArrayList<Struk> setruk) {
        int total = 0;
        int ftotal = 0;
        for (Struk s : setruk) {
            total += s.getHargaJual();
            ftotal = total * s.getJumlahHari();
        }
        return ftotal;
    }

    public void TampilkanStrukfinal() {
        System.out.println("================Struk Anda================");
        for (Strukfix s : Ostrukfix) {
            System.out.println();
            System.out.println("Nomor Pesanan : " + s.getIdpesanan());
            System.out.println("Nama Customer : " + s.getCustomer().getName());
            System.out.println("Email Customer : " + s.getEmailCustomer().getEmail());
            ArrayList<Struk> detilstruk = s.getStruks();
            tampilkanpesanan(detilstruk);
            System.out.println("Anda Dikenakan Biaya sebesar : Rp." + s.getTotal());
        }

    }

}
